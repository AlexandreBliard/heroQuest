package com.heroquest.pnj;

import com.heroquest.dungeon.Salle;
import com.heroquest.pj.CommunPeople;
import com.heroquest.pj.MaxLife;
import com.heroquest.pj.ValeurExceptions;
import com.heroquest.stuff.*;

import javax.swing.*;
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
        String request = "INSERT INTO inventory (name) VALUES (" + "'" + name +  "'" + ")";
        ResultSet result = null;
        try {
            result = Connect.getInstance().getConnection().createStatement().executeQuery(request);

        } catch (SQLException throwables) {
            System.out.println("erreur d'ajout");
            throwables.printStackTrace();
        } finally {
            try {
                result.close();
            } catch (Exception throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public void takeBackPack(CommunPeople aventurier, Scanner keyboard) {
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
            if (compare.next()) {
                switch (input) {
                    case "une épée longue":
                        aventurier.setAttack(new LongSword());
                        break;

                    case "une épée batârde":
                        aventurier.setAttack(new HalfHandSword());
                        break;

                    case "le bâton de boule de feu":
                        aventurier.setAttack(new FireBall());
                        break;

                    case "une baguette de flèche acide de Melf":
                        aventurier.setAttack(new AcideArrow());
                        break;

                    case "potion de soins légers":
                        DrinkPotion DP = new DrinkPotion();
                        ResultSet erase = DriverManager.getConnection(
                                "jdbc:mariadb://localhost:3306/backPack", "root", "")
                                .createStatement().executeQuery("DELETE FROM inventory " +
                                        "WHERE name = '" +input+ "'");
                        try {
                            DP.drinkPotion(aventurier, new PotionLow());
                        } catch (ValeurExceptions valeurExceptions) {
                            aventurier.setLife((aventurier.getLevel() * aventurier.getLifeByLevel()));
                        }
                        break;

                    case "'You find nothing Jhon Snow'":
                        System.out.println("c'était juste pour le ;-)");
                        break;

                    case "juste de la poussière" :
                        System.out.println("pas assez pour lui piquer les yeux");
                        break;

                    case  "juste des ordures" :
                        System.out.println("on pourrait croire à des boucles d'oreille");
                        break;

                    default:
                        System.out.println("erreur de code");

                }
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
