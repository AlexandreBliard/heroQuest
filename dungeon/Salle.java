package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.Dragon;
import com.heroquest.pnj.Goblins;
import com.heroquest.pnj.NoOne;
import com.heroquest.pnj.Sorcerer;
import com.heroquest.stuff.Weapons;

public class Salle {
    protected String salle = description();
    protected int index;
    protected CommunPeople ennemis = ennemy();
    protected Weapons reward;

    public String description() {
        Description salle = Description.randomDescription();
        switch (salle) {
            case SALLE:
                return "dans une pièce vétuste dépouillé " +
                        "de tout meuble";
            case COULOIR:
                return "dans un long couloir sombre, tu évites les " +
                        " stalactites grâce à la faible clarté de ta torche.";

            case GDSALLE:
                return "dans une grande salle avec " +
                        "une table dressé. La nourriture " +
                        "n'est pas comestible pour un humain " +
                        "pour un humain sauf si tu es " +
                        "cannibale.";

            case VESTIBULE:
                return "dans une petite pièce exigu.";

            case ARENE:
                return "dans une pièce avec " +
                        "du sable sur le sol, de hauts murs " +
                        "parsemé de tribunes. Tu remarques " +
                        "du sang séché sur le sable.";

            case CUISINE:
                return "dans une pièce à l'incroyable " +
                        "puanteur. Tu entends les mouches " +
                        "voler autour d'amas de viandes " +
                        "défraichis qui pendant " +
                        "à des crochets.";

            case PRISON:
                return "dans un couloir avec des " +
                        "cachots de part et d'autres. Il n'y a " +
                        "plus rien de vivant dans ces " +
                        "cellules si ce n'est " +
                        "les rats.";

            case OUBLIETTE:
                return "dans un couloir avec " +
                        "un trou béant en son centre. Tu arrives " +
                        "facilement à contourner cette oubliette.";

            case PIEGE:
                return "dans un couloir et tu vois " +
                        "un aventurier mort, transpercé d'une " +
                        "lance. Espérons qu'il ne reste pas " +
                        "trop de piège encore actif.";

        }
        return "la sélection de description de salle " +
                "ne fonctionne pas";
    }

    public CommunPeople ennemy() {
        ListEnnemy adversaire = ListEnnemy.RandomEnnemy();
        switch (adversaire) {
            case DRAGONS:
                return new Dragon();
            case SORCIER:
                return new Sorcerer();
            case GOBELINS:
                return new Goblins();
            case NOONE:
                return new NoOne();
        }
        return new Goblins();
    }
/*SETTER------SETTER------SETTER------SETTER------*/


    /*GETTER-------GETTER-------GETTER-------GETTER-------*/


    /*CONSTRUCTEUR------CONSTRUCTEUR------CONSTRUCTEUR------*/



    /*toSTRING ------toSTRING ------toSTRING ------*/
    @Override
    public String toString() {
        return "Tu pénètres " +
                salle +
                " il y a " + ennemis +
                " et il te semble apercevoir "
                + reward ;
    }
}

