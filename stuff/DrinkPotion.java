package com.heroquest.stuff;

import com.heroquest.pj.CommunPeople;

public class DrinkPotion {

    public void drinkPotion(CommunPeople aventurier,
                            Loot potion) {
        aventurier.setLife(aventurier.getLife() +
                potion.getRestore());
    }
}
