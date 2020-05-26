package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.NoOne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class AddRandomMonster {
    public void addRandomMonster(int nbMonstres, DescriptionSalle texte,
                                 CommunPeople ennemy, int randomIndexPlateau,
                                 RandomNumber randomNumber, ArrayList<Salle> plateaux,
                                 int taillePlateau, double fq) throws NoSuchFieldException {
        for (int i = 0; i< nbMonstres; i++) {
            Salle salle = new Salle(texte.description(), ennemy);
            randomIndexPlateau = (int) randomNumber.RandomNumber(taillePlateau, fq);
            if (( plateaux.get(randomIndexPlateau)).getEnnemis().getType().equals("personne")) {
                plateaux.set(randomIndexPlateau, salle);
            }else {
                i --;
            }
        }
    }
}
/*
    TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST
* if (plateaux.contains(salle.ennemis.getType().equals(ennemy.getType()))) {
                plateaux.set(randomIndexPlateau, salle);
            }else {
                i --;
            }
*
    Collections.shuffle(plateaux, new Random(randomIndexPlateau));
            plateaux.set(randomIndexPlateau, salle);
*/