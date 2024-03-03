import javax.swing.*;
import java.awt.*;

public class ProgressBar {
    /**
     * Maximum progress level, hard coded.
     */
    public int PROGRESS_MAX = 10;
    /**
     * Minimum progress level, hard coded.
     */
    public int PROGRESS_MIN = 0;

    /**
     * Current progress level for that particular bar.
     */
    private int current_progress;

    /**
     * Initializes the progress bar to the maximum level.
     * The players get to start at full health & full humanity.
     * @author Katelyn Clark
     * @param p The progress bar being initialized.
     */
    public void initProgress(ProgressBar p) {
        p.current_progress = 8;
    }

    /**
     * Increases the progress bar by one level.
     * @author Katelyn Clark
     * @param p The progress bar being incremented.
     */
    public void increaseProgress(ProgressBar p) {
        if (p.current_progress < PROGRESS_MAX) {
            p.current_progress++;
        }
    }

    /**
     * Decreases the progress bar by one level.
     * @author Katelyn Clark
     * @param p The progress bar being decremented.
     */
    public void decreaseProgress(ProgressBar p) {
        if (p.current_progress > PROGRESS_MIN) {
            p.current_progress--;
        }
    }

    /**
     * Returns the current progress level.
     * @author Katelyn Clark
     * @param p The progress bar to get current progress from.
     * @return The current progress level.
     */
    public int getProgress(ProgressBar p) {
        return p.current_progress;
    }

    /**
     * Returns the current progress level out of the maximum.
     * @author Katelyn Clark
     * @param p The progress bar to get current ratio from.
     * @return The current progress fraction.
     */
    public float progressFraction(ProgressBar p) {
        return (float) p.current_progress / PROGRESS_MAX;
    }
}