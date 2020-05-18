package com.heroquest;

import com.heroquest.dungeon.Cavern;
import com.heroquest.option.Choice;
import com.heroquest.option.OneOptionForGouvernAll;
import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public CommunPeople crossRoad(Scanner keyboard) {
        ChooseYourCharacter start = new ChooseYourCharacter();
        return start.chooseYourCharacter(keyboard);
    }

    public void options(CommunPeople aventurier, Scanner keyboard) {
        OneOptionForGouvernAll options = new OneOptionForGouvernAll();
        options.chooseSpecialRules(aventurier, keyboard);
    }

    public void enterCavern(CommunPeople aventurier, Scanner keyboard) {
        Cavern enter = new Cavern();
        enter.enterCavern(aventurier, keyboard);
    }

    public boolean choice(CommunPeople aventurier, Scanner keyboard) {
        Choice choice = new Choice();
        return choice.choice(aventurier, keyboard);
    }
}