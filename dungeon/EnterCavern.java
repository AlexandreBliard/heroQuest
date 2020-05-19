package com.heroquest.dungeon;

import com.heroquest.Menu;
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
        Integer taillePlateau = 63;
        ArrayList<Salle> plateaux = new ArrayList<Salle>(taillePlateau);
        for (int i = 0; i<taillePlateau; i++) {
            Salle salle = new Salle();
            plateaux.add(salle);
        }
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
                try {
                    plateaux.get(position);//ici on décrit la pièce
                    System.out.println(plateaux.get(position));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("on avance");
                }
                System.out.println("avance avec entrée");
            }else if (input.equals("arcanes sacrés")) {
                menu.options(aventurier, keyboard);
            }
        }while (position <= plateaux.size());
        System.out.println("Sceptre de Feu acquis");
        System.out.println("voulez-vous rejouer ? " +
                "oui / non ");

        if (menu.choice(aventurier, keyboard)) {
            menu.chooseYouCharacter(keyboard);
        }else {
            menu.leaveCavern(aventurier, keyboard);
        }
    }
}
