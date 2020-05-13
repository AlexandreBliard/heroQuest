package com.heroQuest;

public class CommunPeople {


    protected String name;
    protected int life;
    protected int attack;

    public String toString() {
        return "tu te nommes " + name +
                " tu possèdes " + life + " points de vie "
                + "tu fais " + attack + " point de dégâts";
    }

}
