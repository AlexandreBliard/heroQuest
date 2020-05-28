package com.heroquest.stuff;

import com.heroquest.pj.CommunPeople;

public class DrinkPotion {

    public int drinkPotion(CommunPeople aventurier,
                            Loot potion) {
        return aventurier.getLife() +
                potion.getRestore();
    }
}
