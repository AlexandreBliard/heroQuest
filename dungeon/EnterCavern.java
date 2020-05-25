package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.Goblins;

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
                "quelques mètres. tu allumes " +
                "donc une torche et tu commences " +
                "à avancer prudemment");
        System.out.println("tu entends au loin " +
                "le sage te dire : 'si tu es " +
                "perdu tape arcanes sacrés'");
        System.out.println("appuyer sur entrée pour " +
                "faire avancer votre personnage");
        int taillePlateau = 63;
        int nbGobelin = taillePlateau / 3;
        Integer nbSorcerer = taillePlateau / 8;
        Integer nbDragon = taillePlateau / 20;
        DescriptionSalle texte = new DescriptionSalle();
        RandomEnnemy ennemy = new RandomEnnemy();
        CommunPeople goblins = new Goblins();
        ArrayList<Salle> plateaux = new ArrayList<Salle>(taillePlateau);
        for (int i = 0; i<=taillePlateau; i++) {//boucle créations du plateaux
            Salle salle = new Salle(texte.description(), ennemy.randomEnnemy());

            plateaux.add(salle);
         }
        System.out.println(plateaux);


        int position = 0;
        /*
        ----CE QUE JE VEUX FAIRE-----CE QUE JE VEUX FAIRE-----CE QUE JE VEUX FAIRE-----
        j'arrive maintenant à mettre description et monstres sur les cases.
        L'idée est que la création de tels monstres dépend de la position dans le
        ArrayList, par exemple les gobelins et noOne peuvent être partout, les sorciers sur la moitié
        du plateau, les dragons sur le quart restant
        qqch comme for (int i = 0; i<nombre possible de monstres; i++) {
            plateaux.set(random taillePlateau, new Gobelins)
            }
            bon pour un gobelins c'est simple ils sont "partout"
            mais pour les sorciers qui ne peuvent apparaitre QUE à partir de Salle (taillePlateaux * 0,75)
            comment faire ? car du coup le résultat est inversé (de 1 à 48 ou
            ALORS : Salle (taillePlateau - taillePlateau * 0,75) soit 64 - 48 = 16
            OU ALORS if (random taille Plateau < taillePlateau *0,75){
             random taille Plateau + taillePlateau*0,75
             }else {fais ta vie}
             il faut aussi vérifier que le ArrayList est vide :
            while (plateaux valeur ennemy == noOne) { create a new ennemy}


            noOne = taille plateau(nb gobelins + nb sorciers + nb dragons)
            Sinon il n'y a QUE des noOne et après on en met pardessus, oui
            c'est plus simple et logique. donc dans Salle.java, ennemy = new noOne

            TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST
            int randomIndexPlateau = 0;
            RandomNumber randomNumber = new RandomNumber();
            if (i == taillePlateau) {//dès que toutes les salles sont crées on implémente les ennemis

                for (int j = 0; j<nbGobelin; j++) {
                    randomIndexPlateau = (int) randomNumber.RandomNumber(nbGobelin);
                    plateaux.set(randomIndexPlateau, salle.setEnnemis(goblins));
                }
            }
        */
        do {
            String input = keyboard.nextLine();
            if (input.equals("")) {
                position = menu.forward(position);
                try {
                    plateaux.get(position);//ici on décrit la pièce
                    System.out.println(plateaux.get(position));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("tu trouves le sceptre de Feu");
                }
                System.out.println("avance avec entrée");
            }else if (input.equals("arcanes sacrés")) {
                menu.options(aventurier, keyboard);
            }else {
                System.out.println("petite faute de frappe non ?");
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
