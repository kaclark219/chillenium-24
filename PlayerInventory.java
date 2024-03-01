import java.util.ArrayList;
public class PlayerInventory extends Item {

    private ArrayList<Item> items;

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

    public void removeItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(name)) {
                decreaseQuantity(items.get(i));
                return;
            }
        }
        System.out.println("Item not found. ERROR.");
    }

    public void printInventory() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName() + " ... " + items.get(i).getQuantity());
        }
    }

}