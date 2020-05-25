package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.Ennemy;

import java.util.Scanner;

public class AtTheEntry {

    Menu menu = new Menu();

    public void atTheEntry(Ennemy aventurier, Scanner keyboard) {
        System.out.println("te voilà donc " +
                "prêt à pénétrer dans la " +
                "caverne qui se trouve " +
                "derrière moi. Tout au bout " +
                "tu y trouveras le sceptre de " +
                "Feu. Si tu me le ramènes tu " +
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
