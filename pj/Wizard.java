package com.heroquest.pj;

import com.heroquest.stuff.MagicProjectile;
import com.heroquest.stuff.Loot;


public class Wizard extends CommunPeople implements MaxLife{

    private int maxLife;

    public Wizard(String name, Loot loot) {
        super ("magicien", name, 3,3,1, loot);
    }
    public Wizard(String name) {
        this(name, new MagicProjectile());
    }



    @Override
    public int maxLife(int level, int lifeByLevel) {
        return level*lifeByLevel;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife() {
        this.maxLife = maxLife(level, lifeByLevel);
    }
}
