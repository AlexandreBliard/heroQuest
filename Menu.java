package com.heroquest;

import com.heroquest.dungeon.*;
import com.heroquest.option.Choice;
import com.heroquest.option.LeaveCavern;
import com.heroquest.option.OneOptionForGouvernAll;
import com.heroquest.pj.CommunPeople;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * * Carrefour des déplacements c'est ici où toutes les méthodes majeurs
 *      * sont gérés et cela permet que depuis n'importe où on puisse
 *      * se rendre n'importe où également.
 *      * Cette règle est surtout utilisé pour les règles spéciales
 *      * (options) qui peut être demandé à n'importe quel moment dans
 *      * la caverne.
 */
public class Menu {


    /**
     * commande pour choisir le personnage
     * @param keyboard
     * @return
     */
    public CommunPeople chooseYouCharacter(Scanner keyboard) {
        ChooseYourCharacter start = new ChooseYourCharacter();
        return start.chooseYourCharacter(keyboard);
    }

    /**
     * commande pour les options (statistique perso, quitter
     * la partie
     * @param aventurier
     * @param keyboard
     */
    public void options(CommunPeople aventurier, Scanner keyboard) throws NoSuchFieldException {
        OneOptionForGouvernAll options = new OneOptionForGouvernAll();
        options.chooseSpecialRules(aventurier, keyboard);
    }

    /**
     * commande pour confirmer le début de la partie.
     * @param aventurier
     * @param keyboard
     * @throws NoSuchFieldException
     */
    public void atTheEntry(CommunPeople aventurier, Scanner keyboard) throws NoSuchFieldException {
        AtTheEntry enter = new AtTheEntry();
        enter.atTheEntry(aventurier, keyboard);
    }

    /**
     * commnande pour rentrer dans la caverne
     * @param aventurier
     * @param keyboard
     * @throws NoSuchFieldException
     */
    public void enterCavern(CommunPeople aventurier, Scanner keyboard) throws NoSuchFieldException {
        EnterCavern game = new EnterCavern();
        game.enterCavern(aventurier, keyboard);
    }

    /**
     * commande pour avancer de salle en salle dans la caverne
     * @param aventurier
     * @param keyboard
     * @param plateaux
     * @throws NoSuchFieldException
     */
    public void inTheCavern(CommunPeople aventurier, Scanner keyboard,
                            ArrayList<Salle> plateaux) throws NoSuchFieldException {
        InTheCavern cavern = new InTheCavern();
        cavern.inTheCavern(aventurier, keyboard, plateaux);
    }

    /**
     * commande pour quitter la partie
     * @param aventurier
     * @param keyboard
     */
    public void leaveCavern(CommunPeople aventurier, Scanner keyboard) {
        LeaveCavern leave = new LeaveCavern();
        leave.leaveCavern(aventurier, keyboard);
    }

    /**
     * quand un booléen est demandé, façon rapide de le faire
     * @param aventurier
     * @param keyboard
     * @return
     */
    public boolean choice(CommunPeople aventurier, Scanner keyboard) {
        Choice choice = new Choice();
        return choice.choice(aventurier, keyboard);
    }

    /**
     * fait avancer le personnage
     * @param position
     * @return
     */
    public Integer forward(int position) {
        Forward forward = new Forward();
        return forward.forward(position);
    }

    /**
     * création du plateau de jeu qui s'appelle caverne
     * @return
     * @throws NoSuchFieldException
     */
    public ArrayList<Salle> Cavern() throws NoSuchFieldException {
        Cavern cavern = new Cavern();
        return cavern.Cavern();
    }

    /**
     * début de l'aventure - permet de rejouer
     * @param keyboard
     * @throws NoSuchFieldException
     */
    public void startGame(Scanner keyboard) throws NoSuchFieldException {
        PlayGame game = new PlayGame();
        game.playGame(keyboard);
    }
}