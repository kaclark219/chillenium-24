public class ProgressBar {
    public int PROGRESS_MAX = 30;
    public int PROGRESS_MIN = 0;

    private int current_progress;

    public void initProgress(ProgressBar p) {
        p.current_progress = PROGRESS_MAX;
    }

    public void increaseProgress(ProgressBar p) {
        if (p.current_progress < PROGRESS_MAX) {
            p.current_progress++;
        }
    }

    public void decreaseProgress(ProgressBar p) {
        if (p.current_progress > PROGRESS_MIN) {
            p.current_progress--;
        }
    }

    public int getProgress(ProgressBar p) {
        return p.current_progress;
    }
}