package com.heroquest.option;

import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class OneOptionForGouvernAll {
    public void chooseSpecialRules(CommunPeople aventurier, Scanner keyboard) {
        LeaveCavern leave = new LeaveCavern();
        ChangeName name = new ChangeName();
        System.out.println("tu invoques les " +
                "arcanes sacrés. Si tu veux " +
                "voir tes statistiques " +
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
            String inputChooseSPR = keyboard.nextLine();
            if (inputChooseSPR.equals("moi")) {
                System.out.println(aventurier);
            } else if (inputChooseSPR.equals("partir")) {
                leave.leaveCavern(aventurier, keyboard);
            } else if (inputChooseSPR.equals("nom")) {
                name.changeName(aventurier, keyboard);
            } else if (inputChooseSPR.equals("continuer")) {
                /*mettre ici un code qui retourne à la partie*/
                choix = true;
            }
        } while (!choix);
    }
}
