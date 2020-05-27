package com.heroquest.pnj;

import com.heroquest.stuff.EnergyStick;
import com.heroquest.stuff.Weapons;

public class Sorcerer extends Ennemy{
    public Sorcerer(String type, String name, int life, Weapons weapons, int xp, int gold) {
        super(type, name, life, weapons, xp, gold);
    }
    public Sorcerer() {
        this("ennemy", " un sorcier", 3, new EnergyStick(), 4, 7);
    }
}
