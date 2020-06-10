package com.heroquest.pnj;

import com.heroquest.pj.CommunPeople;
import com.heroquest.stuff.Loot;

public abstract class Ennemy extends CommunPeople {

    /*
    CONSTRUCTEURS============CONSTRUCTEURS============CONSTRUCTEURS============
    * */

    /*constructeur général*/
    public Ennemy(String type, String name, int life, int lifeByLevel,
                  int level, Loot loot, int xp, int gold) {
        super(type, name, life, lifeByLevel, level,loot, xp, gold);
    }

    /*constructeur pour les ennemis*/
    public Ennemy(String type, String name, int life, Loot loot, int xp, int gold) {
        this(type, name, life,15, 1,loot, xp, gold);
    }


    /*---------redéfinitions de toSTRING ici---------*/

    @Override
    public String toString() {
        return  "devant toi" + name +
                attack.getName() +
                ", que fais-tu ?";
    }
}

