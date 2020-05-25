package com.heroquest.dungeon;

public class RandomNumber {
    public double RandomNumber(int number) {
        double result = ((Math.random() * number) + 1);
        return result;
    }
}
