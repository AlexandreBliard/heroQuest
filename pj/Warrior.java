package com.heroquest.pj;

import com.heroquest.stuff.Weapons;

public class Warrior extends CommunPeople{

    public Warrior(String name, int life, Weapons weapons) {
        super(name, life, weapons);
    }
    public Warrior(String name, Weapons weapons) {
        super ( name, 5, weapons);
    }


}
/*TD : reprendre pour pouvoir mettre
directement SmallSword dans les âraùmetres de l'arme*/