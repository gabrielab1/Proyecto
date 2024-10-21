package rpg.items.weapons;

import rpg.enums.ItemType;

public class Sword {
    private String name;
    private ItemType type;
    private int damage;

    public Sword(String name, int damage) {
        this.name = name;
        this.type = ItemType.WEAPON;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
