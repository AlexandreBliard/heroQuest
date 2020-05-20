package com.heroquest.pj;

import com.heroquest.stuff.Weapons;

public abstract class CommunPeople {


/*---ATTRIBUTS------ATTRIBUTS------ATTRIBUTS------*/
    protected String type;
    protected String name;
    protected int life;
    protected Weapons attack;

/*--------- CONSTRUCTEURS  CONSTRUCTEURS   CONSTRUCTEURS ------------*/

    public CommunPeople(String type, String name, int life, Weapons weapons) {
        this.type = type;
        this.name = name;
        this.life = life;
        this.attack = weapons;
    }

    /*---------les SETTERS sont ici ------------*/

    public void setType(String type) { this.type = type; }
    public void setName(String name) { this.name = name; }
    public void setLife(int life) {this.life = life;}
    public void setAttack(Weapons attack) {this.attack = attack;}

 /*--------les GETTERS sont ici------------*/
    public String getType() {return type;}
    public String getName() {return name;}
    public int getLife() {return life;}
    public Weapons getAttack() {return attack;}

/*---------redéfinitions de toSTRING ici---------*/
    public String toString() {
        return "regarde toi " + name +
                " tu es un " + type +
                " avec " + life + " points de vie, "
                + "tu possèdes " + this.attack.getName() + " qui " +
                "occasionne " + this.attack.getDamage() + " points " +
                "de dégâts";
    /*this.attack = Cweapons et j'ai besoin de Cweapons mais
    * n'existe pas à ce moment là, c'est une relation de
    * Schale inversé*/
    }


}
