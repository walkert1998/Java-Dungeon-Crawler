
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.dnd.*;

import java.awt.event.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

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
        setTitle("Dungeon Crawler");
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
        
        PartyMemberPanel panel_3 = new PartyMemberPanel();
        panel_3.setBounds(146, 0, 193, 189);
        contentPane.add(panel_3);
        
        JPanel magicPanel = new JPanel();
        magicPanel.setBounds(1288, 568, 151, 176);
        contentPane.add(magicPanel);
        magicPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        magicPanel.setBackground(Color.BLACK);
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
        
        MapPanel panel_2 = new MapPanel();
        panel_2.setBounds(1284, 89, 300, 300);
        contentPane.add(panel_2);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(926, 194, 347, 620);
        contentPane.add(tabbedPane);
        
        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("New tab", null, panel_1, null);
        panel_1.setBackground(new Color(105, 105, 105));
        panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel_1.setLayout(null);
        
        JPanel head_panel = new JPanel();
        head_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        head_panel.setBounds(144, 54, 60, 60);
        panel_1.add(head_panel);
        
        JPanel torso_panel = new JPanel();
        torso_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        torso_panel.setBounds(144, 148, 60, 60);
        
        panel_1.add(torso_panel);
        torso_panel.setLayout(null);
        
        JLabel label_3 = new JLabel("");
        label_3.setBounds(0, 0, 60, 60);
        torso_panel.add(label_3);
        label_3.setIcon(null);
        label_3.setTransferHandler(new TransferHandler("icon")
        {
            @Override
            public int getSourceActions(JComponent comp) {
            return MOVE;
        }});
        label_3.addMouseListener(new MouseAdapter()
        {          
            public void mousePressed(MouseEvent evt)
            {
                if (label_3.getIcon() != null)
                {
                    JComponent comp = (JComponent) evt.getSource();
                    TransferHandler th = comp.getTransferHandler();
                    th.exportAsDrag(comp, evt, TransferHandler.MOVE);
                    label_3.setIcon(null);
                }
            }
        });
        
        JPanel legs_panel = new JPanel();
        FlowLayout flowLayout_1 = (FlowLayout) legs_panel.getLayout();
        flowLayout_1.setVgap(0);
        flowLayout_1.setHgap(0);
        legs_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        legs_panel.setBounds(144, 236, 60, 60);
        panel_1.add(legs_panel);
        
        JPanel weapon_panel = new JPanel();
        weapon_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        weapon_panel.setBounds(53, 148, 60, 60);
        panel_1.add(weapon_panel);
        
        JPanel offhand_panel = new JPanel();
        offhand_panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        offhand_panel.setBounds(232, 148, 60, 60);
        panel_1.add(offhand_panel);
        
        JLabel lblHead = new JLabel("Head:");
        lblHead.setForeground(Color.YELLOW);
        lblHead.setBounds(144, 39, 60, 14);
        panel_1.add(lblHead);
        
        JLabel lblLeftHand = new JLabel("Left Hand:");
        lblLeftHand.setForeground(Color.YELLOW);
        lblLeftHand.setBounds(53, 133, 60, 14);
        panel_1.add(lblLeftHand);
        
        JLabel lblTorso = new JLabel("Torso:");
        lblTorso.setForeground(Color.YELLOW);
        lblTorso.setBounds(144, 133, 60, 14);
        panel_1.add(lblTorso);
        
        JLabel lblRightHand = new JLabel("Right Hand:");
        lblRightHand.setForeground(Color.YELLOW);
        lblRightHand.setBounds(232, 133, 60, 14);
        panel_1.add(lblRightHand);
        
        JLabel lblLegs = new JLabel("Legs:");
        lblLegs.setForeground(Color.YELLOW);
        lblLegs.setBounds(144, 219, 60, 14);
        panel_1.add(lblLegs);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBounds(10, 308, 322, 273);
        panel_1.add(panel_4);
        panel_4.setLayout(new GridLayout(5, 5, 0, 0));
        
        JPanel panel_5 = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
        flowLayout.setHgap(0);
        flowLayout.setVgap(0);
        panel_5.setBackground(Color.GRAY);
        panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_4.add(panel_5);
        
        JLabel label = new JLabel("");
        final String propertyName = "icon";
        label.setTransferHandler(new TransferHandler("icon")
        {
            @Override
            public int getSourceActions(JComponent comp) {
            return MOVE;
        }});
        label.addMouseListener(new MouseAdapter()
        {          
            public void mousePressed(MouseEvent evt)
            {
                JComponent comp = (JComponent) evt.getSource();
                TransferHandler th = comp.getTransferHandler();
                th.exportAsDrag(comp, evt, TransferHandler.MOVE);
            }
        });
        panel_5.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\shield_icon.png"));
        
        JPanel panel_6 = new JPanel();
        FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
        flowLayout_2.setVgap(0);
        flowLayout_2.setHgap(0);
        panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_6.setBackground(Color.GRAY);
        panel_4.add(panel_6);
        
        JLabel label_1 = new JLabel("");
        label_1.setTransferHandler(new TransferHandler("icon")
        {
            @Override
            public int getSourceActions(JComponent comp) {
            return MOVE;
        }});
        label_1.addMouseListener(new MouseAdapter()
        {          
            public void mousePressed(MouseEvent evt)
            {
                JComponent comp = (JComponent) evt.getSource();
                TransferHandler th = comp.getTransferHandler();
                th.exportAsDrag(comp, evt, TransferHandler.MOVE);
            }
        });
        label_1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\sword_icon.png"));
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_6.add(label_1);
        
        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_7.setBackground(Color.GRAY);
        panel_4.add(panel_7);
        
        JPanel panel_8 = new JPanel();
        panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_8.setBackground(Color.GRAY);
        panel_4.add(panel_8);
        
        JPanel panel_9 = new JPanel();
        panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_9.setBackground(Color.GRAY);
        panel_4.add(panel_9);
        
        JPanel panel_10 = new JPanel();
        panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_10.setBackground(Color.GRAY);
        panel_4.add(panel_10);
        
        JPanel panel_11 = new JPanel();
        panel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_11.setBackground(Color.GRAY);
        panel_4.add(panel_11);
        
        JPanel panel_12 = new JPanel();
        panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_12.setBackground(Color.GRAY);
        panel_4.add(panel_12);
        
        JPanel panel_13 = new JPanel();
        panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_13.setBackground(Color.GRAY);
        panel_4.add(panel_13);
        
        JPanel panel_14 = new JPanel();
        panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_14.setBackground(Color.GRAY);
        panel_4.add(panel_14);
        
        JPanel panel_15 = new JPanel();
        panel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_15.setBackground(Color.GRAY);
        panel_4.add(panel_15);
        
        JPanel panel_16 = new JPanel();
        panel_16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_16.setBackground(Color.GRAY);
        panel_4.add(panel_16);
        
        JPanel panel_17 = new JPanel();
        panel_17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_17.setBackground(Color.GRAY);
        panel_4.add(panel_17);
        
        JPanel panel_18 = new JPanel();
        panel_18.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_18.setBackground(Color.GRAY);
        panel_4.add(panel_18);
        
        JPanel panel_19 = new JPanel();
        panel_19.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_19.setBackground(Color.GRAY);
        panel_4.add(panel_19);
        
        JPanel panel_20 = new JPanel();
        panel_20.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_20.setBackground(Color.GRAY);
        panel_4.add(panel_20);
        
        JPanel panel_21 = new JPanel();
        panel_21.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_21.setBackground(Color.GRAY);
        panel_4.add(panel_21);
        
        JPanel panel_22 = new JPanel();
        panel_22.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_22.setBackground(Color.GRAY);
        panel_4.add(panel_22);
        
        JPanel panel_23 = new JPanel();
        panel_23.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_23.setBackground(Color.GRAY);
        panel_4.add(panel_23);
        
        JPanel panel_24 = new JPanel();
        panel_24.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_24.setBackground(Color.GRAY);
        panel_4.add(panel_24);
        
        JPanel panel_25 = new JPanel();
        panel_25.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_25.setBackground(Color.GRAY);
        panel_4.add(panel_25);
        
        JPanel panel_26 = new JPanel();
        panel_26.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_26.setBackground(Color.GRAY);
        panel_4.add(panel_26);
        
        JPanel panel_27 = new JPanel();
        panel_27.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_27.setBackground(Color.GRAY);
        panel_4.add(panel_27);
        
        JPanel panel_28 = new JPanel();
        panel_28.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_28.setBackground(Color.GRAY);
        panel_4.add(panel_28);
        
        JPanel panel_29 = new JPanel();
        panel_29.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_29.setBackground(Color.GRAY);
        panel_4.add(panel_29);
        
        JPanel panel_30 = new JPanel();
        panel_30.setBackground(new Color(105, 105, 105));
        tabbedPane.addTab("New tab", null, panel_30, null);
        panel_30.setLayout(null);
        
        JLabel label_2 = new JLabel("");
        label_2.setIcon(new ImageIcon("C:\\Users\\Tommy\\workspace\\Dungeon Master Java\\Heroes\\morg.gif"));
        label_2.setBounds(10, 37, 61, 61);
        panel_30.add(label_2);
        
        JLabel lblCharacterName = new JLabel("Gorgoroth");
        lblCharacterName.setForeground(new Color(255, 255, 0));
        lblCharacterName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCharacterName.setBounds(10, 0, 166, 25);
        panel_30.add(lblCharacterName);
        
        JLabel lblHealth = new JLabel("Health:");
        lblHealth.setForeground(new Color(255, 255, 0));
        lblHealth.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHealth.setBounds(81, 37, 61, 14);
        panel_30.add(lblHealth);
        
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(35);
        progressBar.setForeground(new Color(255, 0, 0));
        progressBar.setBounds(132, 37, 200, 14);
        panel_30.add(progressBar);
        
        JLabel lblEnergy = new JLabel("Energy:");
        lblEnergy.setForeground(Color.YELLOW);
        lblEnergy.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEnergy.setBounds(81, 62, 61, 25);
        panel_30.add(lblEnergy);
        
        JProgressBar progressBar_1 = new JProgressBar();
        progressBar_1.setValue(70);
        progressBar_1.setForeground(new Color(0, 255, 255));
        progressBar_1.setBounds(132, 67, 200, 14);
        panel_30.add(progressBar_1);
        
        JLabel lblXp = new JLabel("XP:");
        lblXp.setForeground(Color.YELLOW);
        lblXp.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblXp.setBounds(10, 109, 34, 25);
        panel_30.add(lblXp);
        
        JProgressBar progressBar_2 = new JProgressBar();
        progressBar_2.setValue(44);
        progressBar_2.setBackground(new Color(0, 0, 0));
        progressBar_2.setForeground(new Color(124, 252, 0));
        progressBar_2.setBounds(10, 135, 322, 25);
        panel_30.add(progressBar_2);
        
        JProgressBar progressBar_3 = new JProgressBar();
        progressBar_3.setValue(20);
        progressBar_3.setForeground(new Color(255, 255, 0));
        progressBar_3.setBackground(new Color(0, 0, 0));
        progressBar_3.setBounds(81, 225, 146, 25);
        panel_30.add(progressBar_3);
        
        JLabel lblGuns = new JLabel("Guns:");
        lblGuns.setForeground(Color.YELLOW);
        lblGuns.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGuns.setBounds(10, 225, 71, 25);
        panel_30.add(lblGuns);
        
        JButton btnLevelUp = new JButton("Level Up");
        btnLevelUp.setBounds(237, 225, 89, 25);
        panel_30.add(btnLevelUp);
        
        JLabel lblDodge = new JLabel("Dodge");
        lblDodge.setForeground(Color.YELLOW);
        lblDodge.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDodge.setBounds(10, 261, 71, 25);
        panel_30.add(lblDodge);
        
        JProgressBar progressBar_4 = new JProgressBar();
        progressBar_4.setValue(60);
        progressBar_4.setForeground(Color.YELLOW);
        progressBar_4.setBackground(Color.BLACK);
        progressBar_4.setBounds(81, 261, 146, 25);
        panel_30.add(progressBar_4);
        
        JButton button = new JButton("Level Up");
        button.setBounds(237, 260, 89, 25);
        panel_30.add(button);
        
        JLabel lblWizard = new JLabel("Level 3 Wizard");
        lblWizard.setForeground(Color.YELLOW);
        lblWizard.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblWizard.setBounds(176, 0, 166, 25);
        panel_30.add(lblWizard);
        
        
        
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