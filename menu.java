package com.heroQuest;
import java.util.Scanner;

class Menu {

    public Menu() {
        System.out.println("constructeur ok");
    }

    public void chooseYourCharacter() {
        System.out.println("bonjour à toi " +
                "aventurier, mes yeux sont " +
                "fatigués et je ne vois plus " +
                "très bien, es-tu un intrépide " +
                "guerrier ou un rusé magicien ?");
        Scanner sc = new Scanner(System.in);
        boolean enigme = false;
        do {
            System.out.println("dites au sage si " +
                    "vous êtes un guerrier " +
                    "ou un magicien");
            String classePJ = sc.nextLine();
            if (classePJ.equals("GUERRIER") ) {
                Warrior warrior = createWarrior(classePJ);
                enigme = true;
            }else if (classePJ.equals("MAGICIEN")){
                Wizard wizard = createWizard(classePJ);
                enigme = true;
            }else if (classePJ.equals("guerrier")  /*|| "magicien"*/) {
                System.out.println("je t'entend mal " +
                        "jeune "+ classePJ);
            }else {
                System.out.println("je ne suis pas " +
                        "sur de ta réponse");
            }
        } while (enigme == false);

        System.out.println("je te salue vaillant héros "  +
                "derrière moi se trouve " +
                "l'entrée d'une grotte " +
                "qui contient le sceptre de " +
                "feu. Ramène le moi et je " +
                "te promet une juste récompense ");
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
        System.out.println("admire toi "+ namePJ + warrior);
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
        System.out.println("admire toi "+ namePJ + wizard);
        return wizard;
    }
}