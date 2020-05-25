package com.heroquest.option;

import com.heroquest.Menu;
import com.heroquest.pj.Ennemy;

import java.util.Scanner;

public class LeaveCavern{

    public LeaveCavern() {

    }

    public void leaveCavern(Ennemy aventurier, Scanner keyboard) {
        System.out.println("attention vous " +
                "allez quitter ce jeu génial " +
                "taper oui sur le clavier " +
                "ou taper non pour poursuivre " +
                "l'aventure");
        Menu menu = new Menu();

        if (menu.choice(aventurier, keyboard)) {
            System.out.println("j'espère te revoir");
            System.exit(0);
        }else {
            System.out.println("courage chevalier " +
                    "crois en Athéna et dans le " +
                    "pouvoir de l'amitié !!!");
            /*mettre ici un code permettant de revenir
             * à l'état initial du code*/
        }
    }
}
