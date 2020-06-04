package com.heroquest.stuff;

import com.heroquest.pj.*;

public class DrinkPotion {

    public void drinkPotion(CommunPeople aventurier,
                            Loot potion) throws ValeurExceptions{
        aventurier.setLife(aventurier.getLife() +
                potion.getRestore());
        if (aventurier instanceof Warrior) {
            ((Warrior) aventurier).setMaxLife();
            if (aventurier.getLife() > ((Warrior) aventurier).getMaxLife()) {
                throw new ValeurExceptions();
            }
        }else if (aventurier instanceof Wizard) {
            ((Wizard) aventurier).setMaxLife();
            if (aventurier.getLife() > ((Wizard) aventurier).getMaxLife()) {
                throw new ValeurExceptions();
            }
        }
    }
}

/*
* if (aventurier.getLife() > (aventurier.getLevel() * aventurier.getLifeByLevel() )) {
            throw new ValeurExceptions();
        }
* */

