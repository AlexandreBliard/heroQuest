package com.heroquest.stuff;

public abstract class Loot {

    protected String pour;
    protected String type;
    protected int damage;
    protected String name;
    protected int price;
    protected int restore;

/*-------- GETTERS  GETTERS  GETTERS  GETTERS------------*/
    public String getPour() {return pour;}
    public String getType() {return type;}
    public int getDamage() {return damage;}
    public String getName() {return name;}
    public int getPrice() {return price;}
    public int getRestore() {
        return restore;
    }

    /*--------- SETTERS  SETTERS  SETTERS  SETTERS ------------*/
    public void setPour(String pour) {this.pour = pour;}
    public void setDamage(int damage) {this.damage = damage;}
    public void setName(String name) {this.name = name;}

/*--------- CONSTRUCTEURS  CONSTRUCTEURS   CONSTRUCTEURS ------------*/

    public Loot(String Cpour, String Ctype,int Cdamage, String Cname, int price, int restore) {
        this.pour = Cpour;
        this.type = Ctype;
        this.damage = Cdamage;
        this.name = Cname;
        this.price = price;
        this.restore = restore;
    }

/* ----------toSTRING  toSTRING  toSTRING  ---------   */
    public String toString() {
        return "tu as équipé " + name +
                " tu fais " + damage + " points de dégâts ";
    }
}
