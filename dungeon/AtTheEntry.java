package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;

import java.util.Scanner;

public class AtTheEntry {

    Menu menu = new Menu();

    public void atTheEntry(CommunPeople aventurier, Scanner keyboard) throws NoSuchFieldException {
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
