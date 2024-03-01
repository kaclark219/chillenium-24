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

    JFrame window;
    Container con;
    JPanel title_name_panel, button_panel;
    JLabel title_name_label;
    Font title_font = new Font("Times New Roman", Font.PLAIN, 36);


    /**
     * The StartScreen title, buttons, background.
     * @author Katelyn Clark
     */
    public StartScreen() {
        this.setTitle("Hanging On - A Story Based Adventure");
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setLayout(null);
        this.setVisible(true);
    
        title_name_panel = new JPanel();
        title_name_panel.setBounds(150, 100, 800, 200); // x, y, width, height
        title_name_panel.setBackground(Color.black);
        title_name_label = new JLabel("Hanging On");
        title_name_label.setForeground(Color.white);
        title_name_label.setFont(title_font);

        button_panel = new JPanel();
        button_panel.setBounds(450, 400, 200, 400);
        button_panel.setBackground(Color.black);
        start_game.setBackground(Color.gray);
        start_game.setForeground(Color.white);
        start_game.setFont(title_font);
        credits.setBackground(Color.gray);
        credits.setForeground(Color.white);
        credits.setFont(title_font);
        exit.setBackground(Color.gray);
        exit.setForeground(Color.white);
        exit.setFont(title_font);

        title_name_panel.add(title_name_label);
        button_panel.add(start_game);
        button_panel.add(credits);
        button_panel.add(exit);

        this.add(title_name_panel);
        this.add(button_panel);

        /**
         * Exits game when exit button is clicked.
         */
        this.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Game.getInstance().start_screen.setVisible(false);
                dispose();
            }
        });
    }
}