import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class PartyMemberPanel extends JPanel {

    /**
     * Create the panel.
     */
    public PartyMemberPanel() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);
        
        JButton btnFace = new JButton("");
        btnFace.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        JProgressBar HealthBar = new JProgressBar();
        JProgressBar ManaBar = new JProgressBar();
        JButton btnLeftHand = new JButton("");
        JButton btnRightHand = new JButton("");
        JButton btnX = new JButton("X");
        
        
        btnFace.setIcon(new ImageIcon("C:\\Users\\Tommy\\git\\Java-Dungeon-Crawler\\Dungeon Crawler\\Dantes.gif"));
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
        
        JPanel runePanel = new JPanel();
        runePanel.setBounds(0, 25, 192, 165);
        runePanel.setVisible(false);
        add(runePanel);
        runePanel.setLayout(new GridLayout(3, 3, 0, 0));
        
        JButton btnRune1 = new JButton("New button");
        btnRune1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                
            }
        });
        runePanel.add(btnRune1);
        
        JButton btnRune2 = new JButton("New button");
        btnRune2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        runePanel.add(btnRune2);
        
        JButton btnRune3 = new JButton("New button");
        btnRune3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        runePanel.add(btnRune3);
        
        JButton btnRune4 = new JButton("New button");
        btnRune4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        runePanel.add(btnRune4);
        
        JButton btnRune5 = new JButton("New button");
        btnRune5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        runePanel.add(btnRune5);
        
        JButton btnRune6 = new JButton("New button");
        btnRune6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        runePanel.add(btnRune6);
        
        JButton btnRune7 = new JButton("New button");
        btnRune7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        runePanel.add(btnRune7);
        
        JButton btnRune8 = new JButton("New button");
        btnRune8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        runePanel.add(btnRune8);
        
        JButton btnRune9 = new JButton("New button");
        btnRune9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
        runePanel.add(btnRune9);

    }
}
