package com.heroquest.pj;

import com.heroquest.stuff.MagicProjectile;
import com.heroquest.stuff.Weapons;


public class Wizard extends Ennemy {

    public Wizard(String name, Weapons weapons) {
        super ("magicien", name, 3, weapons);
    }
    public Wizard(String name) {
        this(name, new MagicProjectile());
    }
}
