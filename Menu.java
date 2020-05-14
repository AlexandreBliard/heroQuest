package com.heroQuest;
import com.heroQuest.PJ.CommunPeople;
import com.heroQuest.PJ.Warrior;
import com.heroQuest.PJ.Wizard;
import com.heroQuest.stuff.MagicProjectile;
import com.heroQuest.stuff.SmallSword;
import com.heroQuest.stuff.Weapons;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }


    public CommunPeople chooseYourCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("bonjour à toi " +
                "aventurier, mes yeux sont " +
                "fatigués et je ne vois plus " +
                "très bien, es-tu un intrépide " +
                "guerrier ou un rusé magicien ?");
        CommunPeople aventurier = null;
        boolean enigme = false;
        do {
            System.out.println("dites au sage si " +
                    "vous êtes un guerrier " +
                    "ou un magicien");
            String classePJ = sc.nextLine();
            if (classePJ.equals("GUERRIER") ) {
                aventurier = createWarrior(classePJ);
                enigme = true;
                return aventurier;
            }else if (classePJ.equals("MAGICIEN")){
                aventurier = createWizard(classePJ);
                enigme = true;
                return aventurier;
            }else if (classePJ.equals("guerrier") || classePJ.equals("magicien")) {
                System.out.println("je t'entend mal " +
                        "jeune "+ classePJ);
            }else {
                System.out.println("je ne suis pas " +
                        "sur de bien comprendre");
            }
        } while (!enigme);


        return aventurier;
    }

    CommunPeople aventurier = chooseYourCharacter();

    public Warrior createWarrior(String classePJ) {
        System.out.println("dis moi " + classePJ +
                " comment t'appeles-tu ?");
        System.out.println("dites au sage votre " +
                "nom : ");
        Scanner sc = new Scanner(System.in);
        String namePJ = sc.nextLine();
        Weapons weapons = new SmallSword();
        Warrior warrior = new Warrior(namePJ);
        warrior.setWeapons(weapons);
        System.out.println("admire toi "+ warrior);
        return warrior;
    }

    public Wizard createWizard(String classePJ) {
        System.out.println("dis moi " + classePJ +
                " comment t'appeles-tu ?");
        System.out.println("dites au sage votre " +
                "nom : ");
        Scanner sc = new Scanner(System.in);
        String namePJ = sc.nextLine();
        Weapons spell = new MagicProjectile();
        Wizard wizard = new Wizard(namePJ);
        wizard.setWeapons(spell);
        System.out.println("admire toi " + wizard);
        return wizard;
    }

    public void chooseSpecialRules() {
        SpecialRules leave = new SpecialRules();
        System.out.println("tu invoques les " +
                "arcanes sacrés. Si tu veux " +
                "voir tes statistiques" +
                "tape moi.");
        System.out.println("si tu veux " +
                "partir de la caverne " +
                "tape partir");
        System.out.println("si tu veux changer" +
                "ton nom tape nom");
        System.out.println("si tu veux continuer" +
                "ton aventure tape continuer");
        boolean choix = false;
        do {
            Scanner sc = new Scanner(System.in);
            String inputChooseSPR = sc.nextLine();
            if (inputChooseSPR.equals("moi")) {
                System.out.println(aventurier);
            }else if (inputChooseSPR.equals("partir")) {
                leave.leaveCavern();
            }else if (inputChooseSPR.equals("nom")) {
                System.out.println("quel nom veux-tu " +
                        "prendre ?");
                System.out.println("tapez votre " +
                        "nouveau nom");
                aventurier.setName(sc.nextLine());
                System.out.println("bienvenue à toi " +
                        aventurier.getName());
            }else if (inputChooseSPR.equals("continuer")) {
                /*mettre ici un code qui retourne à l'état
                * précédent*/
                choix = true;
            }
        }while (!choix);
    }
}