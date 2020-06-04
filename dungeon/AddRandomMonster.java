package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;

import java.util.ArrayList;

public class AddRandomMonster {
    public void addRandomMonster(int nbMonstres, DescriptionSalle texte, RandomReward loot,
                                 CommunPeople ennemy, int randomIndexPlateau,
                                 RandomNumber randomNumber, ArrayList<Salle> plateaux,
                                 int taillePlateau, double fq) {
        for (int i = 0; i< nbMonstres; i++) {
            Salle salle = new Salle(texte.description(), ennemy, loot.reward());
            randomIndexPlateau = (int) randomNumber.RandomNumber(taillePlateau, fq);
            if (( plateaux.get(randomIndexPlateau)).getEnnemis().getType().equals("personne")) {
                plateaux.set(randomIndexPlateau, salle);
            }else {
                i --;
            }
        }
    }
}
