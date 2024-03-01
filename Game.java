import java.util.ArrayList;

public class Game {

    /**
     * Game instance.
     */
    private static Game instance; 

    /**
     * Creates a new instance of the game running.
     *
     * @author Katelyn Clark
     * @return The instance of the game running.
     */
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    /**
     * The start screen of the game.
     */
    public StartScreen start_screen = new StartScreen();

    public static void main(String[] args) {

        PlayerInventory player_inventory = new PlayerInventory();

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