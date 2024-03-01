import java.util.ArrayList;
public class PlayerInventory {
    private ArrayList<Item> items;

    public void addItem(Item i) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(i.getName())) {
                items.get(i).increaseQuantity();
                return;
            }
        }
        items.add(i);
    }

    public void removeItem(Item i) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(i.getName())) {
                items.get(i).decreaseQuantity();
                return;
            }
        }
    }

}