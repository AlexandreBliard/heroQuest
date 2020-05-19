package com.heroquest.dungeon;

import java.util.*;

public enum Description {
    SALLE,
    COULOIR,
    GDSALLE,
    VESTIBULE,
    ARENE,
    CUISINE,
    PRISON,
    OUBLIETTE,
    PIEGE;

    private static final List<Description> VALUES =
            Collections.unmodifiableList
                    (Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Description randomDescription() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
