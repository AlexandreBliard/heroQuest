package com.heroQuest;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String inputSpecialRule = sc.nextLine();
        Menu menu = new Menu();
        CommunPeople aventuirer = menu.chooseYourCharacter();
        if (inputSpecialRule.equals("arcane sacrés")) {
            menu.chooseSpecialRules();
        }

    }
}
