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

        // initialize all player objects
        PlayerInventory player_inventory = new PlayerInventory();
        // ProgressBar humanity_progress = new ProgressBar();
        // humanity_progress.initProgress(humanity_progress);
        // ProgressBar life_progress = new ProgressBar();
        // life_progress.initProgress(life_progress);
        

        Game.getInstance().start_screen.setVisible(true);

    }
}