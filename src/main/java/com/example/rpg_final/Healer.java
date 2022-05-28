package com.example.rpg_final;

public class Healer extends SpellCaster {
    int numPotion;

    public Healer(int lifePoints, int weaponDamage, int armor, int manaPoint, int costMana) {
        super(lifePoints, weaponDamage, armor, manaPoint, costMana);
    }


    public int getNumPotion() {
        return this.numPotion;
    }

    public void setNumPotion(int numPotion) {
        this.numPotion = numPotion;
    }
}
