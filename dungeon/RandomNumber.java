package com.heroquest.dungeon;

public class RandomNumber {
    public double RandomNumber(int taillePlateau, double fq) {
        double result = (taillePlateau - Math.random()*taillePlateau*fq);
        return result;
    }
}
//double result = ((Math.random() * number) + 1);