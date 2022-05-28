package com.example.rpg_final;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.example.rpg_final.Game2.Jeu;

public class JeuTest {
    @Test
    public void testHero(){
        Warrior warrior = new Warrior(100, 20, 5);
        Assertions.assertEquals(100,warrior.getLifePoints());


    }

    @Test
    public void testFleche(){

    }
}
