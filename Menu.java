package com.heroquest;

import com.heroquest.dungeon.*;
import com.heroquest.option.Choice;
import com.heroquest.option.LeaveCavern;
import com.heroquest.option.OneOptionForGouvernAll;
import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.Request;

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
    public void options(CommunPeople aventurier, Scanner keyboard) {
        OneOptionForGouvernAll options = new OneOptionForGouvernAll();
        options.chooseSpecialRules(aventurier, keyboard);
    }

    /**
     * commande pour confirmer le début de la partie.
     * @param aventurier
     * @param keyboard
     * @throws NoSuchFieldException
     */
    public void atTheEntry(CommunPeople aventurier, Scanner keyboard) {
        AtTheEntry enter = new AtTheEntry();
        enter.atTheEntry(aventurier, keyboard);
    }

    /**
     * commnande pour rentrer dans la caverne
     * @param aventurier
     * @param keyboard
     */
    public void enterCavern(CommunPeople aventurier, Scanner keyboard) {
        EnterCavern game = new EnterCavern();
        game.enterCavern(aventurier, keyboard);
    }

    /**
     * commande pour avancer de salle en salle dans la caverne
     * @param aventurier
     * @param keyboard
     * @param plateaux
     */
    public void inTheCavern(CommunPeople aventurier, Scanner keyboard,
                            ArrayList<Salle> plateaux)  {
        InTheCavern cavern = new InTheCavern();
        cavern.inTheCavern(aventurier, keyboard, plateaux);
    }

    /*=====COMMANDE_DANS_LA_CAVERNE=====COMMANDE_DANS_LA_CAVERNE=====COMMANDE_DANS_LA_CAVERNE*/
    public void inspect(CommunPeople aventurier, ArrayList<Salle> plateaux,
                        int position, Scanner keyboard) {
        Search search = new Search();
        search.search(aventurier, plateaux, position, keyboard);
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
     * permet de mettre un item dans la DB
     * @param plateaux
     * @param position
     */
    public void addBackPack(ArrayList<Salle> plateaux, int position) {
        Request inTheBag = new Request();
        inTheBag.addBackPack(plateaux, position);
    }

    /**
     * permet de récupérer un item stocké dans la DB
     * @param aventurier
     * @param keyboard
     */
    public void takeBackPack(CommunPeople aventurier, Scanner keyboard, int position,
                             ArrayList<Salle> plateaux) {
        Request inTheBag = new Request();
        inTheBag.takeBackPack(aventurier, keyboard, position, plateaux);
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
/*======COMMANDE_LOGIQUE======COMMANDE_LOGIQUE======COMMANDE_LOGIQUE======COMMANDE_LOGIQUE*/
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

    public boolean verifType(CommunPeople aventurier,
                              int position,
                              ArrayList<Salle> plateaux) {
        Verify type = new Verify();
        return type.verifyType(aventurier, position, plateaux);
    }

    /**
     * création du plateau de jeu qui s'appelle caverne
     * @return
     * @throws NoSuchFieldException
     */
    public ArrayList<Salle> cavern() {
        Cavern cavern = new Cavern();
        return cavern.salles();
    }

    /**
     * début de l'aventure - permet de rejouer
     * @param keyboard
     * @throws NoSuchFieldException
     */
    public void startGame(Scanner keyboard) {
        PlayGame game = new PlayGame();
        game.playGame(keyboard);
    }
}