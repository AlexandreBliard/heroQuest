package com.heroquest.stuff;

public class Claws extends Weapons {
    public Claws(String Cpour, int Cdamage, String Cname) {
        super(Cpour, Cdamage, Cname);
    }
    public Claws() {
        this("ennemy",8, " qui est armé d'une patte pourvu de griffes");
    }
}
