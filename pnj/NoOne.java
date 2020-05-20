package com.heroquest.pnj;

import com.heroquest.stuff.NoWeapons;
import com.heroquest.stuff.Weapons;

public class NoOne extends Ennemy{
    public NoOne(String type, String name, int life, Weapons weapons, int xp, int gold) {
        super(type, name, life, weapons, xp, gold);
    }
    public NoOne() {
        this("personne", "personne", 0, new NoWeapons(), 0, 0);
    }
}
