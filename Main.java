import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlayerInventory playerInventory = new PlayerInventory();

        playerInventory.items = new ArrayList<Item>();
        playerInventory.addItem("Tin of Sardines");
        playerInventory.addItem("Sharp Can Lid");
        playerInventory.addItem("Tin of Sardines");
        playerInventory.addItem("Tin of Sardines");
        playerInventory.removeItem("Tin of Sardines");
        playerInventory.addItem("Dented Water Bottle");
        playerInventory.printInventory();
    }
}