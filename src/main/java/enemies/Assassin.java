package enemies;

import heroes.Hero;

import java.util.Random;

public class Assassin extends Enemy {
    private final int MISS_CHANCE = 3;
    public Assassin(String name, int health) {
        super(name, health);
        setDamage(15);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        if(isAlive()) {
            if (new Random().nextInt(MISS_CHANCE) == 0) {
                System.out.println(getName() + " уклонился от атаки.");
            } else {
                super.takeDamage(damage, hero);
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
