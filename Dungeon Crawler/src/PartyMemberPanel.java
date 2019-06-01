import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PartyMemberPanel extends JPanel {

    /**
     * Create the panel.
     */
    public PartyMemberPanel() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        
        JButton btnFace = new JButton("");
        JProgressBar HealthBar = new JProgressBar();
        JProgressBar ManaBar = new JProgressBar();
        JButton btnLeftHand = new JButton("");
        JButton btnRightHand = new JButton("");
        JButton btnX = new JButton("X");
        
        
        btnFace.setIcon(new ImageIcon("C:\\Users\\Tommy\\workspace\\Dungeon Crawler\\Dantes.gif"));
        btnFace.setBounds(0, 25, 82, 82);
        add(btnFace);
        
        
        HealthBar.setValue(85);
        HealthBar.setForeground(new Color(255, 0, 0));
        HealthBar.setBounds(81, 25, 111, 41);
        add(HealthBar);
        
        
        ManaBar.setValue(75);
        ManaBar.setForeground(new Color(0, 191, 255));
        ManaBar.setBounds(81, 66, 111, 41);
        add(ManaBar);
        
        
        btnLeftHand.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                
            }
        });
        btnLeftHand.setIcon(new ImageIcon("C:\\Users\\Tommy\\workspace\\Dungeon Master Java\\Items\\firestaff.gif"));
        btnLeftHand.setBounds(0, 107, 96, 83);
        add(btnLeftHand);
        
        btnRightHand.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        btnRightHand.setIcon(new ImageIcon("C:\\Users\\Tommy\\workspace\\Dungeon Master Java\\Items\\bolt_blade.gif"));
        btnRightHand.setBounds(96, 107, 96, 83);
        add(btnRightHand);
        
        btnX.setBounds(132, 0, 60, 23);
        add(btnX);

    }
}
