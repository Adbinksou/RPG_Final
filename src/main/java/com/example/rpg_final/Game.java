//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.rpg_final;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Game {
    static int nbrHero;
    static List<Hero> heroList = new ArrayList();
    static List<Enemy> enemyList = new ArrayList();

    public Game() {
    }

    public static void main(String[] args) {
        generateHero();
        generateEnemy();
        generateCombat();
    }

    public static void generateHero() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Choisir nombre Heros :(max 4)");
        nbrHero = inputReader.nextInt();
        if (nbrHero == 1) {
            System.out.println("Votre équipe est composée d'un Warrior");
        } else if (nbrHero == 2) {
            System.out.println("Votre équipe est composée d'un Warrior et d'un Hunter");
        } else if (nbrHero == 3) {
            System.out.println("Votre équipe est composée d'un Warrior, d'un Hunter et d'un Healer");
        } else if (nbrHero == 4) {
            System.out.println("Votre équipe est composée d'un Warrior, d'un Hunter, d'un Healer et d'un Mage");
        } else {
            System.out.println("Invalide");
        }

        Warrior warrior = new Warrior(100, 20, 50);
        Hunter hunter = new Hunter(60, 25, 6, 5);
        Healer healer = new Healer(80, 5, 4);
        Mage mage = new Mage(75, 25, 0);
        heroList.add(warrior);
        heroList.add(hunter);
        heroList.add(healer);
        heroList.add(mage);
    }

    public static void generateEnemy() {
        for(int i = 1; i <= nbrHero; ++i) {
            Enemy enemy = new Enemy(100, 15, "zombie");
            enemyList.add(enemy);
        }

    }

    public static void generateCombat() {
        System.out.println(heroList);
        System.out.println(enemyList);

        while(auMoinsUnEnVie()) {
            Iterator var0 = heroList.iterator();

            while(var0.hasNext()) {
                Hero hero = (Hero)var0.next();
                Iterator var2 = enemyList.iterator();

                while(var2.hasNext()) {
                    Enemy enemy = (Enemy)var2.next();
                    System.out.println("\tEnemy's HP:" + enemy.getLifePoints());
                    System.out.println("\n\tWhat would you like to do ?");
                    System.out.println("\t(1) Attack");
                    System.out.println("\t(2) Defend (la meilleure defence c'est l'attaque)");
                    System.out.println("\t(3) Run away");
                    Scanner inputReader = new Scanner(System.in);
                    String input = inputReader.nextLine();
                    if (input.equals("1")) {
                        hero.setLifePoints(hero.getLifePoints() - enemy.enemyDamage);
                        enemy.setLifePoints(enemy.getLifePoints() - hero.weaponDamage);
                        System.out.println("\tHero's HP:" + hero.getLifePoints());
                    } else if (!input.equals("2") && !input.equals("3")) {
                        System.out.println("error");
                    }
                }
            }
        }

    }

    private static boolean auMoinsUnEnVie() {
        Iterator var0 = heroList.iterator();

        Hero hero;
        do {
            if (!var0.hasNext()) {
                return false;
            }

            hero = (Hero)var0.next();
        } while(hero.getLifePoints() <= 0);

        return true;
    }
}
