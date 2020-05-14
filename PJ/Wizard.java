package com.heroQuest.PJ;

import com.heroQuest.stuff.MagicProjectile;
import com.heroQuest.stuff.Weapons;

public class Wizard extends CommunPeople{

    public Wizard() {
        /*constructeur ss para*/
        this.name = "";
        this.life = 3;
        this.attack = this.weapons;
    }
    public Wizard(String nameC) {
        this.name=nameC;
        this.life = 3;
        this.attack = this.weapons;
        //constructeur avec 1 para
    }
    public Wizard(String nameC,
                   Weapons attackC) {
        this.name=nameC;
        this.life= 3;
        this.attack= attackC;
    }
}
