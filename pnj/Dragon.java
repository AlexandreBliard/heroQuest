package com.heroquest.pnj;

import com.heroquest.stuff.Claws;
import com.heroquest.stuff.Weapons;

public class Dragon extends Ennemy{

    public Dragon(String type, String name, int life, Weapons weapons, int xp, int gold) {
        super(type, name, life, weapons, xp, gold);
    }
    public Dragon() {
        this ("ennemy", " un dragon", 10, new Claws(), 12, 50);
    }
}
