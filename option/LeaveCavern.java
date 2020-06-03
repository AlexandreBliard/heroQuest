package com.heroquest.option;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LeaveCavern{

    public LeaveCavern() {

    }

    public void leaveCavern(CommunPeople aventurier, Scanner keyboard) {
        System.out.println("attention vous " +
                "allez quitter ce jeu génial " +
                "taper oui sur le clavier " +
                "ou taper non pour poursuivre " +
                "l'aventure");
        Menu menu = new Menu();

        if (menu.choice(aventurier, keyboard)) {
            try {
                ResultSet eraseAll = DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/backPack", "root", "")
                        .createStatement().executeQuery("DELETE FROM inventory ");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            System.out.println("j'espère te revoir");
            System.exit(0);
        }else {
            System.out.println("courage chevalier " +
                    "crois en Athéna et dans le " +
                    "pouvoir de l'amitié !!!");
            /*mettre ici un code permettant de revenir
             * à l'état initial du code*/
        }
    }
}
