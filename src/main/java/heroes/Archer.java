package heroes;

import enemies.Enemy;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
        setDamage(15);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
        System.out.println("Archer " + getName() + " наносит врагу " +
                enemy.getName() + " " + getDamage() + " урона");
        enemy.takeDamage(getDamage(), this);
    } else {
        System.out.println("Герой " + getName() + " мертв.");
    }
    }
}
