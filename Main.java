package com.heroquest;
import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Menu menu = new Menu();
        CommunPeople aventurier = menu.crossRoad(sc);
        if (input.equals("arcanes sacrés")) {
            menu.chooseSpecialRules(aventurier, sc);
        }
        menu.enterCavern(aventurier, sc);
    }
}
