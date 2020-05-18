package com.heroquest.dungeon;

import com.heroquest.Menu;
import com.heroquest.pj.CommunPeople;
import com.heroquest.option.LeaveCavern;

import java.util.Scanner;

public class Cavern {

    Menu menu = new Menu();

    public void enterCavern(CommunPeople aventurier, Scanner keyboard) {
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
            LauchGame cavern = new LauchGame();
            cavern.launchGame(aventurier, keyboard);
        }else {
            LeaveCavern leave = new LeaveCavern();
            leave.leaveCavern(keyboard);
        }
    }
}
