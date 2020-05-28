package com.heroquest.pnj;

import com.heroquest.stuff.Loot;
import com.heroquest.stuff.Stick;

public class Goblins extends Ennemy{

    public Goblins(String type, String name, int life, Loot loot, int xp, int gold) {
        super(type, name, life, loot, xp, gold);
    }
    public Goblins() {
        this("ennemy", " un gobelin", 1, new Stick(), 2, 4);
    }
}
