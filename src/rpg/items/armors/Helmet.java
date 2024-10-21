package rpg.items.armors;

import rpg.enums.ItemType;

public class Helmet {
    private String name;
    private ItemType type;
    private int defense;

    public Helmet(String name, int defense) {
        this.name = name;
        this.type = ItemType.ARMOR;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }
}
