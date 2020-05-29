package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.NoOne;
import com.heroquest.stuff.*;

public class Salle {
    protected String description;
    protected CommunPeople ennemis;
    protected Loot reward;


/*SETTER------SETTER------SETTER------SETTER------*/

    public void setDescription(String description) {
        this.description = description;
    }

    public CommunPeople setEnnemis(CommunPeople ennemis) {
        this.ennemis = ennemis;
        return ennemis;
    }

    public void setReward(Loot reward) {
        this.reward = reward;
    }
    /*GETTER-------GETTER-------GETTER-------GETTER-------*/

    public String getDescription() {
        return description;
    }

    public CommunPeople getEnnemis() {
        return ennemis;
    }

    public Loot getReward() {
        return reward;
    }
    /*CONSTRUCTEUR------CONSTRUCTEUR------CONSTRUCTEUR------*/

    /*constructeur utilisé dans le AddRandomMonstre*/
    public Salle(String description, CommunPeople ennemis, Loot reward) {
        this.description = description;
        this.ennemis = ennemis;
        this.reward = reward;
    }
/*constructeur pour la création des cases avec descriptions et récompenses
* et sans monstres*/
    public Salle(String description, Loot reward) {
        this.description = description;
        this.ennemis = new NoOne();
        this.reward = reward;
    }




    /*toSTRING ------toSTRING ------toSTRING ------*/
    @Override
    public String toString() {
        return "Tu pénètres " +
                description +
                 "\n" +
                " il y a " + ennemis;
    }

}

