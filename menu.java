package com.heroQuest;
import java.util.Scanner;

class Menu {

    public Menu() {
        System.out.println("constructeur ok");
    }

    public CommunPeople chooseYourCharacter() {
        System.out.println("bonjour à toi " +
                "aventurier, mes yeux sont " +
                "fatigués et je ne vois plus " +
                "très bien, es-tu un intrépide " +
                "guerrier ou un rusé magicien ?");
        Scanner sc = new Scanner(System.in);
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
    public Warrior createWarrior(String classePJ) {
        System.out.println("dis moi " + classePJ +
                " comment t'appeles-tu ?");
        System.out.println("dites au sage votre " +
                "nom : ");
        Scanner sc = new Scanner(System.in);
        String namePJ = sc.nextLine();
        int valueLife = 5;
        int valueAttack = 8;
        Warrior warrior = new Warrior(namePJ, valueLife, valueAttack);
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
        int valueLife = 5;
        int valueAttack = 8;
        Wizard wizard = new Wizard(namePJ, valueLife, valueAttack);
        System.out.println("admire toi " + wizard);
        return wizard;
    }
}