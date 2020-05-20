package com.heroquest.stuff;

public class NoWeapons extends Weapons {
    public NoWeapons(int Cdamage, String Cname) {
        super(Cdamage, Cname);
    }
    public NoWeapons() {
        this (0, "");
    }
}
