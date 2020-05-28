package com.heroquest.pj;

import com.heroquest.stuff.SmallSword;
import com.heroquest.stuff.Loot;

public class Warrior extends CommunPeople {

    public Warrior(String type, String name, int life, Loot loot) {
        super(type, name, life, loot);
    }
    public Warrior(String name, Loot loot) {
        this("guerrier",  name, 5, loot);
    }
    public Warrior(String name) {
        this(name, new SmallSword());
    }
/*à l'occase il serait pratique de voir si interface permet de gérer
* le stuff du PJ*/
}
/*TD : reprendre pour pouvoir mettre
directement SmallSword dans les âraùmetres de l'arme*/