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

        Game.getInstance().start_screen.setVisible(true);

    }
}