package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.NoOne;
import com.heroquest.stuff.Stick;
import com.heroquest.stuff.Weapons;

public class Salle {
    protected String description;
    protected CommunPeople ennemis;
    protected Weapons reward;


/*RETEX--------RETEX--------RETEX--------RETEX--------RETEX--------RETEX--------
* ne pas mettre une valeur directement dans la déclaration d'attribut
* */


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
    public Salle(String description, CommunPeople ennemis) {
        this.description = description;
        this.ennemis = ennemis;
        this.reward = new Stick();
    }

    /*toSTRING ------toSTRING ------toSTRING ------*/
    @Override
    public String toString() {
        return "Tu pénètres " +
                description +
                " il y a " + ennemis +
                " et il te semble apercevoir "
                + reward ;
    }

}

