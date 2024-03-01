import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

/**
 * The GUI for the opening screen of the game.
 */
public class StartScreen extends JFrame {
    /**
     * Start Game button.
     */
    public JButton start_game = new JButton("Start");
    /**
     * Credits screen button.
     */
    public JButton credits = new JButton("Credits");
    /**
     * Exit application button.
     */
    public JButton exit = new JButton("Exit");

    /**
     * The StartScreen title, buttons, background.
     * @author Katelyn Clark
     */
    public StartScreen() {
        this.setTitle("Hanging On - A Story Based Adventure");
        this.setSize(1200, 800);

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        // this.getContentPane().add(new JLabel("Start"));

        JPanel main = new JPanel(new FlowLayout(FlowLayout.CENTER));

        main.add(start_game);
        main.add(credits);
        main.add(exit);

        this.getContentPane().add(main);

        /**
         * Exits game when exit button is clicked.
         */
        this.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game.getInstance().start_screen.setVisible(false);
            }
        });
    }
}