package com.heroquest.pnj;

import com.heroquest.dungeon.Salle;
import com.heroquest.pj.CommunPeople;

import java.sql.*;
import java.util.ArrayList;

/**
 * classe permettant la requête SQL
 * avec la DB
 */
public class Request {
    public void addBackPack(ArrayList<Salle> plateaux, int position) {
        String name = plateaux.get(position).getReward().getName();
        System.out.println(name);
        String nameTest = "salut salut";
        String request = "INSERT INTO inventory (name) VALUES (" + " '  " + name +  " ' " + ")";
        try {
            ResultSet result =  DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/backPack", "root", "")
                    .createStatement().executeQuery(request);
        } catch (SQLException throwables) {
            System.out.println("erreur d'ajout");
            throwables.printStackTrace();
        }
    }

    public void takeBackPack() {

    }
}
