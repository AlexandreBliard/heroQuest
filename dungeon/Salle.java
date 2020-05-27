package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.NoOne;
import com.heroquest.stuff.*;

public class Salle {
    protected String description;
    protected CommunPeople ennemis;
    protected Weapons reward;


/*SETTER------SETTER------SETTER------SETTER------*/

    public void setDescription(String description) {
        this.description = description;
    }

    public CommunPeople setEnnemis(CommunPeople ennemis) {
        this.ennemis = ennemis;
        return ennemis;
    }

    public void setReward(Weapons reward) {
        this.reward = reward;
    }
    /*GETTER-------GETTER-------GETTER-------GETTER-------*/

    public String getDescription() {
        return description;
    }

    public CommunPeople getEnnemis() {
        return ennemis;
    }

    public Weapons getReward() {
        return reward;
    }
    /*CONSTRUCTEUR------CONSTRUCTEUR------CONSTRUCTEUR------*/

    public Salle(String description, CommunPeople ennemis, Weapons reward) {
        this.description = description;
        this.ennemis = ennemis;
        this.reward = reward;
    }
/*constructeur pour la création des cases avec descriptions
* et sans monstres*/
    public Salle(String description) {
        this.description = description;
        this.ennemis = new NoOne();
        this.reward = new LongSword();
    }


    /*constructeur temporaire tant que reward non paramétré*/
    public Salle(String description, CommunPeople ennemis) {
        this.description = description;
        this.ennemis = ennemis;
        this.reward = new HalfHandSword();
    }

    /*toSTRING ------toSTRING ------toSTRING ------*/
    @Override
    public String toString() {
        return "Tu pénètres " +
                description +
                 "\n" +
                " il y a " + ennemis +
                "\n" +
                " et il te semble apercevoir "
                + reward.getName() ;
    }

}

