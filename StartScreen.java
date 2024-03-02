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
    JPanel title_name_panel, button_panel, credits_panel, story_panel;
    JLabel title_name_label;
    Font title_font = new Font("Times New Roman", Font.PLAIN, 36);
    JTextArea credits_text, story_text;
    public JButton advance_story = new JButton("Continue");



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
        start_game.setBackground(Color.black);
        start_game.setForeground(Color.white);
        start_game.setFont(title_font);
        credits.setBackground(Color.black);
        credits.setForeground(Color.white);
        credits.setFont(title_font);
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        exit.setFont(title_font);

        title_name_panel.add(title_name_label);
        button_panel.add(start_game);
        button_panel.add(credits);
        button_panel.add(exit);

        this.add(title_name_panel);
        this.add(button_panel);


        /**
         * Goes to first game page when start button is clicked.
         */
        this.start_game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createGameScreen();
            }
        });

        /**
         * Goes to credits page when credits button is clicked.
         */
        this.credits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createCreditsScreen();
            }
        });
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

    public void createGameScreen() {
        title_name_panel.setVisible(false);
        button_panel.setVisible(false);
        ProgressBar humanity_progress = new ProgressBar();
        humanity_progress.initProgress(humanity_progress);
        ProgressBar life_progress = new ProgressBar();
        life_progress.initProgress(life_progress);

        ProgressBarPanel progress_panel = new ProgressBarPanel(humanity_progress, life_progress);
        progress_panel.setBounds(25, 25, 200, 100); // x, y, width, height
        progress_panel.setBackground(Color.black);


        PlayerInventory player_inventory = new PlayerInventory();
        player_inventory.addItem("Dented Water Bottle");
        InventoryPanel inven_panel = new InventoryPanel(player_inventory);
        inven_panel.setBounds(900, 25, 200, 200);

        story_text = new JTextArea();
        story_text.setBounds(0, 0, 700, 300);
        story_text.setBackground(Color.black);
        story_text.setForeground(Color.white);
        story_text.setLineWrap(true);
        story_text.setText("Your back hurts. The hastily made campsite last night didn't do you any favors, & the chronic fatigue is already beginning to set in. You check your pockets, your water bottle is still sitting next to you but your last bit of beef jerky is gone .. it must have been taken by the rodents last night.");

        story_text.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        story_panel = new JPanel();
        story_panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        story_panel.setBounds(100, 500, 900, 300);
        story_panel.setBackground(Color.black);
        advance_story.setBackground(Color.black);
        advance_story.setForeground(Color.white);

        story_panel.add(story_text);
        story_panel.add(advance_story);

        this.add(progress_panel);
        this.add(inven_panel);
        this.add(story_panel);

        revalidate();
        repaint();
    }

    public void createCreditsScreen() {
        title_name_panel.setVisible(false);
        button_panel.setVisible(false);

        credits_text = new JTextArea();
        credits_text.setBounds(150, 100, 800, 600);
        credits_text.setBackground(Color.black);
        credits_text.setForeground(Color.white);
        credits_text.setFont(title_font);
        credits_text.setLineWrap(true);
        credits_text.setText("Design: Katelyn Clark\nProgramming: Katelyn Clark\nAssets: Juliana Martinez\n\nStory: Katelyn Clark & Juliana Martinez\n\nCreated for Texas A&M's Chillennium Game Jam 2024.");
        this.add(credits_text);
    }
}