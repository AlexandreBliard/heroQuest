package com.heroquest.stuff;

import com.heroquest.pj.*;

public class DrinkPotion {

    public void drinkPotion(CommunPeople aventurier,
                            Loot potion) throws ValeurExceptions{
        aventurier.setLife(aventurier.getLife() +
                potion.getRestore());
        if (aventurier.getLife() > (aventurier.getLevel() * aventurier.getLifeByLevel() )) {
            throw new ValeurExceptions();
        }
    }
}

/*
* if (aventurier.getLife() > (aventurier.getLevel() * aventurier.getLifeByLevel() )) {
            throw new ValeurExceptions();
        }
* */

