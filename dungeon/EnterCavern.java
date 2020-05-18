package com.heroquest.dungeon;

import com.heroquest.ChooseYourCharacter;
import com.heroquest.Dice;
import com.heroquest.Menu;
import com.heroquest.option.LeaveCavern;
import com.heroquest.pj.CommunPeople;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterCavern {

    public EnterCavern() {
    }
    Menu menu = new Menu();
    public void enterCavern(CommunPeople aventurier, Scanner keyboard) {
        System.out.println("vous êtes dans la caverne, " +
                "vous voyez un long couloir sombre " +
                "que la clarté de l'extérieur " +
                "ne vous permet de voir que jusqu'à " +
                "quelques mètres. Vous allumez " +
                "donc une torche et vous commencez " +
                "à avancer prudemment");
        System.out.println("vous entendez au loin " +
                "le sage vous dire : 'si tu es " +
                "perdu tape arcanes sacrés'");
        System.out.println("appuyer sur entrée pour " +
                "faire avancer votre personnage");
        Dice move = new Dice();
        ArrayList<CommunPeople> plateau = new ArrayList<CommunPeople>(63);
        int position = 0;
        /*----CE QUE JE VEUX FAIRE-----CE QUE JE VEUX FAIRE-----CE QUE JE VEUX FAIRE-----
        * il faut que la position du joueur soit égal à la position de l'arrayList
        * pour cela il faut créer un nouvel emplacement dont la position array = position
        * du jouer ET delete la position précédente (soit chiffre-dés)
        * Dans un deuxième temps il faut mettre un sous-tableau pour description,
        * monstres, trésors etc ...*/
        do {
            String input = keyboard.nextLine();
            if (input.equals("")) {
                position = menu.forward(position);
            }else if (input.equals("arcanes sacrés")) {
                menu.options(aventurier, keyboard);
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
                leave.leaveCavern(aventurier, keyboard);
            }else {
                System.out.println("navré je n'ai " +
                        "pas compris votre " +
                        "commande");
            }
        }while (!restart);
    }
}
