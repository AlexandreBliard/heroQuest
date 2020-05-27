package com.heroquest.pnj;

import com.heroquest.stuff.Weapons;
import com.heroquest.stuff.Stick;

public class Goblins extends Ennemy{

    public Goblins(String type, String name, int life, Weapons weapons, int xp, int gold) {
        super(type, name, life, weapons, xp, gold);
    }
    public Goblins() {
        this("ennemy", " un gobelin", 1, new Stick(), 2, 4);
    }
}
