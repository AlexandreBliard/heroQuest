package com.heroquest;

import com.heroquest.pj.Ennemy;

import java.util.Scanner;

public class PlayGame {
    public void playGame(Scanner keyboard) {
        Menu menu = new Menu();
        Ennemy aventurier = menu.chooseYouCharacter(keyboard);
        menu.atTheEntry(aventurier, keyboard);
    }
}
