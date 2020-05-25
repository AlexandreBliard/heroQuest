package com.heroquest;

import com.heroquest.pj.Ennemy;
import com.heroquest.pj.Warrior;
import com.heroquest.pj.Wizard;

import java.util.Scanner;

public class ChooseYourCharacter {
    public Ennemy chooseYourCharacter(Scanner keyboard) {
        System.out.println("bonjour à toi " +
                "aventurier, comment t'appeles-tu ? " );
        System.out.println("dites au sage votre " +
                "nom : ");
        String namePJ = keyboard.nextLine();
        System.out.println("Bonjour à toi " + namePJ
                + " es-tu un vaillant guerrier " +
                "ou un rusé magicien ?");
        Ennemy aventurier = null;
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

    public Ennemy createAventurer(String nomDeClasse, String namePJ) {
        if (nomDeClasse.equals("GUERRIER")) {
            return new Warrior(namePJ);
        }else {
            return new Wizard(namePJ);
        }
    }
}
