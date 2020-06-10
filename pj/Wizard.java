package com.heroquest.pj;

import com.heroquest.stuff.MagicProjectile;
import com.heroquest.stuff.Loot;


public class Wizard extends CommunPeople {


    public Wizard(String name, Loot loot) {
        super ("magicien", name, 3,3,1, loot, 0, 0); }

    public Wizard(String name) {
        this(name, new MagicProjectile());
    }

}
