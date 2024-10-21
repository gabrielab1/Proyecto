package rpg.inventory;

import rpg.items.misc.Potion;
import rpg.items.weapons.Sword;
import rpg.items.armors.Helmet;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Potion> potions;
    private ArrayList<Sword> weapons;
    private ArrayList<Helmet> armors;

    public Inventory() {
        potions = new ArrayList<>();
        weapons = new ArrayList<>();
        armors = new ArrayList<>();
    }

    public void addPotion(Potion potion) {
        potions.add(potion);
    }

    public void addWeapon(Sword weapon) {
        weapons.add(weapon);
    }

    public void addArmor(Helmet armor) {
        armors.add(armor);
    }

    public void showInventory() {
        System.out.println("Pociones:");
        for (Potion potion : potions) {
            System.out.println(" - " + potion.getName());
        }

        System.out.println("Armas:");
        for (Sword weapon : weapons) {
            System.out.println(" - " + weapon.getName());
        }

        System.out.println("Armaduras:");
        for (Helmet armor : armors) {
            System.out.println(" - " + armor.getName());
        }
    }
}
