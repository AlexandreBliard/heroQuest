package com.heroquest;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pj.Warrior;
import com.heroquest.pj.Wizard;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }


    public CommunPeople chooseYourCharacter(Scanner keyboard) {
        System.out.println("bonjour à toi " +
                "aventurier, comment t'appeles-tu ? " );
        System.out.println("dites au sage votre " +
                "nom : ");
        String namePJ = keyboard.nextLine();
        System.out.println("Bonjour à toi " + namePJ
        + " est-ce un vaillant guerrier " +
                "ou un rusé magicien qui " +
                "se tient devant moi ?");
        CommunPeople aventurier = null;
        boolean enigme = false;
        do {
            System.out.println("dites au sage si " +
                    "vous êtes un guerrier " +
                    "ou un magicien");
            String classePJ = keyboard.nextLine();
            if (classePJ.equals("GUERRIER") || classePJ.equals("MAGICIEN")) {
                aventurier = createAventurer(classePJ, namePJ);
                System.out.println(aventurier);
                enigme = true;
                return aventurier;
            } else if (classePJ.equals("guerrier") || classePJ.equals("magicien")) {
                System.out.println("je t'entend mal " + namePJ);
            } else {
                System.out.println("je ne suis pas " +
                        "sur de bien comprendre");
            }
        } while (!enigme);

        return aventurier;
    }

    public CommunPeople createAventurer(String nomDeClasse, String namePJ) {
        if (nomDeClasse.equals("GUERRIER")) {
            return new Warrior(namePJ);
        }else {
            return new Wizard(namePJ);
        }
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