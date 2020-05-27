package com.heroquest.stuff;

public abstract class Weapons {

    protected String pour;
    protected int damage;
    protected String name;

/*-------- GETTERS  GETTERS  GETTERS  GETTERS------------*/
    public String getPour() {return pour;}
    public int getDamage() {return damage;}
    public String getName() {return name;}

/*--------- SETTERS  SETTERS  SETTERS  SETTERS ------------*/
    public void setPour(String pour) {this.pour = pour;}
    public void setDamage(int damage) {this.damage = damage;}
    public void setName(String name) {this.name = name;}

/*--------- CONSTRUCTEURS  CONSTRUCTEURS   CONSTRUCTEURS ------------*/

    public Weapons(String Cpour, int Cdamage, String Cname) {
        this.pour = Cpour;
        this.damage = Cdamage;
        this.name = Cname;
    }

/* ----------toSTRING  toSTRING  toSTRING  ---------   */
    public String toString() {
        return "tu a équipé " + name +
                " tu fais " + damage + " points de degâts ";
    }
}
