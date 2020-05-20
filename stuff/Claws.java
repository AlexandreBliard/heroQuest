package com.heroquest.stuff;

public class Claws extends Weapons {
    public Claws(int Cdamage, String Cname) {
        super(Cdamage, Cname);
    }
    public Claws() {
        this(8, "une patte pourvu de griffes");
    }
}
