package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.NoOne;
import com.heroquest.stuff.Weapons;

public class Salle {
    protected String salle;
    protected CommunPeople ennemis;
    protected Weapons reward;


/*RETEX--------RETEX--------RETEX--------RETEX--------RETEX--------RETEX--------
* ne pas mettre une valeur directement dans la déclaration d'attribut
* */
    public String description() {
        Description description = Description.randomDescription();
        switch (description) {
            case SALLE:
                return setSalle("dans une pièce vétuste dépouillé " +
                        "de tout meuble");
            case COULOIR:
                return setSalle("dans un long couloir sombre, tu évites les " +
                        " stalactites grâce à la faible clarté de ta torche.");

            case GDSALLE:
                return setSalle("dans une grande salle avec " +
                        "une table dressé. La nourriture " +
                        "n'est pas comestible pour un humain " +
                        "pour un humain sauf si tu es " +
                        "cannibale.");

            case VESTIBULE:
                return setSalle("dans une petite pièce exigu.");

            case ARENE:
                return setSalle("dans une pièce avec " +
                        "du sable sur le sol, de hauts murs " +
                        "parsemé de tribunes. Tu remarques " +
                        "du sang séché sur le sable.");

            case CUISINE:
                return setSalle("dans une pièce à l'incroyable " +
                        "puanteur. Tu entends les mouches " +
                        "voler autour d'amas de viandes " +
                        "défraichis qui pendant " +
                        "à des crochets.");

            case PRISON:
                return setSalle("dans un couloir avec des " +
                        "cachots de part et d'autres. Il n'y a " +
                        "plus rien de vivant dans ces " +
                        "cellules si ce n'est " +
                        "les rats.");

            case OUBLIETTE:
                return setSalle("dans un couloir avec " +
                        "un trou béant en son centre. Tu arrives " +
                        "facilement à contourner cette oubliette.");

            case PIEGE:
                return setSalle("dans un couloir et tu vois " +
                        "un aventurier mort, transpercé d'une " +
                        "lance. Espérons qu'il ne reste pas " +
                        "trop de piège encore actif.");

        }
        return setSalle("la sélection de description de salle " +
                "ne fonctionne pas");
    }

    public CommunPeople enemy() {
        return setEnnemis(new NoOne());
    }
/*SETTER------SETTER------SETTER------SETTER------*/

    public String setSalle(String salle) {
        this.salle = salle;
        return salle;
    }

    public CommunPeople setEnnemis(CommunPeople ennemis) {
        this.ennemis = ennemis;
        return ennemis;
    }

    public void setReward(Weapons reward) {
        this.reward = reward;
    }
    /*GETTER-------GETTER-------GETTER-------GETTER-------*/

    public String getSalle() {
        return salle;
    }

    public CommunPeople getEnnemis() {
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
                salle +
                " il y a " + ennemis +
                " et il te semble apercevoir "
                + reward ;
    }
}

