package com.heroquest.dungeon;

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

    public Description Description() {
        Salle salle = new Salle();
        Description random = Description.GDSALLE;
        /*MISE EN STBY-----MISE EN STBY-----MISE EN STBY-----*/
        return random;
    }
}
