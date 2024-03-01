import java.util.ArrayList;

public class Game {

    private static Game instance; 

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public StartScreen start_screen = new StartScreen();

    public static void main(String[] args) {
        // PlayerInventory playerInventory = new PlayerInventory();

        // playerInventory.items = new ArrayList<Item>();
        // playerInventory.addItem("Tin of Sardines");
        // playerInventory.addItem("Sharp Can Lid");
        // playerInventory.addItem("Tin of Sardines");
        // playerInventory.addItem("Tin of Sardines");
        // boolean removed = playerInventory.removeItem("Tin of Sardines");
        // if (removed == false) {
        //     System.out.println("No item to remove.");
        // }
        // playerInventory.addItem("Dented Water Bottle");
        // removed = playerInventory.removeItem("Tin of Sardines");
        //  if (removed == false) {
        //     System.out.println("No item to remove.");
        // }
        // removed = playerInventory.removeItem("Tin of Sardines");
        //  if (removed == false) {
        //     System.out.println("No item to remove.");
        // }
        // playerInventory.printInventory();

        Game.getInstance().start_screen.setVisible(true);

    }
}