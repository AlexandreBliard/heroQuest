package com.heroQuest;
import java.util.Scanner;

class Menu {

    public Menu() {
        System.out.println("constructeur ok");
    }

    public void chooseYourCharacter() {
        System.out.println("bonjour à toi" +
                "aventurier, mes yeux sont" +
                "fatigués et je ne vois plus" +
                "très bien, es-tu un intrépide" +
                "guerrier ou un rusé magicien ?");
        System.out.println("précisez si vous " +
                "êtes un guerrier" +
                "ou un magicien");
        Scanner sc = new Scanner(System.in);
        System.out.println("dites au sage ce" +
                " que vous êtes : ");
        String classePJ = sc.nextLine();
        System.out.println("je te salue vaillant " + classePJ +
                "derrière moi se trouve" +
                "l'entrée d'une grotte" +
                "qui contient le sceptre de " +
                "feu. Ramène le moi et je" +
                "te promet une belle récompense");
    }
}