package com.heroquest.pnj;

public class DB {

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
    * */
}
