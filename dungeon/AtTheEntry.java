package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

/**
 * ici c'est le premier choix du joueur, il peut refuser
 * de rentrer dans la caverne
 * on instancie Menu à partir de maintenant car toutes les
 * méthodes majeur sont gérés par cette classe, c'est cette
 * méthode qui permet d'appeler les règles spéciales par la suite
 * à chaque question booléenne on appelle
 * une méthode qui s'occupe de régler ce problème.
 */
public class AtTheEntry {

    Menu menu = new Menu();

    public void atTheEntry(CommunPeople aventurier, Scanner keyboard) {
        System.out.println("te voilà donc " +
                "prêt à pénétrer dans la " +
                "caverne qui se trouve " +
                "derrière moi. \nTout au bout " +
                "tu y trouveras le sceptre de " +
                "Feu. \nSi tu me le ramènes tu " +
                "auras 500 po et tous les trésors" +
                "de cette caverne. Qu'en dis-tu ?");
        System.out.println("êtes-vous prêts à " +
                "vous aventurer dans cette caverne " +
                "pour 500 po ? " +
                "taper oui ou non.");
        if (menu.choice(aventurier, keyboard)) {
            menu.enterCavern(aventurier, keyboard);
        }else {
            menu.leaveCavern(aventurier, keyboard);
        }
    }
}
