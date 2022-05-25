//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.rpg_final;

import java.util.List;

public class Hero {
    int lifePoints;
    int armor;
    int weaponDamage;
    List<Potion> potions;
    List<Food> lembas;

    public Hero(int lifePoints, int weaponDamage, int armor) {
        this.weaponDamage = weaponDamage;
        this.lifePoints = lifePoints;
        this.armor = armor;
    }

    int getLifePoints() {
        return this.lifePoints;
    }

    int getWeaponDamage() {
        return this.weaponDamage;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public void attack() {
    }

    public void defend() {
    }

    public void useConsumable() {
    }

    public void weaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
}
