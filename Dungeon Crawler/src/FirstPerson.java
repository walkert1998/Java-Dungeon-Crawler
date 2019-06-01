
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.*;


import java.awt.event.*;
import java.awt.Color;

public class FirstPerson extends JFrame 
{

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                FirstPerson frame = new FirstPerson();
                frame.setVisible(true);
            }
        });
    }

    /**
     * Create the frame.
     */
    JTextArea txtra;
    static double startTime, endTime, holdTime;
    private static Timer timer;
    private FirstPersonPanel panel;
    public FirstPerson() 
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1418, 985);
        
        PartyMemberPanel member1 = new PartyMemberPanel();
        member1.setBounds(12, 12, 240, 400);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnGame = new JMenu("Game");
        menuBar.add(mnGame);
        
        JMenuItem mntmSave = new JMenuItem("Save");
        mnGame.add(mntmSave);
        
        JMenuItem mntmLoad = new JMenuItem("Load");
        mnGame.add(mntmLoad);
        
        JSeparator separator = new JSeparator();
        mnGame.add(separator);
        
        JMenuItem mntmQuit = new JMenuItem("Quit");
        mnGame.add(mntmQuit);
        
        JMenu mnOptions = new JMenu("Options");
        menuBar.add(mnOptions);
        
        JCheckBoxMenuItem chckbxmntmMusic = new JCheckBoxMenuItem("Music");
        mnOptions.add(chckbxmntmMusic);
        
        JCheckBoxMenuItem chckbxmntmSoundEffects = new JCheckBoxMenuItem("Sound Effects");
        mnOptions.add(chckbxmntmSoundEffects);
        
        JMenu mnUiColourScheme = new JMenu("UI Colour Scheme");
        mnOptions.add(mnUiColourScheme);
        
        JRadioButtonMenuItem rdbtnmntmDark = new JRadioButtonMenuItem("Dark");
        mnUiColourScheme.add(rdbtnmntmDark);
        
        JRadioButtonMenuItem rdbtnmntmBright = new JRadioButtonMenuItem("Bright");
        mnUiColourScheme.add(rdbtnmntmBright);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        panel = new FirstPersonPanel();
        InputMap im = panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = panel.getActionMap();
        holdTime=0;
        
        
        im.put(KeyStroke.getKeyStroke("W"), "Forward");
        im.put(KeyStroke.getKeyStroke("S"), "Backward");
        im.put(KeyStroke.getKeyStroke("A"), "Left");
        im.put(KeyStroke.getKeyStroke("D"), "Right");
        im.put(KeyStroke.getKeyStroke("Q"), "Look Left");
        im.put(KeyStroke.getKeyStroke("E"), "Look Right");
        
        am.put("Forward", new WASDAction("Forward"));
        am.put("Backward", new WASDAction("Backward"));
        am.put("Left", new WASDAction("Left"));
        am.put("Right", new WASDAction("Right"));
        am.put("Look Left", new WASDAction("Look Left"));
        am.put("Look Right", new WASDAction("Look Right"));
        panel.setBorder(null);
        panel.setBounds(146, 194, 770, 620);
        panel.setFocusable(true);;
        getContentPane().add(panel);
        
        txtra = new JTextArea();
        txtra.setEditable(false);
        txtra.setWrapStyleWord(true);
        txtra.setLineWrap(true);
        txtra.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        txtra.setText("");
        txtra.setBounds(146, 818, 770, 107);
        contentPane.add(txtra);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.DARK_GRAY);
        panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel_1.setBounds(926, 194, 347, 620);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        MapPanel panel_2 = new MapPanel();
        panel_2.setBounds(25, 11, 300, 300);
        panel_1.add(panel_2);
        
        JPanel magicPanel = new JPanel();
        magicPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        magicPanel.setBackground(Color.BLACK);
        magicPanel.setBounds(10, 433, 151, 176);
        panel_1.add(magicPanel);
        magicPanel.setLayout(null);
        
        JToggleButton rune1 = new JToggleButton("");
        rune1.setBounds(0, 0, 50, 50);
        magicPanel.add(rune1);
        rune1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent arg0) 
            {
                if (rune1.isSelected())
                    rune1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed1.png"));
                else
                    rune1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune1.png"));
            }
        });
        rune1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune1.png"));
        
        JToggleButton rune2 = new JToggleButton("");
        rune2.setBounds(50, 0, 50, 50);
        magicPanel.add(rune2);
        rune2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent arg0) 
            {
                if (rune2.isSelected())
                    rune2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed2.png"));
                else
                    rune2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune2.png"));
            }
        });
        rune2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune2.png"));
        
        JToggleButton rune3 = new JToggleButton("");
        rune3.setBounds(100, 0, 50, 50);
        magicPanel.add(rune3);
        rune3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if (rune3.isSelected())
                    rune3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed3.png"));
                else
                    rune3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune3.png"));
            }
        });
        rune3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune3.png"));
        
        JToggleButton rune4 = new JToggleButton("");
        rune4.setBounds(0, 51, 50, 50);
        magicPanel.add(rune4);
        rune4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if (rune4.isSelected())
                    rune4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed4.png"));
                else
                    rune4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune4.png"));
            }
        });
        rune4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune4.png"));
        
        JToggleButton rune5 = new JToggleButton("");
        rune5.setBounds(50, 51, 50, 50);
        magicPanel.add(rune5);
        rune5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if (rune5.isSelected())
                    rune5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed5.png"));
                else
                    rune5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune5.png"));
            }
        });
        rune5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune5.png"));
        
        JToggleButton rune6 = new JToggleButton("");
        rune6.setBounds(100, 51, 50, 50);
        magicPanel.add(rune6);
        rune6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if (rune6.isSelected())
                    rune6.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed6.png"));
                else
                    rune6.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune6.png")); 
            }
        });
        rune6.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune6.png"));
        
        JToggleButton rune7 = new JToggleButton("");
        rune7.setBounds(0, 102, 50, 50);
        magicPanel.add(rune7);
        rune7.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if (rune7.isSelected())
                    rune7.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed7.png"));
                else
                    rune7.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune7.png"));
            }
        });
        rune7.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune7.png"));
        
        JToggleButton rune8 = new JToggleButton("");
        rune8.setBounds(50, 102, 50, 50);
        magicPanel.add(rune8);
        rune8.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if (rune8.isSelected())
                    rune8.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed8.png"));
                else
                    rune8.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune8.png"));
            }
        });
        rune8.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune8.png"));
        
        JToggleButton rune9 = new JToggleButton("");
        rune9.setBounds(100, 102, 50, 50);
        magicPanel.add(rune9);
        rune9.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                if (rune9.isSelected())
                    rune9.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\runePressed9.png"));
                else
                    rune9.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune9.png"));
            }
        });
        rune9.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\rune9.png"));
        
        JButton button_6 = new JButton("CAST");
        button_6.setToolTipText("Cast Spell");
        button_6.setBounds(0, 152, 150, 23);
        magicPanel.add(button_6);
        
        JButton btnX = new JButton("X");
        btnX.setBounds(113, 410, 48, 23);
        panel_1.add(btnX);
        
        JPanel head_panel = new JPanel();
        head_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        head_panel.setBounds(152, 56, 60, 60);
        panel_1.add(head_panel);
        
        JPanel torso_panel = new JPanel();
        torso_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        torso_panel.setBounds(152, 150, 60, 60);
        panel_1.add(torso_panel);
        
        JPanel legs_panel = new JPanel();
        legs_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        legs_panel.setBounds(152, 238, 60, 60);
        panel_1.add(legs_panel);
        
        JPanel weapon_panel = new JPanel();
        weapon_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        weapon_panel.setBounds(61, 150, 60, 60);
        panel_1.add(weapon_panel);
        
        JPanel offhand_panel = new JPanel();
        offhand_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        offhand_panel.setBounds(240, 150, 60, 60);
        panel_1.add(offhand_panel);
        
        JLabel lblHead = new JLabel("Head:");
        lblHead.setForeground(Color.YELLOW);
        lblHead.setBounds(152, 41, 60, 14);
        panel_1.add(lblHead);
        
        JLabel lblWeapon = new JLabel("Weapon:");
        lblWeapon.setForeground(Color.YELLOW);
        lblWeapon.setBounds(61, 135, 60, 14);
        panel_1.add(lblWeapon);
        
        JLabel lblTorso = new JLabel("Torso:");
        lblTorso.setForeground(Color.YELLOW);
        lblTorso.setBounds(152, 135, 60, 14);
        panel_1.add(lblTorso);
        
        JLabel lblOffhand = new JLabel("Off-hand:");
        lblOffhand.setForeground(Color.YELLOW);
        lblOffhand.setBounds(240, 135, 60, 14);
        panel_1.add(lblOffhand);
        
        JLabel lblLegs = new JLabel("Legs:");
        lblLegs.setForeground(Color.YELLOW);
        lblLegs.setBounds(152, 221, 60, 14);
        panel_1.add(lblLegs);
        
        PartyMemberPanel panel_3 = new PartyMemberPanel();
        panel_3.setBounds(146, 0, 193, 189);
        contentPane.add(panel_3);
        
        
        
        button_6.addActionListener(new ActionListener() 
        {
            
            public void actionPerformed(ActionEvent arg0) 
            {
                FirstPersonPanel.cast();
                FirstPersonPanel.enemyCast();
            }
        });
        
        
    }
    class WASDAction extends AbstractAction 
    {
        private String x;
        public WASDAction(String X) 
        {
            x=X;
        }

        public void actionPerformed(ActionEvent e) 
        {
            switch(x)
            {
            case "Forward":
                panel.moveForward();
                txtra.setText("\nYou move forward");
                break;
            case "Backward":
                panel.moveBackward();
                txtra.setText("\nYou move backward");
                break;
            case "Left":
                panel.moveLeft();
                txtra.setText("\nYou move left");
                break;
            case "Right":
                panel.moveRight();
                txtra.setText("\nYou move right");
                break;
            case "Look Left":
                panel.lookLeft();
                txtra.setText("\nYou look leftt");
                break;
            case "Look Right":
                panel.lookRight();
                txtra.setText("\nYou look right");
                break;
            }
            
        }
    }
}