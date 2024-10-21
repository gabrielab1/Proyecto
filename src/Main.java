package rpg;

import rpg.entities.Player;
import rpg.entities.enemies.slimes.BasicSlime;
import rpg.inventory.Inventory;
import rpg.items.misc.Potion;
import rpg.items.weapons.Sword;
import rpg.items.armors.Helmet;

public class Main {
    public static void main(String[] args) {
        // Crear un jugador
        Player player = new Player("Hero");

        // Crear enemigos
        BasicSlime slime = new BasicSlime();

        // Crear inventario
        Inventory inventory = new Inventory();

        // Agregar ítems al inventario
        inventory.addPotion(new Potion("Pocion curativa", 20));
        inventory.addWeapon(new Sword("Espada de hierro ", 15));
        inventory.addArmor(new Helmet("Casco de acero", 5));

        // Mostrar el inventario
        inventory.showInventory();

        // Simular una batalla
        System.out.println("Un salvaje " + slime.getName() + " aparece!");
        while (player.isAlive() && slime.isAlive()) {
            player.attack(slime);
            if (slime.isAlive()) {
                slime.attack(player);
            }
        }

        // Resultado de la batalla
        if (player.isAlive()) {
            System.out.println(player.getName() + " ha derrotado a " + slime.getName() + "!");
        } else {
            System.out.println(player.getName() + " ha sido derrotado!");
        }
    }
}
