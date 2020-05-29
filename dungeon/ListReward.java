package com.heroquest.dungeon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum ListReward {
    LONGSWORD,
    HALFSWORD,
    FIREBALL,
    ACIDEARROW,
    POTION,
    GOLD,
    DUST,
    TRASH,
    NOTHING;

    private static final List<ListReward> VALUES =
            Collections.unmodifiableList
                    (Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ListReward randomReward() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
