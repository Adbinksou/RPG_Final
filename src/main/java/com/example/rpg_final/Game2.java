package com.example.rpg_final;


import java.util.Random;
import java.util.Scanner;

public class Game2 {
    static Scanner scanner = new Scanner(System.in);
    int playerturn;


    public static void main(String[] arg) {
        Jeu();
    }

    public static void Jeu() {
        System.out.println("================RPG_3000================");
        System.out.println("\nChoisissez un hero");
        System.out.println("(1) Warrior");
        System.out.println("(2) Hunter");
        System.out.println("(3) Healer");
        System.out.println("(4) Mage");

        int scan = scanner.nextInt();
        switch (scan){
            case 1:
                jeuWarrior(new Warrior(100, 20, 5));
                break;
            case 2:
                jeuHunter(new Hunter(60, 25, 6, 5));
                break;
            case 3:
                jeuHealer(new Healer(80, 5, 2));
                break;
            case 4:
                jeuMage(new Mage(75, 25, 0));
        }
    }


    /**
     * Fonction qui prend en charge le combat du warrior
     * @param warrior
     */
    public static void jeuWarrior(Warrior warrior) {
        System.out.println("PV du Warrior:" + warrior.getLifePoints());

        /**
         * 1 chance sur 6 de faire apparaitre un Boss, sans utiliser la classe Boss mais juste changer les stats de enemy
         */
        ///
        Random random = new Random();
        int nb;
        nb = random.nextInt(6);
        Enemy enemy = null;

        if (nb == 5) {

           enemy = new Enemy(200,30);
            System.out.println("Un boss est apparu");
        }
        else {
            enemy = new Enemy(100, 15);
            System.out.println("Un enemie classique est apparu");
        }

        ////

        System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

        while (enemy.getLifePoints() > 0 && warrior.getLifePoints() > 0) {


            System.out.println("Que voulez vous faire ?");
            System.out.println("(1) Attaquer");
            System.out.println("(2) Defendre");
            int choixWarrior = scanner.nextInt();
            switch (choixWarrior) {
                case 1:
                    System.out.println("Vous attaquez");
                    warrior.setLifePoints(warrior.getLifePoints() - enemy.getEnemyDamage());
                    enemy.setLifePoints(enemy.getLifePoints() - warrior.getWeaponDamage());

                    System.out.println("PV du Warrior:" + warrior.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

                    break;

                case 2:
                    System.out.println("Vous defendez");
                    warrior.setLifePoints(warrior.getLifePoints() - enemy.getEnemyDamage() + warrior.getArmor());
                    enemy.setLifePoints(enemy.getLifePoints() - warrior.getWeaponDamage());

                    System.out.println("PV du Warrior:" + warrior.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

                    break;
            }

        }
        if (warrior.getLifePoints()<=0){
            System.out.println("vous avez perdu");}
        else {
            System.out.println("vous avez gagne");
        }

    }





    public static void jeuHunter(Hunter hunter){
        System.out.println("PV du Hunter:" + hunter.getLifePoints());
        System.out.println("Nombre de fleches:" + hunter.getNumArrows());

        /**
         * 1 chance sur 6 de faire apparaitre un Boss, sans utiliser la classe Boss mais juste changer les stats de enemy
         */
        ///
        Random random = new Random();
        int nb;
        nb = random.nextInt(6);
        Enemy enemy = null;

        if (nb == 5) {

            enemy = new Enemy(200,30);
            System.out.println("Un boss est apparu");
        }
        else {
            enemy = new Enemy(100, 15);
            System.out.println("Un enemie classique est apparu");
        }
        ///
        System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

        while (enemy.getLifePoints() > 0 && hunter.getLifePoints() > 0) {


            System.out.println("Que voulez vous faire ?");
            System.out.println("(1) Attaquer au couteau");
            System.out.println("(2) Utiliser une fleche");
            System.out.println("(3) Defendre");
            int choixWarrior = scanner.nextInt();
            switch (choixWarrior) {
                case 1:
                    System.out.println("Vous attaquez");
                    hunter.setLifePoints(hunter.getLifePoints() - enemy.getEnemyDamage());
                    enemy.setLifePoints(enemy.getLifePoints() - hunter.getWeaponDamage());

                    System.out.println("PV du Warrior:" + hunter.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

                    break;
                case 2:


                    break;

                case 3:
                    System.out.println("Vous defendez");
                    hunter.setLifePoints(hunter.getLifePoints() - enemy.getEnemyDamage() + hunter.getArmor());
                    enemy.setLifePoints(enemy.getLifePoints() - hunter.getWeaponDamage());

                    System.out.println("PV du Warrior:" + hunter.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

                    break;
            }

        }
        if (hunter.getLifePoints()<=0){
            System.out.println("vous avez perdu");}
        else {
            System.out.println("vous avez gagne");
        }
    }

    public static void jeuHealer(Healer healer){

    }

    public static void jeuMage(Mage mage){

    }
}
