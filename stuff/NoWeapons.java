package com.heroquest.stuff;

public class NoWeapons extends Weapons {
    public NoWeapons(String Cpour, int Cdamage, String Cname) {
        super(Cpour, Cdamage, Cname);
    }
    public NoWeapons() {
        this ("", 0, "");
    }
}
