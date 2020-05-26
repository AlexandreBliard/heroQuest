package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.Dragon;
import com.heroquest.pnj.Goblins;
import com.heroquest.pnj.Sorcerer;

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
        double fqGobelin = 0.90;
        double fqSorcerer = 0.65;
        double fqDragon = 0.15;
        int nbGobelin = taillePlateau / 4;
        int nbSorcerer = taillePlateau / 8;
        int nbDragon = taillePlateau / 16;
        DescriptionSalle texte = new DescriptionSalle();
        CommunPeople goblins = new Goblins();
        CommunPeople sorcerer = new Sorcerer();
        CommunPeople dragon = new Dragon();
        ArrayList<Salle> plateaux = new ArrayList<Salle>(taillePlateau);
        for (int i = 0; i<=taillePlateau; i++) {//boucle créations du plateaux
            Salle salle = new Salle(texte.description());//salle avec description aléatoire et sans ennemi
            plateaux.add(salle);
            if (i == taillePlateau) {
                int randomIndexPlateau = 0;
                RandomNumber randomNumber = new RandomNumber();
                AddRandomMonster random = new AddRandomMonster();
                random.addRandomMonster(nbDragon, texte, dragon, randomIndexPlateau, randomNumber, plateaux, taillePlateau, fqDragon);
                random.addRandomMonster(nbSorcerer, texte, sorcerer, randomIndexPlateau, randomNumber, plateaux, taillePlateau, fqSorcerer);
                random.addRandomMonster(nbGobelin, texte, goblins, randomIndexPlateau, randomNumber, plateaux, taillePlateau, fqGobelin);
            }
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


             J'arrive à générer aléatoirement une description de salle et un
            ennemi mais je n'arrive pas encore à choisir la fréquence de ce dernier.
            Je pense qu'il faut que je crée tout un plateau avec l'ennemi noOne
            (qui correspond à il n'y a personne dans cette salle) + description de la
            salle et que quand j'assigne les monstres il me faut un constructeur
            qui prendra tout de suite en compte l'ennemi désiré via un paramètre
             de constructeur, le tout sur une boucle for. Ainsi je recréer une salle
             AVEC une description. L'idée est de pouvoir tester s'il y a un ennemi
             dans cette salle. Si ennemi => on va plus loin. Si noOne => nouvel ennemi.
             Mais comme dit hier avec Flo cela pourrait être sans fin par moment,
             du coup associé la méthode shuffle() à
            cette solution afin que la part  CPU ne soit pas trop importante.

            noOne = taille plateau(nb gobelins + nb sorciers + nb dragons)
            Sinon il n'y a QUE des noOne et après on en met pardessus, oui
            c'est plus simple et logique. donc dans Salle.java, ennemy = new noOne

            TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST

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
