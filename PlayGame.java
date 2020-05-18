package com.heroquest;

import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class PlayGame {
    public void playGame(Scanner keyboard) {
        Menu menu = new Menu();
        CommunPeople aventurier = menu.crossRoad(keyboard);
        menu.options(aventurier, keyboard);/*à l'occase le mettre au bon endroit
        CàD accessible dans le jeu*/
        menu.atTheEntry(aventurier, keyboard);
    }
}
