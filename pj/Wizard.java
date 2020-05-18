package com.heroquest.pj;

import com.heroquest.stuff.MagicProjectile;
import com.heroquest.stuff.Weapons;


public class Wizard extends CommunPeople{

    public Wizard(String name, Weapons weapons) {
        super (name, 3, weapons);
    }
    public Wizard(String name) {
        this(name, new MagicProjectile());

    }
}
