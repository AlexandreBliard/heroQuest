package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;
import com.heroquest.pj.ValeurExceptions;
import com.heroquest.pnj.Request;
import com.heroquest.stuff.DrinkPotion;
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
                             ArrayList<Salle> plateaux) {
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
                    menu.inspect(aventurier, plateaux, position, keyboard);
                    break;
                case "sac" :
                    Request inTheBag = new Request();
                    inTheBag.takeBackPack(aventurier, keyboard);
                    break;
                default:
                    System.out.println("petite faute de frappe non ?");
                    break;
            }
        } while (position < plateaux.size());
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
