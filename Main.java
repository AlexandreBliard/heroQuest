package com.heroquest;
import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        CommunPeople aventurier = menu.crossRoad(sc);
        menu.options(aventurier, sc);/*à l'occase le mettre au bon endroit ça
        CàD accessible dans le jeu*/
        menu.enterCavern(aventurier, sc);
    }
}
