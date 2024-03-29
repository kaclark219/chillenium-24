import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class InventoryPanel extends JPanel {

    public JFrame inventory_frame;
 
    public JTextArea inventory;
 
    public InventoryPanel(PlayerInventory i) {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        inventory = new JTextArea();
        // inventory.setBounds(800, 100, 300, 200);
        inventory.setBackground(new Color(0, 0, 0, 0));
        inventory.setForeground(Color.white);
        // credits_text.setFont(title_font);
        inventory.setLineWrap(true);

        String inven_output = i.printInventory();
        inventory.setText(inven_output);
        this.add(inventory);
    }

    public void updateInventory(PlayerInventory i) {
        String inven_output = i.printInventory();
        inventory.setText(inven_output);
    }

}