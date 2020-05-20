package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.NoOne;
import com.heroquest.stuff.Weapons;

public class Salle {
    protected String description;
    protected CommunPeople ennemis;
    protected Weapons reward;


/*RETEX--------RETEX--------RETEX--------RETEX--------RETEX--------RETEX--------
* ne pas mettre une valeur directement dans la déclaration d'attribut
* */


    public CommunPeople enemy() {
        return setEnnemis(new NoOne());
    }
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

