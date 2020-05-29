package com.heroquest.dungeon;

import com.heroquest.stuff.*;

public class RandomReward {

    public Loot reward() {
        ListReward reward = ListReward.randomReward();
        switch (reward) {
            case LONGSWORD:
                return new LongSword();
            case HALFSWORD:
                return new HalfHandSword();

            case FIREBALL:
                return new FireBall();

            case ACIDEARROW:
                return new AcideArrow();

            case POTION:
                return new PotionLow();

            case GOLD:
                return new Gold();

            case DUST:
                return new Dust();

            case TRASH:
                return new Trash();
            case NOTHING:
                return new Nothing();
        }
        return new Nothing();
    }
}
