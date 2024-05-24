package heroes;

import enemies.Enemy;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);
        setDamage(20);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            System.out.println("Mage " + getName() + " наносит врагу " +
                    enemy.getName() + " " + getDamage() + " урона");
            enemy.takeDamage(getDamage(), this);
        } else {
            System.out.println("Герой " + getName() + " мертв.");
        }
    }
}
