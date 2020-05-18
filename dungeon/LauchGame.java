package com.heroquest.dungeon;

import com.heroquest.ChooseYourCharacter;
import com.heroquest.Dice;
import com.heroquest.option.LeaveCavern;
import com.heroquest.pj.CommunPeople;

import java.util.ArrayList;
import java.util.Scanner;

public class LauchGame {

    public LauchGame() {
    }

    public void launchGame(CommunPeople aventurier, Scanner keyboard) {
        System.out.println("vous êtes dans la caverne, " +
                "vous voyez un long couloir sombre " +
                "que la clarté de l'extérieur " +
                "ne vous permet de voir que jusqu'à " +
                "quelques mètres. Vous allumez " +
                "donc une torche et vous commencez " +
                "à avancer prudemment");
        System.out.println("appuyer sur entrée pour " +
                "faire avancer votre personnage");
        Dice move = new Dice();
        ArrayList<Integer/*DQP mettre un objet*/> plateau = new ArrayList<Integer>(63);
        int position = 0;
        do {
            String input = keyboard.nextLine();
            if (input.equals("")) {
                position = position + move.movePlayer();
                System.out.println("vous êtes " +
                        "sur la case "+ position);
            }
        }while (position <= 63 /*remplacer
                    par longueur tableau*/);
        System.out.println("Sceptre de Feu acquis");
        System.out.println("voulez-vous rejouer ? " +
                "oui / non ");
        boolean restart = false;
        do {
            String answer = keyboard.nextLine();
            if (answer.equals("oui")) {
                ChooseYourCharacter menu = new ChooseYourCharacter();
                menu.chooseYourCharacter(keyboard);
            }else if (answer.equals("non")) {
                LeaveCavern leave = new LeaveCavern();
                leave.leaveCavern(keyboard);
            }else {
                System.out.println("navré je n'ai " +
                        "pas compris votre " +
                        "commande");
            }
        }while (!restart);
    }
}
