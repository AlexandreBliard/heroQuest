package com.heroQuest;

import java.util.Scanner;

public class SpecialRules {

    public void leaveCavern() {
        System.out.println("attention vous" +
                "allez quitter ce jeu génial" +
                "taper ok sur le clavier" +
                "ou taper non pour poursuivre" +
                "l'aventure");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("ok")) {
            System.out.println("j'espère te revoir");
            System.exit(0);
        }else if (input.equals("non")) {
            System.out.println("courage aventurier");
        }else {
            System.out.println("vous hésitez ? " +
                    "retaper votre message");
        }
    }
}
