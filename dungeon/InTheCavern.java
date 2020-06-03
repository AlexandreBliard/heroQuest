package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;
import com.heroquest.pj.ValeurExceptions;
import com.heroquest.pj.MaxLife;
import com.heroquest.pnj.Connect;
import com.heroquest.pnj.Request;
import com.heroquest.stuff.DrinkPotion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cette méthode est très longue et va faire l'objet d'un réfactor dans
 * pas longtemps : elle gère le lancer de dés, la position du joueur
 * dans la caverne, ce qu'il y a dans la Salle, l'interaction avec
 * celle-ci et bientôt les combats
 * elle est également en lien avec les règles spéciales
 */
public class InTheCavern{

    private int position = 0;

    public void inTheCavern (CommunPeople aventurier, Scanner keyboard,
                             ArrayList<Salle> plateaux) throws NoSuchFieldException {
        Menu menu = new Menu();
        do {
            String input = keyboard.nextLine();
            switch (input) {
                case "":
                    position = menu.forward(position);
                    try {
                        plateaux.get(position);//ici on décrit la pièce
                        System.out.println(plateaux.get(position));
                    } catch (IndexOutOfBoundsException e) {//exception de sortie du jeu
                        System.out.println("tu trouves le sceptre de Feu");
                    }
                    System.out.println("avance avec entrée ou fouille la salle");
                    break;
                case "arcanes sacrés":
                    menu.options(aventurier, keyboard);
                    break;
                case "fouille":
                    System.out.println("En fouillant tu découvres " +
                            plateaux.get(position).getReward().getName() +
                            "\n veux-tu l'utiliser ? oui/non");
                    if (menu.choice(aventurier, keyboard)) {
                        switch (plateaux.get(position).getReward().getType()) {
                            case "weapon":
                                if (plateaux.get(position).getReward().getPour().equals(aventurier.getType())) {
                                    /*le if vérifie si l'arme est bien pour cet aventurier*/
                                    aventurier.setAttack(plateaux.get(position).getReward());
                                    System.out.println("tu as équipé " +
                                            aventurier.getAttack().getName() +
                                            " tu fais maintenant " +
                                            aventurier.getAttack().getDamage() +
                                            " points de dégâts");
                                }
                                else {
                                    System.out.println("désolé " + aventurier.getName() +
                                            " mais " + plateaux.get(position).getReward().getName() +
                                            " n'est pas faite pour un " + aventurier.getType() +
                                            "\n tape entrée pour continuer");
                                }
                                break;
                            case "potion":
                                DrinkPotion drink = new DrinkPotion();
                                    try {
                                        drink.drinkPotion(aventurier, plateaux.get(position).getReward());
                                    } catch (ValeurExceptions e) {
                                        aventurier.setLife(MaxLife.maxLife(aventurier.getLevel(), aventurier.getLifeByLevel()));
                                    }
                                System.out.println("Tu as bu " +
                                        plateaux.get(position).getReward().getName() +
                                        "\nTu as maintenant " +
                                        aventurier.getLife() +
                                        " points de vie");
                                break;
                            case "gold":
                                System.out.println("tu trouves " + plateaux.get(position).getReward().getPrice() +
                                        " pièces d'or");
                                break;
                            case "dust":
                            case "trash":
                                System.out.println(" tu trouves " + plateaux.get(position).getReward().getName());
                                break;
                            case "noting":
                                System.out.println(plateaux.get(position).getReward().getName() + " " +
                                        aventurier.getName() + " Snow") ;
                                break;
                            default:
                                System.out.println("une erreur c'est glissé dans le programme");
                        }
                    }else {
                        System.out.println("on le met quand même dans le sac \n " +
                                "tape entrée pour continuer");
                        Request inTheBag = new Request();
                        inTheBag.addBackPack(plateaux, position);
                    }


                    ;
                    break;
                case "sac" :
                    Request inTheBag = new Request();
                    inTheBag.takeBackPack(keyboard);
                    break;
                default:
                    System.out.println("petite faute de frappe non ?");
                    break;
            }
        }while (position < plateaux.size());
        System.out.println("Sceptre de Feu acquis");
        System.out.println("voulez-vous rejouer ? " +
                "oui / non ");

        if (menu.choice(aventurier, keyboard)) {
            menu.startGame(keyboard);
        }else {
            menu.leaveCavern(aventurier, keyboard);
        }
    }
}
