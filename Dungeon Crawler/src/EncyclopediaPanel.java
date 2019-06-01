import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class EncyclopediaPanel extends JPanel 
{

    /**
     * Create the panel.
     */
    public EncyclopediaPanel() 
    {
        setBackground(SystemColor.info);
        setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        setLayout(null);
        
        JButton button_1 = new JButton("<-");
        button_1.setBounds(10, 596, 89, 23);
        add(button_1);
        
        JButton button = new JButton("->");
        button.setBounds(681, 596, 89, 23);
        add(button);
        
        JLabel lblDescription = new JLabel("<html>\r\nDescription:\r\n <br></br>\r\nVulnerable to Frost damage.\r\n <br></br>\r\nImmune to Fire damage.\r\n <br></br>\r\n <br></br>\r\nHailing from the northernmost reaches of the Numerian Empire, \r\n <br></br>\r\nImps have made a name for themselves by being a nuisance.\r\n</html>");
        lblDescription.setVerticalAlignment(SwingConstants.TOP);
        lblDescription.setBounds(34, 240, 338, 368);
        add(lblDescription);
        
        JLabel lblEntryName = new JLabel("Imp");
        lblEntryName.setHorizontalAlignment(SwingConstants.CENTER);
        lblEntryName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEntryName.setBounds(177, 16, 59, 30);
        add(lblEntryName);
        
        JLabel lblEnemyicon = new JLabel("");
        lblEnemyicon.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy3.gif"));
        lblEnemyicon.setBounds(125, 41, 185, 200);
        add(lblEnemyicon);
        
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\books_texture3018.jpg"));
        label.setBounds(0, 0, 776, 626);
        label.setVisible(false);
        add(label);
        
    }
}
