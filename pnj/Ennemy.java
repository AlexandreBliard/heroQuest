package com.heroquest.pnj;

import com.heroquest.pj.CommunPeople;
import com.heroquest.stuff.Loot;

public abstract class Ennemy extends CommunPeople {

    //nouveau attributs
    int xp;//xp gagnés quand on a vaincu l'ennemi
    int gold;// gold gagné quand on a vaincu l'ennemi

    public Ennemy(String type, String name, int life, Loot loot) {
        super(type, name, life, loot);
    }

    public Ennemy(String type, String name, int life, Loot loot, int xp, int gold) {
        super(type, name, life, loot);
        this.xp = xp;
        this.gold = gold;
    }
    /*---------redéfinitions de toSTRING ici---------*/

    @Override
    public String toString() {
        return  "devant toi" + name +
                attack.getName() +
                ", que fais-tu ?";
    }
}

