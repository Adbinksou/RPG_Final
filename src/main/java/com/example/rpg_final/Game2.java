package com.example.rpg_final;




import org.junit.Test;

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
        switch (scan) {
            case 1:
                jeuWarrior(new Warrior(100, 20, 5));
                break;
            case 2:
                jeuHunter(new Hunter(60, 25, 6, 4));
                break;
            case 3:
                jeuHealer(new Healer(80, 5, 2, 20, 5));
                break;
            case 4:
                jeuMage(new Mage(75, 25, 0, 20, 5));
        }
    }


    /**
     * Fonction qui prend en charge le combat du warrior
     *
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

            enemy = new Enemy(200, 30);
            System.out.println("Un boss est apparu");
        } else {
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
        if (warrior.getLifePoints() <= 0) {
            System.out.println("vous avez perdu");
        } else {
            System.out.println("vous avez gagne");
        }

    }


    public static void jeuHunter(Hunter hunter) {
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

            enemy = new Enemy(200, 30);
            System.out.println("Un boss est apparu");
        } else {
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
            int choixHunter = scanner.nextInt();
            switch (choixHunter) {
                case 1:
                    System.out.println("Vous attaquez");
                    hunter.setLifePoints(hunter.getLifePoints() - enemy.getEnemyDamage());
                    enemy.setLifePoints(enemy.getLifePoints() - hunter.getWeaponDamage());

                    System.out.println("PV du Hunter:" + hunter.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

                    break;
                case 2:
                    if (hunter.getNumArrows() >= 1) {
                        hunter.setLifePoints(hunter.getLifePoints() - enemy.getEnemyDamage());
                        enemy.setLifePoints(enemy.getLifePoints() - hunter.getWeaponDamage() - 4);

                        System.out.println("PV du Hunter:" + hunter.getLifePoints());
                        System.out.println("PV de l'Enemie:" + enemy.getLifePoints());
                        hunter.setNumArrows(hunter.getNumArrows() - 1);
                        System.out.println("\nVous avez maintenant:" + hunter.getNumArrows() + "fleche(s)");
                    } else {
                        System.out.println("VOus n'avez plus de fleche");
                    }
                    break;

                case 3:
                    System.out.println("Vous defendez");
                    hunter.setLifePoints(hunter.getLifePoints() - enemy.getEnemyDamage() + hunter.getArmor());
                    enemy.setLifePoints(enemy.getLifePoints() - hunter.getWeaponDamage());

                    System.out.println("PV du Hunter:" + hunter.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

                    break;
            }

        }
        if (hunter.getLifePoints() <= 0) {
            System.out.println("vous avez perdu");
        } else {
            System.out.println("vous avez gagne");
        }
    }

    public static void jeuHealer(Healer healer) {
        System.out.println("PV du Healer:" + healer.getLifePoints());

        System.out.println("Nombre de potions:" + healer.getNumPotion());

        /**
         * 1 chance sur 6 de faire apparaitre un Boss, sans utiliser la classe Boss mais juste changer les stats de enemy
         */
        ///
        Random random = new Random();
        int nb;
        nb = random.nextInt(6);
        Enemy enemy = null;

        if (nb == 5) {

            enemy = new Enemy(200, 30);
            System.out.println("Un boss est apparu");
        } else {
            enemy = new Enemy(100, 15);
            System.out.println("Un enemie classique est apparu");
        }
        ///
        System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

        while (enemy.getLifePoints() > 0 && healer.getLifePoints() > 0) {


            System.out.println("Que voulez vous faire ?");
            System.out.println("(1) Lancer un sort");
            System.out.println("(2) Utiliser une potion");
            System.out.println("(3) Defendre");

            int choixHealer = scanner.nextInt();
            switch (choixHealer) {
                case 1:
                    System.out.println("Vous attaquez");
                    healer.setLifePoints(healer.getLifePoints() - enemy.getEnemyDamage());
                    enemy.setLifePoints(enemy.getLifePoints() - healer.getWeaponDamage());

                    System.out.println("PV du Hunter:" + healer.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

                    break;
                case 2:
                    if (healer.getNumPotion() >= 1) {
                        healer.setLifePoints(healer.getLifePoints() - enemy.getEnemyDamage() + 8);
                        enemy.setLifePoints(enemy.getLifePoints() - healer.getWeaponDamage());

                        System.out.println("PV du Healer:" + healer.getLifePoints());
                        System.out.println("PV de l'Enemie:" + enemy.getLifePoints());
                        healer.setNumPotion(healer.getNumPotion() - 1);
                        System.out.println("\nVous avez maintenant:" + healer.getNumPotion() + "potion(s)");
                    } else {
                        System.out.println("VOus n'avez plus de potion");
                    }
                    break;

                case 3:
                    System.out.println("Vous defendez");
                    healer.setLifePoints(healer.getLifePoints() - enemy.getEnemyDamage() + healer.getArmor());
                    enemy.setLifePoints(enemy.getLifePoints() - healer.getWeaponDamage());

                    System.out.println("PV du Healer:" + healer.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

                    break;
            }

        }
        if (healer.getLifePoints() <= 0) {
            System.out.println("vous avez perdu");
        } else {
            System.out.println("vous avez gagne");
        }
    }

    public static void jeuMage(Mage mage) {
        System.out.println("PV du Mage:" + mage.getLifePoints());
        System.out.println("Point de Mana:" + mage.getManaPoint());

        /**
         * 1 chance sur 6 de faire apparaitre un Boss, sans utiliser la classe Boss mais juste changer les stats de enemy
         */
        ///
        Random random = new Random();
        int nb;
        nb = random.nextInt(6);
        Enemy enemy = null;

        if (nb == 5) {

            enemy = new Enemy(200, 30);
            System.out.println("Un boss est apparu");
        } else {
            enemy = new Enemy(100, 15);
            System.out.println("Un enemie classique est apparu");
        }
        ///

        System.out.println("PV de l'Enemie:" + enemy.getLifePoints());

        while (enemy.getLifePoints() > 0 && mage.getLifePoints() > 0) {


            System.out.println("Que voulez vous faire ?");
            System.out.println("(1) Lancer un sort");
            System.out.println("(2)Coups de poing");
            System.out.println("(3) Defendre");

            int choixMage = scanner.nextInt();
            switch (choixMage) {
                case 1:
                    if (mage.getManaPoint() >= mage.getCostMana()) {
                        System.out.println("Vous lancez un sort");

                        mage.setLifePoints(mage.getLifePoints() - enemy.getEnemyDamage());
                        enemy.setLifePoints(enemy.getLifePoints() - mage.getWeaponDamage());

                        System.out.println("PV du Hunter:" + mage.getLifePoints());
                        System.out.println("PV de l'Enemie:" + enemy.getLifePoints());
                    }
                    else {
                        System.out.println("Vous n'avez pas assez de point de mana");
                    }

                case 2:
                    System.out.println("Vous attaquez au poing");
                    mage.setLifePoints(mage.getLifePoints() - enemy.getEnemyDamage());
                    enemy.setLifePoints(enemy.getLifePoints() - mage.getWeaponDamage() + 3);

                    System.out.println("PV du Hunter:" + mage.getLifePoints());
                    System.out.println("PV de l'Enemie:" + enemy.getLifePoints());


            }
        }
    }




}

