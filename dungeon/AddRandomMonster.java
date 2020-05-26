package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;

import java.util.ArrayList;

public class AddRandomMonster {
    public void addRandomMonster(int nbMonstres, DescriptionSalle texte,
                                 CommunPeople ennemy, int randomIndexPlateau,
                                 RandomNumber randomNumber, ArrayList plateaux) {
        for (int i = 0; i<= nbMonstres; i++) {
            Salle salle = new Salle(texte.description(), ennemy);
            randomIndexPlateau = (int) randomNumber.RandomNumber(nbMonstres);
            plateaux.set(randomIndexPlateau, salle);
        }
    }
}
