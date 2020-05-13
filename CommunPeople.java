package com.heroQuest;

public class CommunPeople {


    protected String name;
    protected int life;
    protected int attack;
/*pause ici, tu essayes de faire varier les valeurs
* de tes personnages*/
    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public String toString() {
        return "tu te nommes " + name +
                " tu possèdes " + life + " points de vie "
                + "tu fais " + attack + " point de dégâts";
    }

}
