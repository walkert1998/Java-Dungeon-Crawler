import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PartyMemberPanel extends JPanel {

    /**
     * Create the panel.
     */
    public PartyMemberPanel() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        
        JButton btnFace = new JButton("");
        btnFace.setIcon(new ImageIcon("C:\\Users\\Tommy\\workspace\\Dungeon Crawler\\Dantes.gif"));
        btnFace.setBounds(0, 25, 82, 82);
        add(btnFace);
        
        JProgressBar HealthBar = new JProgressBar();
        HealthBar.setValue(85);
        HealthBar.setForeground(new Color(255, 0, 0));
        HealthBar.setBounds(81, 25, 111, 41);
        add(HealthBar);
        
        JProgressBar ManaBar = new JProgressBar();
        ManaBar.setValue(75);
        ManaBar.setForeground(new Color(0, 191, 255));
        ManaBar.setBounds(81, 66, 111, 41);
        add(ManaBar);
        
        JButton btnLeftHand = new JButton("");
        btnLeftHand.setIcon(new ImageIcon("C:\\Users\\Tommy\\workspace\\Dungeon Master Java\\Items\\firestaff.gif"));
        btnLeftHand.setBounds(0, 107, 96, 83);
        add(btnLeftHand);
        
        JButton btnRightHand = new JButton("");
        btnRightHand.setIcon(new ImageIcon("C:\\Users\\Tommy\\workspace\\Dungeon Master Java\\Items\\bolt_blade.gif"));
        btnRightHand.setBounds(96, 107, 96, 83);
        add(btnRightHand);
        
        JButton btnX = new JButton("X");
        btnX.setBounds(132, 0, 60, 23);
        add(btnX);

    }
}
