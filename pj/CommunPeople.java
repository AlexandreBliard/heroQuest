package com.heroquest.pj;

import com.heroquest.stuff.Loot;

public abstract class CommunPeople{


/*---ATTRIBUTS------ATTRIBUTS------ATTRIBUTS------*/
    protected String type;
    protected String name;
    protected int life;
    protected int lifeByLevel;
    protected int level;
    protected Loot attack;
    protected int xp;
    protected int gold;

/*--------- CONSTRUCTEURS  CONSTRUCTEURS   CONSTRUCTEURS ------------*/

    public CommunPeople(String type, String name, int life, int lifeByLevel, int level, Loot loot, int xp, int gold) {
        this.type = type;
        this.name = name;
        this.life = life;
        this.lifeByLevel = lifeByLevel;
        this.level = level;
        this.attack = loot;
        this.xp = xp;
        this.gold = gold;
    }

    /*---------les SETTERS sont ici ------------*/

    public void setType(String type) { this.type = type; }
    public void setName(String name) { this.name = name; }
    public void setLife(int life) {this.life = life;}
    public void setAttack(Loot attack) {this.attack = attack;}

 /*--------les GETTERS sont ici------------*/
    public String getType() {return type;}
    public String getName() {return name;}
    public int getLife() {return life;}
    public int getLifeByLevel() {
        return lifeByLevel;
    }
    public int getLevel() {return level;}
    public Loot getAttack() {return attack;}

/*---------redéfinitions de toSTRING ici---------*/
    public String toString() {
        return "regarde toi " + name +
                " tu es un " + type +
                " avec " + life + " points de vie, "
                + "\n" + "tu possèdes " + this.attack.getName() + " qui " +
                "occasionne " + this.attack.getDamage() + " points " +
                "de dégâts" +
                "\n"+ "tu as " + xp + " points d'expérience " +
                "et " + gold + " pièces d'or";
    /*this.attack = Cweapons et j'ai besoin de Cweapons mais
    * n'existe pas à ce moment là, c'est une relation de
    * Schale inversé*/
    }


}
