package com.heroquest.pj;

import com.heroquest.stuff.SmallSword;
import com.heroquest.stuff.Loot;

public class Warrior extends CommunPeople {

    public Warrior(String type, String name, int life, int lifeByLevel, int level, Loot loot) {
        super(type, name, life, lifeByLevel, level, loot);
    }

    public Warrior(String name, Loot loot) {
        this("guerrier",  name, 5, 5, 1, loot);
    }

    public Warrior(String name) {
        this(name, new SmallSword());

    }
}