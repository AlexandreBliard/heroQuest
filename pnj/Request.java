package com.heroquest.pnj;

import com.heroquest.dungeon.Salle;
import com.heroquest.pj.CommunPeople;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void takeBackPack(Scanner keyboard) {
        System.out.println("tu as ceci dans ton sac");
        String request = "SELECT name FROM inventory";
        try {
            ResultSet results = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/backPack", "root", "")
                    .createStatement().executeQuery(request);
            ResultSetMetaData rsmd = results.getMetaData();
            while(results.next()){
                for (int i = 1 ; i <= rsmd.getColumnCount(); i++) {
                    System.out.println(results.getObject(i).toString());
                }
            }
            results.close();
            System.out.println("que veux-tu prendre ?");
            String input = keyboard.nextLine();
            ResultSet compare = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/backPack", "root", "")
                    .createStatement().executeQuery("SELECT name FROM inventory " +
                            "WHERE name = '" +input+ "'");
            System.out.println("compare passé");
            if (compare.next()) {
                System.out.println("tu l'équipes");
            }else{
                System.out.println("tu ne l'as pas en stock");
            }



        }catch (SQLException throwables) {
            System.out.println("erreur de recherche");
            throwables.printStackTrace();
        }

    }
}
