package com.heroquest;

import com.heroquest.dungeon.AtTheEntry;
import com.heroquest.dungeon.Forward;
import com.heroquest.dungeon.EnterCavern;
import com.heroquest.option.Choice;
import com.heroquest.option.LeaveCavern;
import com.heroquest.option.OneOptionForGouvernAll;
import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public CommunPeople chooseYouCharacter(Scanner keyboard) {
        ChooseYourCharacter start = new ChooseYourCharacter();
        return start.chooseYourCharacter(keyboard);
    }

    public void options(CommunPeople aventurier, Scanner keyboard) {
        OneOptionForGouvernAll options = new OneOptionForGouvernAll();
        options.chooseSpecialRules(aventurier, keyboard);
    }

    //commande pour confirmer le début de la partie.
    public void atTheEntry(CommunPeople aventurier, Scanner keyboard) {
        AtTheEntry enter = new AtTheEntry();
        enter.atTheEntry(aventurier, keyboard);
    }
    //commnande pour rentrer dans la caverne
    public void enterCavern(CommunPeople aventurier, Scanner keyboard) {
        EnterCavern game = new EnterCavern();
        game.enterCavern(aventurier, keyboard);
    }

    //commande pour quitter la partie
    public void leaveCavern(CommunPeople aventurier, Scanner keyboard) {
        LeaveCavern leave = new LeaveCavern();
        leave.leaveCavern(aventurier, keyboard);
    }
    //quand un booléen est demandé, façon rapide de faire
    public boolean choice(CommunPeople aventurier, Scanner keyboard) {
        Choice choice = new Choice();
        return choice.choice(aventurier, keyboard);
    }

    //fait avancer le personnage
    public Integer forward(int position) {
        Forward forward = new Forward();
        return forward.forward(position);
    }
}