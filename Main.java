import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlayerInventory playerInventory = new PlayerInventory();

        playerInventory.items = new ArrayList<Item>();
        playerInventory.addItem("Tin of Sardines");
        playerInventory.addItem("Sharp Can Lid");
        playerInventory.addItem("Tin of Sardines");
        playerInventory.addItem("Tin of Sardines");
        boolean removed = playerInventory.removeItem("Tin of Sardines");
        if (removed == false) {
            System.out.println("No item to remove.");
        }
        playerInventory.addItem("Dented Water Bottle");
        removed = playerInventory.removeItem("Tin of Sardines");
         if (removed == false) {
            System.out.println("No item to remove.");
        }
        removed = playerInventory.removeItem("Tin of Sardines");
         if (removed == false) {
            System.out.println("No item to remove.");
        }
        playerInventory.printInventory();
    }
}