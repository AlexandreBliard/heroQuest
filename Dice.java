package com.heroquest;

public class Dice {
    public static int deuxDsix () {
        int d1 = (int) (Math.random()*5 + 1);
        int d2 = (int) (Math.random()*5 + 1);
        return d1 + d2;
    }
    public int movePlayer() {
        int position = 1;
        position += deuxDsix();
        return position;
    }
}
