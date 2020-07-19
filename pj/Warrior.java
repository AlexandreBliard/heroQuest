package com.heroquest.pj;

import com.heroquest.stuff.SmallSword;
import com.heroquest.stuff.Loot;

public class Warrior extends CommunPeople {

    public Warrior(String name, Loot loot) {
        super("guerrier",  name, 5, 5, 1, loot, 0, 0);
    }

    public Warrior(String name) {
        this(name, new SmallSword());
    }
}