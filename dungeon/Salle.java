package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.stuff.Weapons;

public class Salle {
    protected String description;
    protected CommunPeople ennemis;
    protected Weapons reward;

    @Override
    public String toString() {
        return "Tu pénètres" +
                 description +
                " il y a " + ennemis +
                " et il te semble apercevoir "
                + reward ;
    }
}

