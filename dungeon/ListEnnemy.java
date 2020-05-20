package com.heroquest.dungeon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum ListEnnemy {
    GOBELINS,
    SORCIER,
    DRAGONS,
    NOONE;

    private static final List<ListEnnemy> VALUES =
            Collections.unmodifiableList
                    (Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ListEnnemy RandomEnnemy() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
