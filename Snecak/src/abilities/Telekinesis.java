package abilities;

import hero.HeroTemplate;
import itemshandling.Inventory;
import itemshandling.ItemBase;
import monster.MonsterBase;
import players.Player;

import java.util.Scanner;

public class Telekinesis implements ThrowAbilityTemplate {

    private String name = "Telekinesis";
    private int totalDamage;
    private int manaCost = 25;
    private boolean unlocked =false;

    public Telekinesis() {
    }

    @Override
    public void cast(Player player, HeroTemplate hero, MonsterBase monster) {
        int currentMana = hero.getMana();
        int manaCost = getManaCost(); // Get the mana cost from the superclass

        if (currentMana >= manaCost) {
            hero.setMana(currentMana - manaCost);
            System.out.println("Used " + getName() + "!");
            throwItem(player.getInventory(), monster); // Throw an item from the inventory at the monster

        } else {
            System.out.println("Not enough mana to use " + getName() + " or it's not your turn.");
        }
    }

    public void throwItem(Inventory inventory, MonsterBase monster) {
        Scanner scanner = new Scanner(System.in);
        inventory.printInventory(); // Display the items in the inventory

        System.out.print("Enter the name of the item you want to throw: ");
        String itemName = scanner.nextLine();

        if (inventory.hasItemByName(itemName)) {
            ItemBase thrownItem = inventory.getItemByName(itemName); // Retrieve the item to throw

        monster.takeDamage(thrownItem.getDamage());

            System.out.println("You threw " + itemName + " at the monster!");
        } else {
            System.out.println("Item not found in inventory or invalid item name.");
        }
    }

    @Override
    public int getDamage() {
        return totalDamage;
    }

    @Override
    public void setDamage(int totalDamage) {

    }

    @Override
    public int getManaCost() {
        return manaCost;
    }

    @Override
    public void setManaCost(int manaCost) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isUnlocked() {
        return unlocked;
    }

    @Override
    public void setUnlocked() {
        unlocked = true;
    }
}
