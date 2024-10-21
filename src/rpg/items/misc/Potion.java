package rpg.items.misc;

import rpg.enums.ItemType;

public class Potion {
    private String name;
    private ItemType type;
    private int healAmount;

    public Potion(String name, int healAmount) {
        this.name = name;
        this.type = ItemType.MISC;
        this.healAmount = healAmount;
    }

    public String getName() {
        return name;
    }

    public int getHealAmount() {
        return healAmount;
    }
}
