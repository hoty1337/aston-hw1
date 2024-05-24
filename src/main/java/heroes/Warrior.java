package heroes;

import enemies.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
        setDamage(10);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
        System.out.println("Warrior " + getName() + " наносит врагу " +
                enemy.getName() + " " + getDamage() + " урона");
        enemy.takeDamage(getDamage(), this);
    } else {
        System.out.println("Герой " + getName() + " мертв.");
    }
    }
}
