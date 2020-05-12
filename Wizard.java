package com.heroQuest;

import java.util.Scanner;

public class Wizard extends CommunPeople{


    public Wizard() {
        /*constructeur ss para*/
    }
    public Wizard(String nameC) {
        this.name=nameC;
        //constructeur avec 1 para
    }
    public Wizard(String nameC, int lifeC,
                   int attackC) {
        this.name=nameC;
        this.life=lifeC;
        this.attack=attackC;
    }



    /*tu en est arrêté au moment ou tu rentrais les par
     * amètres du constructeur tu te posais la question
     * si cela ne fait pas trop de variable pour
     * pas grznd chose*/
}
