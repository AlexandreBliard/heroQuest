package com.heroquest.pnj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * classe permettant la connexion avec
 * la DB backPack
 */
public class Connect {

    private Connection connection;
    private static Connect instance;

    /*GETTER======GETTER======GETTER======GETTER======GETTER======GETTER======
    * */

    public static Connect getInstance() {
        if (instance == null) {
            instance = new Connect();
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");

                String url = "jdbc:mariadb://localhost:3306/backPack";
                String user = "root";
                String passwd = "";

                connection = DriverManager.getConnection(url, user, passwd);

            } catch (Exception e) {
                System.out.println("erreur connexion DB");
                e.printStackTrace();
            }
        }
        return connection;
    }

    /*CONSTRUCTEUR===========CONSTRUCTEUR===========CONSTRUCTEUR===========CONSTRUCTEUR===========*/

    private Connect() {

    }

    /*
    * réflexion sur l'accès à DB
    * dans la DB, il me faudra juste le nom de l'objet
    * je ne pense pas ajouter un objet à un objet déjà existant,
    * cela me semble trop compliqué, chaque objet aura donc
    * son propre ID.
    * ========DANS_LE_SAC==========DANS_LE_SAC==========DANS_LE_SAC==========DANS_LE_SAC==========
    * il faut faire une demande, s'il n'équipe pas cela ira dans le sac
    * au booléen "veux-tu l'équiper" le non l'enverra vers la DB et je mettrai un
    * massage "ok "+ Name +" est maintenant dans ton sac à dos"
    * il va falloir récupérer le nom du loot, je me demande
    * si un code comme cela pourrait fonctionner
    * addLoot (plateaux.get(position).getReward().getName)
    *
    * ========RECUPERATION=======RECUPERATION=======RECUPERATION=======RECUPERATION=======
    * faire une condition pour savoir si l'objet est dans la sac
    * if (objet sélectionné dans le sac) {
    *   String nameRedonné = nameSQL
*       switch (nameRedonné) {
*           case potion :
*               drinkPotion();
*               remove nameRedonné de la DB
*               break();
*           case weapons :
*               aventurier.setWeapons.new nameRenommé;
*               remove nameRedonné de la DB;
*               break;
*           }
    *   }
    * =======CE_QUI_EST_ATTENDU=========CE_QUI_EST_ATTENDU=========CE_QUI_EST_ATTENDU=========
    * récupéer des élméents, en récupérer, les mettre à jour, les effacer
    * Select Count permet de faire une vérification du nb d'objet, on peut
    * récupérer par la suite un seul objet en s'intéressant à son ID, le nom et l'ID
    * sont renvoyés vers le programme et on delete via l'ID, ainsi un seul sera supprimé
    * et non tous les objets du même nom.
    * */


}
