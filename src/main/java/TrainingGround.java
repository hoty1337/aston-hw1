import enemies.Assassin;
import enemies.Enemy;
import enemies.Zombie;
import heroes.Hero;
import heroes.Mage;

public class TrainingGround {
    public static void main(String[] args) {
//        heroes.Hero[] heroes = {new heroes.Archer("Лучник"), new heroes.Mage("Маг"), new heroes.Warrior("Воин")};
//        enemies.Enemy enemy = new enemies.Enemy("Boss", 1000);
//        while(enemy.isAlive()) {
//            System.out.printf("У врага %s осталось %d HP\n", enemy.getName(), enemy.getHealth());
//            for (heroes.Hero hero : heroes) {
//                hero.attackEnemy(enemy);
//            }
//        }
//        System.out.println("Победа!!!");

        Hero hero = new Mage("Маг", 100);
        Enemy[] enemies = {new Zombie("Зомби", 50), new Assassin("Ассасин", 50)};
        while(hero.isAlive() && (enemies[0].isAlive() || enemies[1].isAlive())) {
            for(Enemy enemy : enemies) {
                hero.attackEnemy(enemy);
                System.out.printf("У врага %s осталось %d HP\n", enemy.getName(), Math.max(enemy.getHealth(), 0));
                System.out.printf("У героя %s осталось %d HP\n", hero.getName(), Math.max(hero.getHealth(), 0));
            }
        }

    }
}
