package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.stuff.Weapons;

public class Salle {
    protected String salle;
    protected CommunPeople ennemis;
    protected Weapons reward;


/*SETTER------SETTER------SETTER------SETTER------*/
    public void setSalle(String salle) {
        this.salle = salle;
    }

/*CONSTRUCTEURS------CONSTRUCTEURS------CONSTRUCTEURS------*/
    public String getDescription() {
        return salle;
    }

/*toSTRING ------toSTRING ------toSTRING ------*/
    @Override
    public String toString() {
        return "Tu pénètres" +
                 salle +
                " il y a " + ennemis +
                " et il te semble apercevoir "
                + reward ;
    }
}

