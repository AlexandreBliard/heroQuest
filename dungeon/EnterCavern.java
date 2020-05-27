package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterCavern {

    public EnterCavern() {
    }

    public void enterCavern(CommunPeople aventurier, Scanner keyboard) throws NoSuchFieldException {
        Menu menu = new Menu();
        String input = keyboard.nextLine();
        System.out.println("vous êtes dans la caverne,\n " +
                "vous voyez un long couloir sombre " +
                "que la clarté de l'extérieur " +
                "ne vous permet de voir que jusqu'à " +
                "quelques mètres. " +
                "\nTu allumes donc une torche et tu commences " +
                "à avancer prudemment." +
                "\nTu entends au loin le sage te dire : 'si tu es " +
                "perdu tape arcanes sacrés'" +
                "\nAppuyer sur entrée pour " +
                "faire avancer votre personnage");
        ArrayList plateaux = menu.Cavern(); //création de la caverne
        if (input.equals("")) {
            menu.inTheCavern(aventurier, keyboard, plateaux);
        }else {
            System.out.println("je ne suis pas" +
                    "sur d'avoir compris");
        }


    }
}
