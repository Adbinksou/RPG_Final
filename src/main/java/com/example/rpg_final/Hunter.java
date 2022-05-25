package com.example.rpg_final;

public class Hunter extends Hero {
    int numArrows;

    public Hunter(int lifePoints, int weaponDamage, int armor, int numArrows) {
        super(lifePoints, weaponDamage, armor);
        this.numArrows = numArrows;
    }

    public int getNumArrows() {
        return this.numArrows;
    }

    public void setNumArrows(int numArrows) {
        this.numArrows = numArrows;
    }
}
