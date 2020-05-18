package com.heroquest.option;

import java.util.Scanner;

public class SpecialOptions {

    public SpecialOptions() {
        System.out.println("constructeur " +
                "spécialRules");
    }

    public void leaveCavern() {
        System.out.println("attention vous " +
                "allez quitter ce jeu génial " +
                "taper ok sur le clavier " +
                "ou taper non pour poursuivre " +
                "l'aventure");
        boolean exitGame = false;
        do {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("ok")) {
                System.out.println("j'espère te revoir");
                exitGame = true;
                System.exit(0);
            }else if (input.equals("non")) {
                System.out.println("courage chevalier " +
                        "crois en Athéna et dans le " +
                        "pouvoir de l'amitié !!!");
                /*mettre ici un code permettant de revenir
                * à l'état initial du code*/
            }else {
                System.out.println("vous hésitez ? " +
                        "retaper votre message " +
                        "ok pour quitter " +
                        "non pour poursuivre");
            }
        }while (!exitGame);

    }
}
