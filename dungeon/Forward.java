package com.heroquest.dungeon;

import com.heroquest.Dice;

public class Forward {
    public Integer forward(int position) {
        Dice move = new Dice();
        position = position + move.movePlayer();
        return position;
    }
}
