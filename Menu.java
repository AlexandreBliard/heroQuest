package com.heroquest;

import com.heroquest.dungeon.AtTheEntry;
import com.heroquest.dungeon.Forward;
import com.heroquest.dungeon.EnterCavern;
import com.heroquest.option.Choice;
import com.heroquest.option.LeaveCavern;
import com.heroquest.option.OneOptionForGouvernAll;
import com.heroquest.pj.Ennemy;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public Ennemy chooseYouCharacter(Scanner keyboard) {
        ChooseYourCharacter start = new ChooseYourCharacter();
        return start.chooseYourCharacter(keyboard);
    }

    public void options(Ennemy aventurier, Scanner keyboard) {
        OneOptionForGouvernAll options = new OneOptionForGouvernAll();
        options.chooseSpecialRules(aventurier, keyboard);
    }

    //commande pour confirmer le début de la partie.
    public void atTheEntry(Ennemy aventurier, Scanner keyboard) {
        AtTheEntry enter = new AtTheEntry();
        enter.atTheEntry(aventurier, keyboard);
    }
    //commnande pour rentrer dans la caverne
    public void enterCavern(Ennemy aventurier, Scanner keyboard) {
        EnterCavern game = new EnterCavern();
        game.enterCavern(aventurier, keyboard);
    }

    //commande pour quitter la partie
    public void leaveCavern(Ennemy aventurier, Scanner keyboard) {
        LeaveCavern leave = new LeaveCavern();
        leave.leaveCavern(aventurier, keyboard);
    }
    //quand un booléen est demandé, façon rapide de faire
    public boolean choice(Ennemy aventurier, Scanner keyboard) {
        Choice choice = new Choice();
        return choice.choice(aventurier, keyboard);
    }

    //fait avancer le personnage
    public Integer forward(int position) {
        Forward forward = new Forward();
        return forward.forward(position);
    }
}