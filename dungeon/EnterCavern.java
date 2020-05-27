package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.option.Choice;
import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.Dragon;
import com.heroquest.pnj.Goblins;
import com.heroquest.pnj.Sorcerer;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterCavern {

    public EnterCavern() {
    }
    Menu menu = new Menu();
    public void enterCavern(CommunPeople aventurier, Scanner keyboard) throws NoSuchFieldException {
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
        int taillePlateau = 63;
        double fqGobelin = 0.90;
        double fqSorcerer = 0.65;
        double fqDragon = 0.15;
        int nbGobelin = taillePlateau / 4;
        int nbSorcerer = taillePlateau / 8;
        int nbDragon = taillePlateau / 16;
        DescriptionSalle texte = new DescriptionSalle();
        CommunPeople goblins = new Goblins();
        CommunPeople sorcerer = new Sorcerer();
        CommunPeople dragon = new Dragon();
        ArrayList<Salle> plateaux = new ArrayList<Salle>(taillePlateau);
        for (int i = 0; i<=taillePlateau; i++) {//boucle créations du plateaux
            Salle salle = new Salle(texte.description());//salle avec description aléatoire et sans ennemi
            plateaux.add(salle);
            if (i == taillePlateau) {
                int randomIndexPlateau = 0;
                RandomNumber randomNumber = new RandomNumber();
                AddRandomMonster random = new AddRandomMonster();
                random.addRandomMonster(nbDragon, texte, dragon, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqDragon);
                random.addRandomMonster(nbSorcerer, texte, sorcerer, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqSorcerer);
                random.addRandomMonster(nbGobelin, texte, goblins, randomIndexPlateau,
                        randomNumber, plateaux, taillePlateau, fqGobelin);
            }
         }
        int position = 0;
        do {
            String input = keyboard.nextLine();
            if (input.equals("")) {
                position = menu.forward(position);
                try {
                    plateaux.get(position);//ici on décrit la pièce
                    System.out.println(plateaux.get(position));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("tu trouves le sceptre de Feu");
                }
                System.out.println("avance avec entrée");
            }else if (input.equals("arcanes sacrés")) {
                menu.options(aventurier, keyboard);
            }else if (input.equals("fouille")){
                System.out.println("En fouillant tu découvres" +
                        plateaux.get(position).getReward().getName() +
                 "\n veux-tu t'en équiper ? oui/non");
                Choice booleen = new Choice();
                if (booleen.choice(aventurier, keyboard)) {
                    aventurier.setAttack(plateaux.get(position).getReward());
                    System.out.println("tu as équipé " +
                            aventurier.getAttack().getName() +
                            " tu fais maintenant " +
                            aventurier.getAttack().getDamage() +
                            " points de dégâts");
                };
            }else {
                System.out.println("petite faute de frappe non ?");
            }
        }while (position < plateaux.size());
        System.out.println("Sceptre de Feu acquis");
        System.out.println("voulez-vous rejouer ? " +
                "oui / non ");

        if (menu.choice(aventurier, keyboard)) {
            menu.chooseYouCharacter(keyboard);
        }else {
            menu.leaveCavern(aventurier, keyboard);
        }
    }
}
