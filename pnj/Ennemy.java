package com.heroquest.pnj;

import com.heroquest.pj.CommunPeople;
import com.heroquest.stuff.Weapons;

public abstract class Ennemy extends CommunPeople {

    //nouveau attributs
    int xp;//xp gagnés quand on a vaincu l'ennemi
    int gold;// gold gagné quand on a vaincu l'ennemi

    public Ennemy(String type, String name, int life, Weapons weapons) {
        super(type, name, life, weapons);
    }

    public Ennemy(String type, String name, int life, Weapons weapons, int xp, int gold) {
        super(type, name, life, weapons);
        this.xp = xp;
        this.gold = gold;
    }
    /*---------redéfinitions de toSTRING ici---------*/

    @Override
    public String toString() {
        return "tu as devant toi un " + name +
                " qui est armé d'" + attack.getName() +
                " que fais-tu ?";
    }
}

