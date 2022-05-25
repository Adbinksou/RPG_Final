package com.example.rpg_final;

public class Healer extends Hero {
    int numPotion;

    public Healer(int lifePoints, int weaponDamage, int armor) {
        super(lifePoints, weaponDamage, armor);
        this.numPotion = this.numPotion;
    }

    public int getNumPotion() {
        return this.numPotion;
    }

    public void setNumPotion(int numPotion) {
        this.numPotion = numPotion;
    }
}
