package com.heroQuest.PJ;

import com.heroQuest.stuff.Weapons;

public class CommunPeople {

    protected Weapons weapons = new Weapons();
/*---ATTRIBUTS------ATTRIBUTS------ATTRIBUTS------*/
    protected String name;
    protected int life;
    protected Weapons attack;

    public CommunPeople(int life) {
        this.name = "";
        this.life = 2;
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
                + "tu possèdes " + weapons.getName() + " qui " +
                "occasionne " + weapons.getDamage() + " points " +
                "de dégâts";
    }

}
