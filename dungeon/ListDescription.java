package com.heroquest.dungeon;

import java.util.*;

public enum ListDescription {
    SALLE,
    COULOIR,
    GDSALLE,
    VESTIBULE,
    ARENE,
    CUISINE,
    PRISON,
    OUBLIETTE,
    PIEGE;

    private static final List<ListDescription> VALUES =
            Collections.unmodifiableList
                    (Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ListDescription randomDescription() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
