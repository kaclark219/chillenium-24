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
    public JButton skip_breakfast = new JButton("Skip breakfast & sleep in.");
    public JButton scrounge = new JButton("Scrounge around for something edible.");
    public JButton can_lid = new JButton("Take the can lid.");
    public JButton eat_berries = new JButton("Eat the strange berries.");
    public JButton eat_bark = new JButton("Eat the soft bark.");
    public JButton north_or_west = new JButton("Continue");
    public JButton north = new JButton("Go North as you originally intended.");
    public JButton west = new JButton("Go West towards the sound of the water.");
    public JButton hide = new JButton("Hide, quickly!");
    public JButton towards_sound = new JButton("Take a step right towards the sound.");
    public JButton wash = new JButton("Wash your hands and face in the creek.");
    public JButton fill_water = new JButton("Fill your water bottle.");


    PlayerInventory player_inventory = new PlayerInventory();
    InventoryPanel inven_panel = new InventoryPanel(player_inventory);
    ProgressBar humanity_progress = new ProgressBar();
    // humanity_progress.initProgress(humanity_progress);
    ProgressBar life_progress = new ProgressBar();
    // life_progress.initProgress(life_progress);
    ProgressBarPanel progress_panel = new ProgressBarPanel(humanity_progress, life_progress);

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
        // ProgressBar humanity_progress = new ProgressBar();
        humanity_progress.initProgress(humanity_progress);
        // ProgressBar life_progress = new ProgressBar();
        life_progress.initProgress(life_progress);
        progress_panel.fill(humanity_progress, life_progress);

        // ProgressBarPanel progress_panel = new ProgressBarPanel(humanity_progress, life_progress);
        progress_panel.setBounds(25, 25, 200, 100); // x, y, width, height
        progress_panel.setBackground(Color.black);


        // PlayerInventory player_inventory = new PlayerInventory();
        player_inventory.addItem("Dented Water Bottle");
        // InventoryPanel inven_panel = new InventoryPanel(player_inventory);
        inven_panel.setBounds(900, 25, 200, 200);
        inven_panel.updateInventory(player_inventory);

        story_text = new JTextArea();
        story_text.setBounds(0, 0, 700, 300);
        story_text.setBackground(Color.black);
        story_text.setForeground(Color.white);
        story_text.setLineWrap(true);
        story_text.setText("Your back hurts. The hastily made campsite last night didn't do you any favors, and the chronic fatigue is already beginning to set in.");

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

        this.advance_story.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                story_text.setText("You check your pockets, your water bottle is still sitting next to you but your last bit of beef jerky is gone .. It must have been taken by the rodents last night.");
                story_panel.remove(advance_story);
                skip_breakfast.setBackground(Color.black);
                skip_breakfast.setForeground(Color.white);
                scrounge.setBackground(Color.black);
                scrounge.setForeground(Color.white);
                story_panel.add(skip_breakfast);
                story_panel.add(scrounge);
                revalidate();
                repaint();

                skip_breakfast.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        story_text.setText("The extra rest soothed you, but your stomach is growling.");
                        story_panel.remove(skip_breakfast);
                        story_panel.remove(scrounge);
                        north_or_west.setBackground(Color.black);
                        north_or_west.setForeground(Color.white);
                        story_panel.add(north_or_west);

                        humanity_progress.increaseProgress(humanity_progress);
                        humanity_progress.increaseProgress(humanity_progress);
                        life_progress.decreaseProgress(life_progress);
                        life_progress.decreaseProgress(life_progress);

                        progress_panel.fill(humanity_progress, life_progress);
                        
                        revalidate();
                        repaint();

                        north_or_west.addActionListener(northOrWestListener);
                    }
                });
                scrounge.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        story_text.setText("The area isn't teeming with life, but you manage to to find some purple-toned berries, soft tree bark, and a sharp-edged lid to a can that's long gone.");
                        story_panel.remove(skip_breakfast);
                        story_panel.remove(scrounge);
                        can_lid.setBackground(Color.black);
                        can_lid.setForeground(Color.white);
                        eat_berries.setBackground(Color.black);
                        eat_berries.setForeground(Color.white);
                        eat_bark.setBackground(Color.black);
                        eat_bark.setForeground(Color.white);
                        story_panel.add(can_lid);
                        story_panel.add(eat_berries);
                        story_panel.add(eat_bark);

                        humanity_progress.decreaseProgress(humanity_progress);
                        progress_panel.fill(humanity_progress, life_progress);
                        revalidate();
                        repaint();

                        can_lid.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                story_text.setText("This sharp edge could come in handy, although it's not edible. You take the lid and put it in your pocket, then take a sip of your water to satiate yourself.");
                                story_panel.remove(can_lid);
                                story_panel.remove(eat_berries);
                                story_panel.remove(eat_bark);
                                north_or_west.setBackground(Color.black);
                                north_or_west.setForeground(Color.white);
                                story_panel.add(north_or_west);

                                player_inventory.addItem("Sharp Can Lid");
                                inven_panel.updateInventory(player_inventory);

                                humanity_progress.decreaseProgress(humanity_progress);
                                humanity_progress.decreaseProgress(humanity_progress);
                                life_progress.decreaseProgress(life_progress);
                                life_progress.decreaseProgress(life_progress);
                                progress_panel.fill(humanity_progress, life_progress);
                                revalidate();
                                repaint();

                                north_or_west.addActionListener(northOrWestListener);
                            }
                        });
                        eat_berries.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                story_text.setText("You don't recognize these particular berries, but you're hungry to the point where you eat them anyway. You pop them in your mouth and they have a sweet taste. 20 minutes later when you're throwing them up, they're not so sweet anymore.");
                                story_panel.remove(can_lid);
                                story_panel.remove(eat_berries);
                                story_panel.remove(eat_bark);
                                north_or_west.setBackground(Color.black);
                                north_or_west.setForeground(Color.white);
                                story_panel.add(north_or_west);

                                humanity_progress.increaseProgress(humanity_progress);
                                life_progress.decreaseProgress(life_progress);
                                life_progress.decreaseProgress(life_progress);
                                life_progress.decreaseProgress(life_progress);
                                life_progress.decreaseProgress(life_progress);
                                progress_panel.fill(humanity_progress, life_progress);
                                revalidate();
                                repaint();

                                north_or_west.addActionListener(northOrWestListener);
                            }
                        });
                        eat_bark.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                story_text.setText("It's chewy and almost inedible, but your stomach feels more full after eating the bark. You save some in your pocket for later.");
                                story_panel.remove(can_lid);
                                story_panel.remove(eat_berries);
                                story_panel.remove(eat_bark);
                                north_or_west.setBackground(Color.black);
                                north_or_west.setForeground(Color.white);
                                story_panel.add(north_or_west);
                                
                                player_inventory.addItem("Soft Bark");
                                inven_panel.updateInventory(player_inventory);
                                humanity_progress.decreaseProgress(humanity_progress);
                                humanity_progress.decreaseProgress(humanity_progress);
                                life_progress.increaseProgress(life_progress);
                                life_progress.increaseProgress(life_progress);
                                progress_panel.fill(humanity_progress, life_progress);
                                revalidate();
                                repaint();

                                north_or_west.addActionListener(northOrWestListener);
                            }
                        });

                    }
                });
                
            }
        });
    }
    ActionListener northOrWestListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            story_text.setText("Time to get going. At this point, you understand that staying in one place for too long gets dangerous. You continue your path from yesterday, heading North. About 20 minutes into your hike, you hear the sound of running water from the West.");
            revalidate();
            repaint();
            story_panel.remove(north_or_west);
            north.setBackground(Color.black);
            north.setForeground(Color.white);
            west.setBackground(Color.black);
            west.setForeground(Color.white);
            story_panel.add(north);
            story_panel.add(west);

            north.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    story_text.setText("You wander North through the forest some more until you hear the sound of branches snapping to your right.");
                    story_panel.remove(north);
                    story_panel.remove(west);
                    hide.setBackground(Color.black);
                    hide.setForeground(Color.white);
                    towards_sound.setBackground(Color.black);
                    towards_sound.setForeground(Color.white);
                    story_panel.add(towards_sound);
                    story_panel.add(hide);
                    revalidate();
                    repaint();

                    towards_sound.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String story_concat = "You take a step to the right and yelp in pain. Your foot is caught in some sort of snare trap.";
                            life_progress.decreaseProgress(life_progress);
                            life_progress.decreaseProgress(life_progress);
                            if (player_inventory.contains("Sharp Can Lid")) {
                                story_concat += " You grab the sharp can lid in your pocket and saw away at the strings. Thankfully, they're made for small game so they break easily. You hobble leftwards as fast as possible, seeing a flash of a man on your right dressed in rodent pelts and smeared mud. Thankfully, you were quick enough to get out of sight before he could notice you.";
                                player_inventory.removeItem("Sharp Can Lid");
                                inven_panel.updateInventory(player_inventory);
                            }
                            else {
                                life_progress.decreaseProgress(life_progress);
                                life_progress.decreaseProgress(life_progress);
                                humanity_progress.decreaseProgress(humanity_progress);
                                story_concat += " You begin to panic, trying to tear the strings off your ankle. The rustling to your right grows louder, and you throw your body to the left, causing pain in your ankle, but it lets you get leftwards as fast as possible. With a trap still partially attached to your ankle, you see a man on your right dressed in rodent pelts and smeared mud. He sees you, but you're gone before he can act.";
                            }
                            progress_panel.fill(humanity_progress, life_progress);
                            story_text.setText(story_concat);
                            story_panel.remove(towards_sound);
                            story_panel.remove(hide);
                            
                            revalidate();
                            repaint();
                        }
                    });
                    hide.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            story_text.setText("Quickly, you sense the danger and slither under some nearby brush. You see a figure coming through the treeline. It's another person, but they're a lot less human-looking than a person should be. There's rat and squirrel pelts hanging from their belt, with a mix of blood and (what you hope is) mud smeared across their skin. It's terrifying. You stay dead silent and keep still until they're well past you, then head West to avoid their path.");
                            story_panel.remove(towards_sound);
                            story_panel.remove(hide);
                            humanity_progress.increaseProgress(humanity_progress);
                            humanity_progress.increaseProgress(humanity_progress);
                            humanity_progress.increaseProgress(humanity_progress);
                            progress_panel.fill(humanity_progress, life_progress);
                            
                            revalidate();
                            repaint();
                        }
                    });
                }
            });
            west.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    story_text.setText("You find some hope in the sound of running water and do your best to head towards it. You come across a small creek  .. it looks clean enough.");
                    story_panel.remove(north);
                    story_panel.remove(west);
                    wash.setBackground(Color.black);
                    wash.setForeground(Color.white);
                    fill_water.setBackground(Color.black);
                    fill_water.setForeground(Color.white);
                    story_panel.add(wash);
                    story_panel.add(fill_water);
                    revalidate();
                    repaint();
                }
            });
        }
    };

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