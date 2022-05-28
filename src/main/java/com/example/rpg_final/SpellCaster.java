package com.example.rpg_final;

public class SpellCaster extends Hero {

    int manaPoint;
    int costMana;

    public SpellCaster(int lifePoints, int weaponDamage, int armor,int manaPoint, int costMana) {
        super(lifePoints, weaponDamage, armor);
        this.manaPoint = manaPoint;
        this.costMana = costMana;

    }

    public int getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(int manaPoint) {
        this.manaPoint = manaPoint;
    }

    public int getCostMana() {
        return costMana;
    }

    public void setCostMana(int costMana) {
        this.costMana = costMana;
    }
}
