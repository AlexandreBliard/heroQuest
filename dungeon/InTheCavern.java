package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;
import com.heroquest.stuff.DrinkPotion;

import java.util.ArrayList;
import java.util.Scanner;

public class InTheCavern {

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
                    System.out.println("En fouillant tu découvres" +
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
                                drink.drinkPotion(aventurier, plateaux.get(position).getReward());
                                System.out.println("Tu as bu " +
                                        plateaux.get(position).getReward().getName() +
                                        "\nTu as maintenant " +
                                        aventurier.getLife() +
                                        " points de vie");
                                break;
                            default:
                                System.out.println("une erreur c'est glissé dans le programme");
                        }
                    }else {
                        System.out.println("c'est ton choix \n " +
                                "tape entrée pour continuer");
                    }


                    ;
                    break;
                default:
                    System.out.println("petite faute de frappe non ?");
                    break;
                case "boire potion":
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
