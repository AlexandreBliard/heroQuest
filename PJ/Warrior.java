package com.heroQuest.PJ;

import com.heroQuest.stuff.Weapons;

public class Warrior extends CommunPeople{

    public Warrior() {
        /*constructeur ss para*/
        this.name = "";
        this.life = 5;
        this.attack = this.weapons;
    }
    public Warrior(String nameC) {
        this.name=nameC;
        this.life = 5;
        this.attack = this.weapons;
    }
    public Warrior(String nameC, int lifeC,
                   Weapons attackC) {
    this.name=nameC;
    this.life=lifeC;
    this.attack=attackC;
    }
}
