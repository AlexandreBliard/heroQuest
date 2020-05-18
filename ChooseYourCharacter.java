package com.heroquest;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pj.Warrior;
import com.heroquest.pj.Wizard;

import java.util.Scanner;

public class ChooseYourCharacter {
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
}
