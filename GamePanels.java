import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The GUI for the progress bars & inventory inserts.
 */
public class GamePanels extends JFrame {
    /**
     * The progress bar for humanity level. Does this go here??
     */
    private ProgressBar humanity_progress = new ProgressBar();
    //initProgress(humanity_progress);
    /**
     * The progress bar for life level. Does this go here??
     */
    private ProgressBar life_progress = new ProgressBar();
    //initProgress(life_progress);

    /**
     * The Inventory & Progress Bar inserts.
     * @author Katelyn Clark
     */
    public GamePanels() {
        this.setSize(100, 50);
        // add to panel the progressFraction for both life & humanity progress bars
        // use progressFraction to affect the look of the progress bars
    }
}