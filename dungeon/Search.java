package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;
import com.heroquest.pj.ValeurExceptions;
import com.heroquest.pnj.Request;
import com.heroquest.stuff.DrinkPotion;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    private final Menu menu = new Menu();

    public void search(CommunPeople aventurier, ArrayList<Salle> plateaux,
                       int position, Scanner keyboard) {
        System.out.println("En fouillant tu découvres " +
                plateaux.get(position).getReward().getName() +
                "\n veux-tu l'utiliser ? oui/non");
        if (menu.choice(aventurier, keyboard)) {
            switch (plateaux.get(position).getReward().getType()) {
                case "weapon":
                    if (menu.verifType(aventurier, position, plateaux)) {
                        aventurier.setAttack(plateaux.get(position).getReward());
                        System.out.println("tu as équipé " +
                                aventurier.getAttack().getName() +
                                " tu fais maintenant " +
                                aventurier.getAttack().getDamage() +
                                " points de dégâts");
                    }
                    else {
                        System.out.println("désolé " + aventurier.getName() +
                                " mais " + plateaux.get(position).getReward().getName() +
                                " n'est pas faite pour un " + aventurier.getType() +
                                "\n tape entrée pour continuer");
                    }
                    break;

                case "potion":
                    DrinkPotion drink = new DrinkPotion();
                    try {
                        drink.drinkPotion(aventurier, plateaux.get(position).getReward());
                    } catch (ValeurExceptions e) {
                        aventurier.setLife((aventurier.getLevel() * aventurier.getLifeByLevel()));
                    }
                    System.out.println("Tu as bu " +
                            plateaux.get(position).getReward().getName() +
                            "\nTu as maintenant " +
                            aventurier.getLife() +
                            " points de vie");
                    break;

                case "gold":
                    System.out.println(" tu trouves " + plateaux.get(position).getReward().getPrice() +
                            " pièces d'or");
                    break;

                case "dust":
                case "trash":
                    System.out.println(" tu trouves " + plateaux.get(position).getReward().getName());
                    break;

                case "nothing":
                    System.out.println( " you find nothing " +
                            aventurier.getName() + " Snow") ;
                    break;
                default:
                    System.out.println("une erreur c'est glissé dans le programme");
            }
        }else {
            System.out.println("on le met quand même dans le sac" +
                    "\ntape entrée pour continuer");
            Request inTheBag = new Request();
            menu.addBackPack( plateaux, position);
        }

    }
}
