package com.heroquest.option;

import com.heroquest.pj.Ennemy;

import java.util.Scanner;

public class Choice {

    public boolean choice(Ennemy aventurier, Scanner keyboard) {
        boolean reponse = false;
        boolean choice = false;
        do {
            String answer = keyboard.nextLine();
            if (answer.equals("oui")) {
                choice = true;
                return true;
            } else if (answer.equals("non")) {
                choice = true;
                return false;
            } else {
                System.out.println("je ne suis pas sur " +
                        "d'avoir bien compris");
            }
        } while (!choice);
        return reponse;
    }
}
