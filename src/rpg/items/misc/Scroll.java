package rpg.items.misc;

import rpg.enums.ItemType;

public class Scroll {
    private String name;
    private ItemType type;
    private String effect;

    public Scroll(String name, String effect) {
        this.name = name;
        this.type = ItemType.MISC;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }
}
