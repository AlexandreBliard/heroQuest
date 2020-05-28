package com.heroquest.stuff;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pj.MaxLife;
import com.heroquest.pj.ValeurExceptions;

public class DrinkPotion {

    public void drinkPotion(CommunPeople aventurier,
                            Loot potion) throws ValeurExceptions{
        aventurier.setLife(aventurier.getLife() +
                potion.getRestore());
        if (aventurier.getLife() > MaxLife.maxLife(aventurier.getLevel(), aventurier.getLifeByLevel())) {
            throw new ValeurExceptions();
        }
    }
}

