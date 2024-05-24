package enemies;

import abilities.Mortal;
import heroes.Hero;

public abstract class Enemy implements Mortal {
    private final String name;
    private int health;
    private int damage;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage, Hero hero) {
        health -= damage;
    }

    abstract public void attack(Hero hero, int damage);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
