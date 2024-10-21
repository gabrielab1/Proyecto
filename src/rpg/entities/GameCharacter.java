package rpg.entities;

import rpg.enums.Stats;

import java.util.HashMap;

public abstract class GameCharacter {

    protected String name;
    protected HashMap<Stats, Integer> stats;

    public GameCharacter(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        initCharacter();
    }

    protected abstract void initCharacter();

    public boolean isAlive() {
        return stats.get(Stats.HP) > 0;
    }

    public void attack(GameCharacter enemy) {
        String enemyName = enemy.getName();
        int damage = this.stats.get(Stats.ATTACK) - enemy.getStats().get(Stats.DEFENSE);
        int newHP = enemy.getStats().get(Stats.HP);
        if (damage > 0) {
            newHP = enemy.getStats().get(Stats.HP) - damage;
            enemy.getStats().put(Stats.HP, newHP);
            System.out.printf("%s ataca a %s por %d daaño! %s le quedan %d HP de vida.\n",
                    this.name, enemyName, damage, enemyName, newHP);
        } else {
            System.out.printf("%s ataca a %s pero no hace daño! %s le quedan %d HP de vida.\n",
                    this.name, enemyName, enemyName, newHP);
        }
    }

    public String getName() {
        return name;
    }

    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
}
