import java.util.ArrayList;
public class PlayerInventory extends Item {

    public ArrayList<Item> items;

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

    public void printInventory() {
        for (int i = 0; i < items.size(); i++) {
            // if the number == 0, don't output
            if (items.get(i).getQuantity() != 0) {
                System.out.println(items.get(i).getName() + " ... " + items.get(i).getQuantity());
            }
        }
    }
}