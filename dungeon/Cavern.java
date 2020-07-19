package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.Dragon;
import com.heroquest.pnj.Goblins;
import com.heroquest.pnj.Sorcerer;

import java.util.ArrayList;

public class Cavern {
    /**
     * génération de la caverne, utilisera le constructeur
     * de Salle pour générer salle par salle la taille de
     * la caverne définit suivant la variable taillePlateau
     * qui ensuite générera le nombre de monstres et qui ensuite
     * effectuera la répartition dans les Salles sachant
     * que les dernières auront les ennemis les plus puissants
     * et qu'une méthode vérifie la présence d'un ennemi.
     * @return
     * @throws NoSuchFieldException
     */
    public ArrayList<Salle> salles()  {

        int taillePlateau = 63;
        double fqGobelin = 0.90;
        double fqSorcerer = 0.65;
        double fqDragon = 0.15;
        int nbGobelin = taillePlateau / 4;
        int nbSorcerer = taillePlateau / 8;
        int nbDragon = taillePlateau / 16;
        DescriptionSalle texte = new DescriptionSalle();
        RandomReward loot = new RandomReward();
        CommunPeople goblins = new Goblins();
        CommunPeople sorcerer = new Sorcerer();
        CommunPeople dragon = new Dragon();
        ArrayList<Salle> plateaux = new ArrayList<Salle>(taillePlateau);
        for (int i = 0; i<=taillePlateau; i++) {//boucle créations du plateaux
            Salle salle = new Salle(texte.description(), loot.reward());//salle avec description & loot aléatoire et sans ennemi
            plateaux.add(salle);
            if (i == taillePlateau) {
                int randomIndexPlateau = 0;
                RandomNumber randomNumber = new RandomNumber();
                AddRandomMonster random = new AddRandomMonster();
                random.addRandomMonster(nbDragon, texte, loot, dragon, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqDragon);
                random.addRandomMonster(nbSorcerer, texte, loot, sorcerer, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqSorcerer);
                random.addRandomMonster(nbGobelin, texte, loot, goblins, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqGobelin);
            }
        }
        return plateaux;
    }
}
