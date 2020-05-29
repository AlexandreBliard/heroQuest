package com.heroquest;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pj.Warrior;
import com.heroquest.pj.Wizard;
import com.heroquest.pnj.NoOne;

import java.util.Scanner;

/**
 * par un dialogue avec un sage nous choisissons
 * notre nom ainsi que notre avatar.
 * Il y a une petite énigme ici, le sage étant un peu sourd il
 * faut crier sa classe de personnage.
 * Pour aiguiller l'utilisateur le sage dit qu'il l'entend mal
 *
 * Nous avons ici un constructeur qui crée le personnage suivant
 * le choix du joueur et prend en paramètre la classe (classePJ)
 * et le nom (namePJ)
 *
 * cette méthode est à la fin de cette classe.
 */
public class ChooseYourCharacter {
    public CommunPeople chooseYourCharacter(Scanner keyboard) {
        System.out.println("bonjour à toi " +
                "aventurier, comment t'appeles-tu ? " );
        System.out.println("dites au sage votre " +
                "nom : ");
        String namePJ = keyboard.nextLine();
        System.out.println("Bonjour à toi " + namePJ
                + " es-tu un vaillant guerrier " +
                "ou un rusé magicien ?");
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

    /**
     * on se laisse ici une possibilité de retourner de nouvelles
     * futur classes de PJ
     * @param nomDeClasse
     * @param namePJ
     * @return
     */
    public CommunPeople createAventurer(String nomDeClasse, String namePJ) {
        switch (nomDeClasse) {
            case "MAGICIEN":
                return new Wizard(namePJ);
            default:
                return new Warrior(namePJ);
        }
    }
}
