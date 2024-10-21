package rpg.entities.enemies.slimes;

import rpg.entities.enemies.Enemy;
import rpg.enums.EnemyType;
import rpg.enums.Stats;
import rpg.utils.Randomize;
import rpg.entities.GameCharacter;

public class BasicSlime extends Enemy {

    public BasicSlime() {
        super("Slime Básico");
    }

    @Override
    public void getLoot() {
        System.out.println("El Slime Básico deja caer una botella de baba.");
    }

    @Override
    protected void initCharacter() {
        this.type = EnemyType.BASIC; // Aquí estamos usando EnemyType
        this.stats.put(Stats.MAX_HP, 20);
        this.stats.put(Stats.HP, 20);
        this.stats.put(Stats.ATTACK, 4);
        this.stats.put(Stats.DEFENSE, 1);
    }

    protected void splash(GameCharacter enemy) {
        String enemyName = enemy.getName();
        int newHP = enemy.getStats().get(Stats.HP);
        System.out.printf("""
                %s salpica a %s y no hace nada.
                %s tiene %d HP restante.
                """, this.name, enemyName, enemyName, newHP);
    }

    protected void throwSlime(GameCharacter enemy) {
        String enemyName = enemy.getName();
        int damage = (int) (this.stats.get(Stats.ATTACK) * 0.8);
        enemy.getStats().put(Stats.HP, enemy.getStats().get(Stats.HP) - damage);
        int newHP = enemy.getStats().get(Stats.HP);
        System.out.printf("""
                %s lanza baba a %s e inflige %d puntos de daño.
                %s tiene %d HP restante.
                """, this.name, enemyName, damage, enemyName, newHP);
    }

    @Override
    public void attack(GameCharacter enemy) {
        if (Randomize.getRandomBoolean()) splash(enemy);
        else throwSlime(enemy);
    }
}
