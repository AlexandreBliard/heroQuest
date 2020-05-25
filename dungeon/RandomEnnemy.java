package com.heroquest.dungeon;

import com.heroquest.pj.CommunPeople;
import com.heroquest.pnj.Dragon;
import com.heroquest.pnj.Goblins;
import com.heroquest.pnj.NoOne;
import com.heroquest.pnj.Sorcerer;

public class RandomEnnemy {

    public CommunPeople randomEnnemy() {
        ListEnnemy liste = ListEnnemy.RandomEnnemy();
        switch (liste) {
            case GOBELINS:
                return new Goblins();
            case SORCIER:
                return new Sorcerer();
            case DRAGONS:
                return new Dragon();
            case NOONE:
                return new NoOne();
        }
        return new NoOne();
    }
}
