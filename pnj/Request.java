package com.heroquest.pnj;

import com.heroquest.Menu;
import com.heroquest.dungeon.Salle;
import com.heroquest.pj.CommunPeople;
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

    private Menu menu = new Menu();

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

    public void takeBackPack(CommunPeople aventurier, Scanner keyboard, int position,
                             ArrayList<Salle> plateaux) {
        System.out.println("tu as ceci dans ton sac");
        String request = "SELECT name FROM inventory";
        ResultSet result = null;
        ResultSet compare = null;
        try {
            result = Connect.getInstance().getConnection().
                    createStatement().executeQuery(request);
            ResultSetMetaData rsmd = result.getMetaData();
            while(result.next()){
                for (int i = 1 ; i <= rsmd.getColumnCount(); i++) {
                    System.out.println(result.getObject(i).toString());
                }
            }
            result.close();
            System.out.println("que veux-tu prendre ?");
            String input = keyboard.nextLine();
            compare = Connect.getInstance().getConnection().createStatement().executeQuery("SELECT name FROM inventory " +
                    "WHERE name = '" +input+ "'");
            if (compare.next()) {
                ResultSet erase = null;
                switch (input) {
                    case "une épée longue":
                        if (menu.verifType(aventurier, position, plateaux))
                        aventurier.setAttack(new LongSword());
                        compare.close();
                        break;

                    case "une épée batârde":
                        if (menu.verifType(aventurier, position, plateaux))
                        aventurier.setAttack(new HalfHandSword());
                        compare.close();
                        break;

                    case "le bâton de boule de feu":
                        if (menu.verifType(aventurier, position, plateaux))
                        aventurier.setAttack(new FireBall());
                        compare.close();
                        break;

                    case "une baguette de flèche acide de Melf":
                        if (menu.verifType(aventurier, position, plateaux))
                        aventurier.setAttack(new AcideArrow());
                        compare.close();
                        break;

                    case "potion de soins légers":
                        DrinkPotion DP = new DrinkPotion();
                        erase = Connect.getInstance().getConnection()
                                .createStatement().executeQuery("DELETE FROM inventory " +
                                        "WHERE name = '" +input+ "'");
                        try {
                            DP.drinkPotion(aventurier, new PotionLow());
                        } catch (ValeurExceptions valeurExceptions) {
                            aventurier.setLife((aventurier.getLevel() * aventurier.getLifeByLevel()));
                        }finally {
                            erase.close();
                        }
                        compare.close();
                        break;

                    case "'You find nothing Jhon Snow'":
                        System.out.println("c'était juste pour le ;-)");
                        compare.close();
                        break;

                    case "juste de la poussière" :
                        System.out.println("pas assez pour lui piquer les yeux");
                        compare.close();
                        break;

                    case  "juste des ordures" :
                        System.out.println("on pourrait croire à des boucles d'oreille");
                        compare.close();
                        break;

                    default:
                        System.out.println("erreur de code");
                        compare.close();

                }
                System.out.println("tu l'équipes");
            }else{
                System.out.println("tu ne l'as pas en stock");
            }
        }catch (SQLException throwables) {
            System.out.println("erreur de recherche");
            throwables.printStackTrace();
        }finally {
            try {
                result.close();
                compare.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
