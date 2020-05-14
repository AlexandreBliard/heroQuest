package com.heroQuest;
import com.heroQuest.PJ.CommunPeople;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        CommunPeople aventurier = menu.chooseYourCharacter();
        menu.chooseSpecialRules(aventurier);
    }
}
