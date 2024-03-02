import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ProgressBarPanel extends JPanel {

    public JFrame progress_frame;
 
    public JProgressBar human_bar;
    public JProgressBar life_bar;
 
    public ProgressBarPanel(ProgressBar hb, ProgressBar lb) {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        human_bar = new JProgressBar();
        life_bar = new JProgressBar();
 
        human_bar.setValue(0);
        life_bar.setValue(0);
 
        human_bar.setStringPainted(true);
        human_bar.setForeground(Color.blue);
        life_bar.setStringPainted(true);
        life_bar.setForeground(Color.red);
 
        add(human_bar);
        add(life_bar);
 
        fill(hb, lb);
    }
 
    public void fill(ProgressBar hb, ProgressBar lb) {
        float progress_frac = hb.progressFraction(hb);
        int human_progress = (int) (progress_frac * 100);
        human_bar.setValue(human_progress);
        progress_frac = lb.progressFraction(lb);
        int life_progress = (int) (progress_frac * 100);
        life_bar.setValue(life_progress);
    }
}