package com.example.rpg_final;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JeuTest {
    @Test
    public void testHero() {
        Warrior warrior = new Warrior(100, 20, 5);
        Assertions.assertEquals(100, warrior.getLifePoints());


    }

    @Test
    public void testVie() {
        Hunter hunter = new Hunter(60, 25, 6, 4);
        Enemy enemy = new Enemy(100, 15);
        boolean condition = false;
        if (enemy.getLifePoints() > 0 && hunter.getLifePoints() > 0) {
            condition = true;

        }


        Assertions.assertTrue(condition);


    }

    @Test
    public void testDamage(){
        Mage mage = new Mage(75, 25, 0, 20, 5);
        Enemy enemy = new Enemy(100, 15);

        int lifePointsExpected = 100 - 25;
        enemy.setLifePoints(enemy.getLifePoints() - mage.getWeaponDamage());

        Assertions.assertEquals(lifePointsExpected,enemy.getLifePoints());
    }



}
