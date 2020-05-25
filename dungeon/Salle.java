package com.heroquest.dungeon;

import com.heroquest.pj.Ennemy;
import com.heroquest.pnj.NoOne;
import com.heroquest.stuff.Weapons;

public class Salle {
    protected String description = description();
    protected Ennemy ennemis;
    protected Weapons reward;


/*RETEX--------RETEX--------RETEX--------RETEX--------RETEX--------RETEX--------
* ne pas mettre une valeur directement dans la déclaration d'attribut
* */
public String description() {
    Description description = Description.randomDescription();
    switch (description) {
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
                    " sauf si tu es cannibale.";

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

    public Ennemy enemy() {
        return new NoOne();
    }

/*SETTER------SETTER------SETTER------SETTER------*/

    public void setDescription(String description) {
        this.description = description;
    }

    public Ennemy setEnnemis(Ennemy ennemis) {
        this.ennemis = ennemis;
        return ennemis;
    }

    public void setReward(Weapons reward) {
        this.reward = reward;
    }
    /*GETTER-------GETTER-------GETTER-------GETTER-------*/

    public String getDescription() {
        return description;
    }

    public Ennemy getEnnemis() {
        return ennemis;
    }

    public Weapons getReward() {
        return reward;
    }
    /*CONSTRUCTEUR------CONSTRUCTEUR------CONSTRUCTEUR------*/



    /*toSTRING ------toSTRING ------toSTRING ------*/
    @Override
    public String toString() {
        return "Tu pénètres " +
                description +
                " il y a " + ennemis +
                " et il te semble apercevoir "
                + reward ;
    }

}

