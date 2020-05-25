package com.heroquest.pj;

import com.heroquest.stuff.SmallSword;
import com.heroquest.stuff.Weapons;

public class Warrior extends Ennemy {

    public Warrior(String type, String name, int life, Weapons weapons) {
        super(type, name, life, weapons);
    }
    public Warrior(String name, Weapons weapons) {
        this("guerrier",  name, 5, weapons);
    }
    public Warrior(String name) {
        this(name, new SmallSword());
    }
/*à l'occase il serait pratique de voir si interface permet de gérer
* le stuff du PJ*/
}
/*TD : reprendre pour pouvoir mettre
directement SmallSword dans les âraùmetres de l'arme*/