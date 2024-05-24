package enemies;

import heroes.Hero;

import java.util.Random;

public class Zombie extends Enemy {
    private final int RESPAWN_CHANCE = 3;
    private final int defaultHealth;

    public Zombie(String name, int health) {
        super(name, health);
        defaultHealth = health;
        setDamage(10);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        if(isAlive()) {
            super.takeDamage(damage, hero);
            if (!isAlive() && new Random().nextInt(RESPAWN_CHANCE) == 0) {
                System.out.println(getName() + " воскрес!");
                setHealth(defaultHealth);
            }
            attack(hero, getDamage());
        } else {
            System.out.printf("Враг %s мертв\n", getName());
        }
    }

    @Override
    public void attack(Hero hero, int damage) {
        if(isAlive()) {
            System.out.printf("Враг %s в ответ нанес герою %s %d урона\n", getName(), hero.getName(), damage);
            hero.takeDamage(damage);
        } else {
            System.out.printf("Враг %s мертв\n", getName());
        }
    }
}
