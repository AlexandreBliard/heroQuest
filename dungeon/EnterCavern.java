package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * on explique comment faire apparaitre les options du jeu
 * au joueur
 * on génère également la caverne à ce moment là. Elle est
 * ensuite envoyé en paramètre dans les méthodes suivantes
 * il y a toujours une échappatoire de texte s'il y a une faute de frappe
 */
public class EnterCavern {

    public EnterCavern() {
    }

    public void enterCavern(CommunPeople aventurier, Scanner keyboard) {
        Menu menu = new Menu();
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
        ArrayList <Salle> plateaux = menu.cavern(); //création de la caverne
        keyboard.nextLine();
        menu.inTheCavern(aventurier, keyboard, plateaux);
    }
}
