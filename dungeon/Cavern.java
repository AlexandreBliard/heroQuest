package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.Dragon;
import com.heroquest.pnj.Goblins;
import com.heroquest.pnj.Sorcerer;

import java.util.ArrayList;

public class Cavern {

    public ArrayList<Salle> Cavern() throws NoSuchFieldException {

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
                random.addRandomMonster(nbDragon, texte, dragon, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqDragon);
                random.addRandomMonster(nbSorcerer, texte, sorcerer, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqSorcerer);
                random.addRandomMonster(nbGobelin, texte, goblins, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqGobelin);
            }
        }
        return plateaux;
    }
}
