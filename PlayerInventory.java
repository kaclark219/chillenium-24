import java.util.ArrayList;
public class PlayerInventory extends Item {
    /**
     * The list of inventory items the player has.
     */
    public ArrayList<Item> items;

    /**
     * Adds one of an item to the player's inventory.
     * @author Katelyn Clark
     * @param name The item being added to inventory.
     */
    public void addItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(name)) {
                increaseQuantity(items.get(i));
                return;
            }
        }
        Item new_item = new Item();
        new_item.setName(name);
        new_item.setQuantity(1);
        items.add(new_item);
        System.out.println("New item added: " + name);
    }

    /**
     * Removes one of an item from player's inventory.
     * @author Katelyn Clark
     * @param name The item being removed from inventory.
     * @return True if the item was removed, false if not.
     */
    public boolean removeItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(name) && items.get(i).getQuantity() > 0) {
                decreaseQuantity(items.get(i));
                return true;
            }
            else if (items.get(i).getQuantity() == 0) {
                return false;
            }
        }
        System.out.println("Item not found. ERROR.");
        return false;
    }

    /**
     * Prints out current inventory items of quantity more than 1.
     * @author Katelyn Clark
     */
    public void printInventory() {
        for (int i = 0; i < items.size(); i++) {
            // if the number == 0, don't output
            if (items.get(i).getQuantity() != 0) {
                System.out.println(items.get(i).getName() + " ... " + items.get(i).getQuantity());
            }
        }
    }
}