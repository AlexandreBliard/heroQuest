package com.heroquest.option;

import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class ChangeName {
    public void changeName(CommunPeople aventurier, Scanner keyboard) {
        System.out.println("quel nom veux-tu " +
                "prendre ?");
        System.out.println("tapez votre " +
                "nouveau nom");
        aventurier.setName(keyboard.nextLine());
        System.out.println("bienvenue à toi " +
                aventurier.getName());
    }
}
