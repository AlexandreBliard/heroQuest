package com.heroQuest;

import java.util.Scanner;

public class Wizard extends CommunPeople{


    public Wizard() {
        /*constructeur ss para*/
        this.name = "";
        this.life = 5;
        this.attack = 8;
    }
    public Wizard(String nameC) {
        this.name=nameC;
        this.life = 5;
        this.attack = 8;
        //constructeur avec 1 para
    }
    public Wizard(String nameC, int lifeC,
                   int attackC) {
        this.name=nameC;
        this.life=lifeC;
        this.attack=attackC;
    }
}
