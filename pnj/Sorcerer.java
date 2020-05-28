package com.heroquest.pnj;

import com.heroquest.stuff.EnergyStick;
import com.heroquest.stuff.Loot;

public class Sorcerer extends Ennemy{
    public Sorcerer(String type, String name, int life, Loot loot, int xp, int gold) {
        super(type, name, life, loot, xp, gold);
    }
    public Sorcerer() {
        this("ennemy", " un sorcier", 3, new EnergyStick(), 4, 7);
    }
}
