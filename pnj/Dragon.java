package com.heroquest.pnj;

import com.heroquest.stuff.Claws;
import com.heroquest.stuff.Loot;

public class Dragon extends Ennemy{

    public Dragon(String type, String name, int life, Loot loot, int xp, int gold) {
        super(type, name, life, loot, xp, gold);
    }
    public Dragon() {
        this ("ennemy", " un dragon", 10, new Claws(), 12, 50);
    }
}
