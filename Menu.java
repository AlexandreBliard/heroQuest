package com.heroquest;

import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }
    ChooseYourCharacter start = new ChooseYourCharacter();
    public CommunPeople crossRoad(Scanner keyboard) {
        return start.chooseYourCharacter(keyboard);
    }

    public void chooseSpecialRules(CommunPeople aventurier) {
        SpecialRules leave = new SpecialRules();
        System.out.println("tu invoques les " +
                "arcanes sacrés. Si tu veux " +
                "voir tes statistiques" +
                "tape moi.");
        System.out.println("si tu veux " +
                "partir de la caverne " +
                "tape partir");
        System.out.println("si tu veux changer " +
                "ton nom tape nom");
        System.out.println("si tu veux continuer " +
                "ton aventure tape continuer");
        boolean choix = false;
        do {
            Scanner sc = new Scanner(System.in);
            String inputChooseSPR = sc.nextLine();
            if (inputChooseSPR.equals("moi")) {
                System.out.println(aventurier);
            } else if (inputChooseSPR.equals("partir")) {
                leave.leaveCavern();
            } else if (inputChooseSPR.equals("nom")) {
                System.out.println("quel nom veux-tu " +
                        "prendre ?");
                System.out.println("tapez votre " +
                        "nouveau nom");
                aventurier.setName(sc.nextLine());
                System.out.println("bienvenue à toi " +
                        aventurier.getName());
            } else if (inputChooseSPR.equals("continuer")) {
                /*mettre ici un code qui retourne à l'état
                 * précédent*/
                choix = true;
            }
        } while (!choix);
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
                SpecialRules leave = new SpecialRules();
                leave.leaveCavern();
            } else {
                System.out.println("je ne suis pas sur " +
                        "d'avoir bien compris");
            }
        } while (!reponse);
    }
}