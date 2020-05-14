package com.heroQuest;
import com.heroQuest.PJ.CommunPeople;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu();
        CommunPeople aventurier = menu.chooseYourCharacter();
        /*menu.chooseSpecialRules();*/
    }
}
