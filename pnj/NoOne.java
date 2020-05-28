package com.heroquest.pnj;

import com.heroquest.stuff.NoWeapons;
import com.heroquest.stuff.Loot;

public class NoOne extends Ennemy{
    public NoOne(String type, String name, int life, Loot loot, int xp, int gold) {
        super(type, name, life, loot, xp, gold);
    }
    public NoOne() {
        this("personne", " personne", 0, new NoWeapons(), 0, 0);
    }
}
