//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.rpg_final;

public class Enemy {
    int lifePoints;
    int enemyDamage;


    public Enemy(int lifePoints, int enemyDamage) {
        this.lifePoints = lifePoints;
        this.enemyDamage = enemyDamage;

    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public int getEnemyDamage() {
        return this.enemyDamage;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }


}
