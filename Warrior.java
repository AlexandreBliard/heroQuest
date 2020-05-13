package com.heroQuest;

import java.util.Scanner;

public class Warrior extends CommunPeople{

    public Warrior() {
        /*constructeur ss para*/
    }
    public Warrior(String nameC) {
        this.name=nameC;
    }
    public Warrior(String nameC, int lifeC,
                   int attackC) {
    this.name=nameC;
    this.life=lifeC;
    this.attack=attackC;
    }




}
