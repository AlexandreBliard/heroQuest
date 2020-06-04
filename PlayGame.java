package com.heroquest;

import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

/**
 * la méthode playGame va s'occuper de générer un aventurier
 * grâce à la méthode chooseYourCharacter qui prend en paramètre
 * le scanner via l'appellation keyboard. Ce nom de paramètre est
 * le même pour TOUS le programme
 *
 * on renvoie ensuite dans la méthode atTheEntry l'aventurier et encore
 * une fois le keyboard.
 */
public class PlayGame {
    public void playGame(Scanner keyboard)  {
        Menu menu = new Menu();
        CommunPeople aventurier = menu.chooseYouCharacter(keyboard);
        menu.atTheEntry(aventurier, keyboard);
    }
}
