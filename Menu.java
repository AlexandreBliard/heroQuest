package com.heroquest;

import com.heroquest.option.OneOptionForGouvernAll;
import com.heroquest.pj.CommunPeople;
import com.heroquest.option.LeaveCavern;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }
    ChooseYourCharacter start = new ChooseYourCharacter();
    OneOptionForGouvernAll options = new OneOptionForGouvernAll();


    public CommunPeople crossRoad(Scanner keyboard) {
            return start.chooseYourCharacter(keyboard);
    }

    public void options(CommunPeople aventurier, Scanner keyboard) {
        options.chooseSpecialRules(aventurier, keyboard);
    }


    public void enterCavern(CommunPeople aventurier, Scanner keyboard) {
        System.out.println("te voilà donc " +
                "prêt à pénétrer dans la " +
                "caverne qui se trouve " +
                "derrière moi. Tout au bout " +
                "tu y trouveras le sceptre de " +
                "Feu. Si tu me le ramènes tu " +
                "auras 500 po et tous les trésors" +
                "de cette caverne. Qu'en dis-tu ?");
        System.out.println("êtes-vous prêts à " +
                "vous aventurer dans cette caverne " +
                "pour 500 po ? " +
                "taper oui ou non.");
        boolean reponse = false;
        do {
            String answer = keyboard.nextLine();
            if (answer.equals("oui")) {
                Cavern cavern = new Cavern();
                cavern.launchGame(aventurier, keyboard);
            } else if (answer.equals("non")) {
                LeaveCavern leave = new LeaveCavern();
                leave.leaveCavern(keyboard);
            } else {
                System.out.println("je ne suis pas sur " +
                        "d'avoir bien compris");
            }
        } while (!reponse);
    }
}