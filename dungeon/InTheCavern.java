package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cette classe permet de gérer le choix du joueur, son
 * avancé dans la caverne, de vérifier ce que contient son sac
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
                        plateaux.get(position);//ici on décrit la Salle
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
                    menu.takeBackPack(aventurier, keyboard, position, plateaux);
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
