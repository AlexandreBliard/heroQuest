package com.heroQuest.PJ;

import com.heroQuest.stuff.Weapons;

public class CommunPeople {

    protected Weapons weapons = new Weapons(1, "fourche");
/*---ATTRIBUTS------ATTRIBUTS------ATTRIBUTS------*/
    protected String name;
    protected int life;
    protected Weapons attack;

/*--------- CONSTRUCTEURS  CONSTRUCTEURS   CONSTRUCTEURS ------------*/

    public CommunPeople(String name, int life, Weapons weapons) {
        this.name = name;
        this.life = life;
        this.attack = weapons;
    }

    /*---------les SETTERS sont ici ------------*/
    public void setName(String name) { this.name = name; }
    public void setLife(int life) {this.life = life;}
    public void setAttack(Weapons attack) {this.attack = attack;}
    /*-------SETTER de WEAPONS indispensable pour
    appliquer les armes dans la partie--------------*/
    public Weapons setWeapons (Weapons Cweapons) {
        this.weapons = Cweapons;
        return Cweapons;
    }
 /*--------les GETTERS sont ici------------*/
    public String getName() {return name;}
    public int getLife() {return life;}
    public Weapons getAttack() {return attack;}

/*---------redéfinitions de toSTRING ici---------*/
    public String toString() {
        return "tu te nommes " + name +
                " tu possèdes " + life + " points de vie "
                + "tu possèdes " + this.attack.getName() + " qui " +
                "occasionne " + this.attack.getDamage() + " points " +
                "de dégâts";
    }

}
