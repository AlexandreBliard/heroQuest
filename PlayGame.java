package com.heroquest;

import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class PlayGame {
    public void playGame(Scanner keyboard) {
        Menu menu = new Menu();
        CommunPeople aventurier = menu.chooseYouCharacter(keyboard);
        menu.atTheEntry(aventurier, keyboard);
    }
}
