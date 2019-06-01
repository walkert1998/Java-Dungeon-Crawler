import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FirstPersonPanel extends JPanel
{

    /**
     * Create the panel.
     */
    private static JLabel lblLayer1, lblLayer2, lblLayer3, lblLayer4, lblLayer5, lblLayerCenter;
    private  JLabel lblEnemy1, lblEnemy2, lblEnemy3, lblEnemy4;
    private static ImageIcon layer1Default, layer1A, layer1B, layer1C, layer1Wall;
    private static ImageIcon layer2Default, layer2A, layer2B, layer2C, layer2Wall;
    private static ImageIcon layer3Default, layer3A, layer3B, layer3C, layer3Wall;
    private static ImageIcon layer4Default, layer4A, layer4B, layer4C, layer4Wall;
    private static ImageIcon layer5Default, layer5A, layer5B, layer5C, layer5Wall;
    private static JLabel lblPlayerSpell1,lblPlayerSpell2,lblPlayerSpell3,lblPlayerSpell4;
    private static JLabel lblEnemySpell1,lblEnemySpell2,lblEnemySpell3,lblEnemySpell4;
    private static int tile1, tile2, tile3, tile4, tile5;//icon# for layer 1, 2, 3, 4, 5 and the direction player is facing
    private static int row, column, wall, h;
    private static int[][] tiles;
    private static int i=1;
    private static int i2=1;
    private static int i3=1;
    private static int i4=1;
    private static String d;
    private static ImageIcon j;
    static Timer timer1,timer2, timer3, timer4;
    private static JLabel[] labels = new JLabel[5];
    private  Boolean enemy_visible_1 = false;
    private  Boolean enemy_visible_2 = false;
    private  Boolean enemy_visible_3 = false;
    private  Boolean enemy_visible_4 = false;
    private LevelMap level;
    private Enemy [] enemies;
    public FirstPersonPanel() 
    {
        setBackground(Color.BLACK);
        setLayout(null);
        setPreferredSize(new Dimension(780, 630));
        h=0;
        
        level = new LevelMap();
        
        d="E";
        row=2;
        column=2;
        labels[1]=lblPlayerSpell1;
        labels[2]=lblPlayerSpell2;
        labels[3]=lblPlayerSpell3;
        labels[4]=lblPlayerSpell4;
        
        layer1A = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1a.png");
        layer1B = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1b.png");
        layer1C = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1c.png");
        layer1Wall = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1wall.png");
        layer1Default = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1template.png");
        
        layer2A = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2a.png");
        layer2B = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2b.png");
        layer2C = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2c.png");
        layer2Wall = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2wall.png");
        layer2Default = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2template.png");

        layer3A = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3a.png");
        layer3B = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3b.png");
        layer3C = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3c.png");
        layer3Wall = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3wall.png");
        layer3Default = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3template.png");
        
        layer4A = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4a.png");
        layer4B = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4b.png");
        layer4C = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4c.png");
        layer4Wall = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4wall.png");
        layer4Default = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4template.png");
        
        layer5A = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5a.png");
        layer5B = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5b.png");
        layer5C = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5c.png");
        layer5Wall = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5wall.png");
        layer5Default = new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5template.png");
        
        lblPlayerSpell1 = new JLabel("");
        lblPlayerSpell1.setIcon(null);
        lblPlayerSpell1.setBounds(549, 419, 120, 120);
        add(lblPlayerSpell1);
        
        lblPlayerSpell2 = new JLabel("");
        lblPlayerSpell2.setIcon(null);
        lblPlayerSpell2.setBounds(510, 395, 90, 90);
        add(lblPlayerSpell2);
        
        lblPlayerSpell3 = new JLabel("");
        lblPlayerSpell3.setIcon(null);
        lblPlayerSpell3.setBounds(470, 365, 60, 60);
        add(lblPlayerSpell3);
        
        lblPlayerSpell4 = new JLabel("");
        lblPlayerSpell4.setIcon(null);
        lblPlayerSpell4.setBounds(410, 332, 30, 30);
        add(lblPlayerSpell4);
        
        lblEnemy4 = new JLabel("");
        lblEnemy4.setIcon(null);
        lblEnemy4.setVerticalAlignment(SwingConstants.BOTTOM);
        lblEnemy4.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnemy4.setBounds(98, 79, 585, 473);
        add(lblEnemy4);
        
        lblEnemy3 = new JLabel("");
        lblEnemy3.setIcon(null);
        lblEnemy3.setVerticalAlignment(SwingConstants.BOTTOM);
        lblEnemy3.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnemy3.setBounds(185, 149, 410, 332);
        add(lblEnemy3);
        
        lblEnemy2 = new JLabel("");
        lblEnemy2.setIcon(null);
        lblEnemy2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblEnemy2.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnemy2.setBounds(247, 199, 287, 233);
        add(lblEnemy2);
        
        lblEnemy1 = new JLabel("");
        lblEnemy1.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnemy1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblEnemy1.setBounds(297, 239, 187, 152);
        add(lblEnemy1);
        
        lblEnemySpell1 = new JLabel("");
        lblEnemySpell1.setBounds(325, 320, 30, 30);
        add(lblEnemySpell1);
        
        lblEnemySpell2 = new JLabel("");
        lblEnemySpell2.setBounds(240, 355, 60, 60);
        add(lblEnemySpell2);
        
        lblEnemySpell3 = new JLabel("");
        lblEnemySpell3.setBounds(170, 385, 90, 90);
        add(lblEnemySpell3);
        
        lblEnemySpell4 = new JLabel("");
        lblEnemySpell4.setBounds(99, 409, 120, 120);
        add(lblEnemySpell4);
        
        lblLayer5 = new JLabel("");
        lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5template.png"));
        lblLayer5.setBounds(0, 0, 780, 630);
        add(lblLayer5);
        
        lblLayer4 = new JLabel("");
        lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4template.png"));
        lblLayer4.setBounds(98, 79, 585, 473);
        add(lblLayer4);
        
        lblLayer3 = new JLabel("");
        lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3template.png"));
        lblLayer3.setBounds(185, 149, 410, 332);
        add(lblLayer3);
        
        lblLayer2 = new JLabel("");
        lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2template.png"));
        lblLayer2.setHorizontalAlignment(SwingConstants.LEFT);
        lblLayer2.setBounds(247, 199, 287, 233);
        add(lblLayer2);
        
        lblLayer1 = new JLabel("");
        lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1template.png"));
        lblLayer1.setBounds(297, 239, 187, 152);
        add(lblLayer1);
        
        lblLayerCenter = new JLabel("");
        lblLayerCenter.setBounds(332, 267, 117, 96);
        add(lblLayerCenter);

        tiles = level.getMap(1);
        enemies = level.getEnemies(1);
        System.out.println(level.getEnemyCount());
        for (int i = 0; i < level.getEnemyCount(); i++)
            spawnEnemy(enemies[i], enemies[i].getEnemyXPosition(), enemies[i].getEnemyYPosition());
        for (int i = 0; i < level.getEnemyCount(); i++)
            System.out.println(enemies[i].getEnemyXPosition() +" "+ enemies[i].getEnemyYPosition());
        update();
    }
    
    public void moveForward()
    {
        switch(d)
        {
        case "N":
            if(row > 1 && tiles[column][row-1] == 0)
            {
                row--;
                MapPanel.moveUp();
                //AutomapPanel.moveUp();
                update();
            }
            break;
        case "E":
            if(column < 14 && tiles[column+1][row] == 0)
            {
                column++;
                MapPanel.moveRight();
                //AutomapPanel.moveRight();
                update();
            }
            break;
        case "S":
            if(row < 14 && tiles[column][row+1] == 0)
            {
                row++;
                MapPanel.moveDown();
                //AutomapPanel.moveDown();
                update();
            }
            break;
        case "W":
            if(column > 1 && tiles[column-1][row] == 0)
            {
                column--;
                MapPanel.moveLeft();
                //AutomapPanel.moveLeft();
                update();
            }
            break;
        }
    }
    public void moveBackward()
    {
        switch(d)
        {
        case "N":
            if(row < 14 && tiles[column][row+1] == 0)
            {
                row++;
                MapPanel.moveDown();
                //AutomapPanel.moveDown();
                update();
            }
            break;
        case "E":
            if(column > 1 && tiles[column-1][row] == 0)
            {
                column--;
                MapPanel.moveLeft();
                //AutomapPanel.moveLeft();
                update();
            }
            break;
        case "S":
            if(row > 1 && tiles[column][row-1] == 0)
            {
                row--;
                MapPanel.moveUp();
                //AutomapPanel.moveUp();
                update();
            }
            break;
        case "W":
            if(column < 14 && tiles[column+1][row] == 0)
            {
                column++;
                MapPanel.moveRight();
                //AutomapPanel.moveRight();
                update();
            }
            break;
        }
    }
    public  void moveLeft()
    {
        switch(d)
        {
        case "N":
            if(column > 1 && tiles[column-1][row] == 0)
            {
                column--;
                MapPanel.moveLeft();
                //AutomapPanel.moveDown();
                update();
            }
            break;
        case "E":
            if(row > 1 && tiles[column][row-1] == 0)
            {
                row--;
                MapPanel.moveUp();
                //AutomapPanel.moveLeft();
                update();
            }
            break;
        case "S":
            if(column < 14 && tiles[column+1][row] == 0)
            {
                column++;
                MapPanel.moveRight();
                //AutomapPanel.moveUp();
                update();
            }
            break;
        case "W":
            if(row < 14 && tiles[column][row+1] == 0)
            {
                row++;
                MapPanel.moveDown();
                //AutomapPanel.moveRight();
                update();
            }
            break;
        }
    }
    public  void moveRight()
    {
        switch(d)
        {
        case "N":
            if(column < 14 && tiles[column+1][row] == 0)
            {
                column++;
                MapPanel.moveRight();
                //AutomapPanel.moveUp();
                update();
            }
            break;
        case "E":
            if(row < 14 && tiles[column][row+1] == 0)
            {
                row++;
                MapPanel.moveDown();
                //AutomapPanel.moveRight();
                update();
            }
            break;
        case "S":
            if(column > 1 && tiles[column-1][row] == 0)
            {
                column--;
                MapPanel.moveLeft();
                //AutomapPanel.moveDown();
                update();
            }
            break;
        case "W":
            if(row > 1 && tiles[column][row-1] == 0)
            {
                row--;
                MapPanel.moveUp();
                //AutomapPanel.moveLeft();
                update();
            }
            break;
        }
    }
    public  void lookLeft()
    {
        switch(d)
        {
        case "N":
            d="W";
            update();
            break;
        case "E":
            d="N";
            update();
            break;
        case "S":
            d="E";
            update();
            break;
        case "W":
            d="S";
            update();
            break;
        }
        MapPanel.updateMap();
    }
    public  void lookRight()
    {
        switch(d)
        {
        case "N":
            d="E";
            update();
            break;
        case "E":
            d="S";
            update();
            break;
        case "S":
            d="W";
            update();
            break;
        case "W":
            d="N";
            update();
            break;
        }
        MapPanel.updateMap();
    }
    
    
    
    
    public static void overheadSlash()
    {
        System.out.println("You Bludgeon.");
    }
    
    public static void leftSlash()
    {
        System.out.println("You Slash Left.");
    }
    
    public static void rightSlash()
    {
        System.out.println("You Slash Right.");
    }
    
    public static void cast()
    {
        int delay = 70; //milliseconds
        if (timer1 != null && timer1.isRunning())
            return;
        ActionListener taskPerformer = new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                switch(i)
                {
                case 1:
                    lblPlayerSpell1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\Arrow_1.png"));
                    break;
                case 2:
                    lblPlayerSpell1.setIcon(null);
                    lblPlayerSpell2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\Arrow_2.png"));
                    break;
                case 3:
                    lblPlayerSpell2.setIcon(null);
                    lblPlayerSpell3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\Arrow_3.png"));
                    break;
                case 4:
                    lblPlayerSpell3.setIcon(null);
                    lblPlayerSpell4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\Arrow_4.png"));
                    break;
                case 5:
                    lblPlayerSpell4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\frost_hit4.png"));
                    break;
                default:
                    lblPlayerSpell4.setIcon(null);
                    i=0;
                    timer1.stop();
                    break;
                }
                
                i++;
            }
        };
        timer1 = new Timer(0, taskPerformer);
        timer1.setDelay(60);
        timer1.start();
    }
    
    public static void enemyCast()
    {
        int delay = 70; //milliseconds
        if ( timer2 != null && timer2.isRunning() ) return;
        ActionListener taskPerformer = new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                
                switch(i2)
                {
                case 1:
                    lblEnemySpell1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemyFireball_4.png"));
                    break;
                case 2:
                    lblEnemySpell1.setIcon(null);
                    lblEnemySpell2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemyFireball_3.png"));
                    break;
                case 3:
                    lblEnemySpell2.setIcon(null);
                    lblEnemySpell3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemyFireball_2.png"));
                    break;
                case 4:
                    lblEnemySpell3.setIcon(null);
                    lblEnemySpell4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemyFireball_1.png"));
                    break;
                case 5:
                    lblEnemySpell4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\fire_hit.png"));
                    break;
                default:
                    lblEnemySpell4.setIcon(null);
                    i2=0;
                    timer2.stop();
                    break;
                }
                i2++;
            }
        };
        timer2 = new Timer(0, taskPerformer);
        timer2.setDelay(60);
        timer2.start();
    }
    
    public void enemyMove()
    {
        
        if ( timer4 != null && timer4.isRunning() ) return;
        ActionListener taskPerformer = new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                
                switch(i4)
                {
                case 1:
                    lblEnemy1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy4.gif"));
                    break;
                case 2:
                    lblEnemy1.setIcon(null);
                    lblEnemy2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy3.gif"));
                    break;
                case 3:
                    lblEnemy2.setIcon(null);
                    lblEnemy3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy2.gif"));
                    break;
                case 4:
                    lblEnemy3.setIcon(null);
                    lblEnemy4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy1.gif"));
                    break;
                
                default:
                    lblEnemy4.setIcon(null);
                    i4=0;
                    timer4.stop();
                    break;
                }
                i4++;
            }
        };
        timer4 = new Timer(0, taskPerformer);
        timer4.setDelay(1000);
        timer4.start();
    }
    
    public void update()
    {
        boolean someone = false;
        for (int i = 0; i < level.getEnemyCount(); i++)
        {

            System.out.println("Visibility: " + enemyVisible(enemies[i]));
            if (enemyVisible(enemies[i]))
            {
                someone = true;
                System.out.println("fuckers visible");
                showEnemy(enemies[i]);
                System.out.println(i+" "+column+" "+row+" "+" "+(enemies[i].getEnemyXPosition() - getPlayerX())+" "+(enemies[i].getEnemyYPosition() - getPlayerY()));
            }
            else if (!someone)
            {
                lblEnemy1.setIcon(null);
                lblEnemy2.setIcon(null);
                lblEnemy3.setIcon(null);
                lblEnemy4.setIcon(null);
            }
        }
        //System.out.println(enemyVisible(enemies[1]));
        //System.out.println(enemies[1].getSpritePosition());
        
        switch(d)
        {
        case "N":
            if (row >= 5 && (tiles[column][row-5] == 1 || tiles[column][row-4] == 1 || tiles[column][row-3] == 1 || tiles[column][row-2] == 1 || tiles[column][row-1] == 1))
            {
                lblLayerCenter.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer6wall.png"));
            }
            else
            {
                lblLayerCenter.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer6empty.png"));
            }
            if (row >= 1 && tiles[column][row-1] == 1)
            {
                lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4wall.png"));
            }
            else if (row >= 2 && tiles[column][row-2] == 1 && tiles[column][row-1] == 0)
            {
                lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3wall.png"));
            }
            else if (row >= 3 && tiles[column][row-3] == 1 && tiles[column][row-2] == 0 && tiles[column][row-1] == 0)
            {
                lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2wall.png"));
            }
            else if (row >= 4 && tiles[column][row-4] == 1 && tiles[column][row-3] == 0 && tiles[column][row-2] == 0 && tiles[column][row-1] == 0)
            {
                lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1wall.png"));
            }
            //Layer 5
            if (column > 1 && column < 14)
            {
                if (tiles[column-1][row] == 1 && tiles[column+1][row] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5template.png"));
                }
                else if (tiles[column-1][row] == 0 && tiles[column+1][row] == 0 && tiles[column+1][row-1] == 0 && tiles[column-1][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5f.png"));
                }
                else if (tiles[column-1][row] == 0 && tiles[column+1][row] == 0 && tiles[column+1][row-1] == 1 && tiles[column-1][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5d.png"));
                }
                else if (tiles[column-1][row] == 0 && tiles[column+1][row] == 0 && tiles[column+1][row-1] == 0 && tiles[column-1][row-1] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5e.png"));
                }
                else if (tiles[column-1][row] == 1 && tiles[column+1][row] == 0 && tiles[column+1][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5g.png"));
                }
                else if (tiles[column-1][row] == 0 && tiles[column+1][row] == 1 && tiles[column-1][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5h.png"));
                }
                else if (tiles[column-1][row] == 0 && tiles[column+1][row] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5a.png"));
                }
                else if (tiles[column-1][row] == 1 && tiles[column+1][row] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5b.png"));
                }
                else if (tiles[column-1][row] == 0 && tiles[column+1][row] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5c.png"));
                }
            }
            
            //Layer 4
            if (row > 1 && tiles[column][row-1] != 1)
            {
                if (tiles[column-1][row-1] == 1 && tiles[column+1][row-1] == 1)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4template.png"));
                }
                else if (tiles[column-1][row-1] == 0 && tiles[column+1][row-1] == 1)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4a.png"));
                }
                else if (tiles[column-1][row-1] == 1 && tiles[column+1][row-1] == 0)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4b.png"));
                }
                else if (tiles[column-1][row-1] == 0 && tiles[column+1][row-1] == 0)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4c.png"));
                }
            }
            //Layer 3
            if (row > 2 && tiles[column][row-2] != 1)
            {
                if (tiles[column-1][row-2] == 1 && tiles[column+1][row-2] == 1)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3template.png"));
                }
                else if (tiles[column-1][row-2] == 0 && tiles[column+1][row-2] == 1)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3a.png"));
                }
                else if (tiles[column-1][row-2] == 1 && tiles[column+1][row-2] == 0)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3b.png"));
                }
                else if (tiles[column-1][row-2] == 0 && tiles[column+1][row-2] == 0)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3c.png"));
                }
            }
            //Layer 2
            if (row > 3 && tiles[column][row-3] != 1)
            {
                if (tiles[column-1][row-3] == 1 && tiles[column+1][row-3] == 1)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2template.png"));
                }
                else if (tiles[column-1][row-3] == 0 && tiles[column+1][row-3] == 1)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2a.png"));
                }
                else if (tiles[column-1][row-3] == 1 && tiles[column+1][row-3] == 0)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2b.png"));
                }
                else if (tiles[column-1][row-3] == 0 && tiles[column+1][row-3] == 0)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2c.png"));
                }
            }
            //Layer 1
            if (row > 4 && tiles[column][row-4] != 1)
            {
                if (tiles[column-1][row-4] == 1 && tiles[column+1][row-4] == 1)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1template.png"));
                }
                else if (tiles[column-1][row-4] == 0 && tiles[column+1][row-4] == 1)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1a.png"));
                }
                else if (tiles[column-1][row-4] == 1 && tiles[column+1][row-4] == 0)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1b.png"));
                }
                else if (tiles[column-1][row-4] == 0 && tiles[column+1][row-4] == 0)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1c.png"));
                }
            }
            break;
        case "S":
            if (row < 10 && (tiles[column][row+5] == 1 || tiles[column][row+4] == 1 || tiles[column][row+3] == 1 || tiles[column][row+2] == 1 || tiles[column][row+1] == 1))
            {
                lblLayerCenter.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer6wall.png"));
            }
            else
            {
                lblLayerCenter.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer6empty.png"));
            }
            if (row < 14 && tiles[column][row+1] == 1)
            {
                lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4wall.png"));
            }
            else if (row < 13 && tiles[column][row+2] == 1)
            {
                lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3wall.png"));
            }
            else if (row < 12 && tiles[column][row+3] == 1)
            {
                lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2wall.png"));
            }
            else if (row < 11 && tiles[column][row+4] == 1)
            {
                lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1wall.png"));
            }
            //Layer 5
            if (column > 1 && column < 14)
            {
                if (tiles[column+1][row] == 1 && tiles[column-1][row]== 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5template.png"));
                }
                else if (tiles[column+1][row] == 0 && tiles[column-1][row] == 0 && tiles[column-1][row+1] == 0 && tiles[column+1][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5f.png"));
                }
                else if (tiles[column+1][row] == 0 && tiles[column-1][row] == 0 && tiles[column-1][row+1] == 1 && tiles[column+1][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5d.png"));
                }
                else if (tiles[column+1][row] == 0 && tiles[column-1][row] == 0 && tiles[column-1][row+1] == 0 && tiles[column+1][row+1] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5e.png"));
                }
                else if (tiles[column+1][row] == 1 && tiles[column-1][row] == 0 && tiles[column-1][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5g.png"));
                }
                else if (tiles[column+1][row] == 0 && tiles[column-1][row] == 1 && tiles[column+1][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5h.png"));
                }
                else if (tiles[column+1][row] == 0 && tiles[column-1][row] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5a.png"));
                }
                else if (tiles[column+1][row] == 1 && tiles[column-1][row] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5b.png"));
                }
                else if (tiles[column+1][row] == 0 && tiles[column-1][row] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5c.png"));
                }
            }
            
            //Layer 4
            if (row < 14  && tiles[column][row+1] != 1)
            {
                if (tiles[column+1][row+1] == 1 && tiles[column-1][row+1] == 1)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4template.png"));
                }
                else if (tiles[column+1][row+1] == 0 && tiles[column-1][row+1] == 1)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4a.png"));
                }
                else if (tiles[column+1][row+1] == 1 && tiles[column-1][row+1] == 0)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4b.png"));
                }
                else if (tiles[column+1][row+1] == 0 && tiles[column-1][row+1] == 0)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4c.png"));
                }
            }
            //Layer 3
            if (row < 13 && tiles[column][row+2] != 1)
            {
                if (tiles[column+1][row+2] == 1 && tiles[column-1][row+2] == 1)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3template.png"));
                }
                else if (tiles[column+1][row+2] == 0 && tiles[column-1][row+2] == 1)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3a.png"));
                }
                else if (tiles[column+1][row+2] == 1 && tiles[column-1][row+2] == 0)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3b.png"));
                }
                else if (tiles[column+1][row+2] == 0 && tiles[column-1][row+2] == 0)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3c.png"));
                }
            }
            
            //Layer 2
            if (row < 12 && tiles[column][row+3] != 1)
            {
                if (tiles[column+1][row+3] == 1 && tiles[column-1][row+3] == 1)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2template.png"));
                }
                else if (tiles[column+1][row+3] == 0 && tiles[column-1][row+3] == 1)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2a.png"));
                }
                else if (tiles[column+1][row+3] == 1 && tiles[column-1][row+3] == 0)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2b.png"));
                }
                else if (tiles[column+1][row+3] == 0 && tiles[column-1][row+3] == 0)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2c.png"));
                }
            }
            //Layer 1
            if (row < 11 && tiles[column][row+4] != 1)
            {
                if (tiles[column+1][row+4] == 1 && tiles[column-1][row+4] == 1)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1template.png"));
                }
                else if (tiles[column+1][row+4] == 0 && tiles[column-1][row+4] == 1)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1a.png"));
                }
                else if (tiles[column+1][row+4] == 1 && tiles[column-1][row+4] == 0)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1b.png"));
                }
                else if (tiles[column+1][row+4] == 0 && tiles[column-1][row+4] == 0)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1c.png"));
                }
            }
            break;
        case "W":
            if (column > 5 && (tiles[column-5][row] == 1 || tiles[column-4][row] == 1 || tiles[column-3][row] == 1 || tiles[column-2][row] == 1 || tiles[column-1][row] == 1))
            {
                lblLayerCenter.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer6wall.png"));
            }
            else
            {
                lblLayerCenter.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer6empty.png"));
            }
            if (column >= 1 && tiles[column-1][row] == 1)
            {
                lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4wall.png"));
            }
            else if (column >= 2 && tiles[column-2][row] == 1)
            {
                lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3wall.png"));
            }
            else if (column >= 3 && tiles[column-3][row] == 1)
            {
                lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2wall.png"));
            }
            else if (column >= 4 && tiles[column-4][row] == 1)
            {
                lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1wall.png"));
            }
            //Layer 5
            if (row >= 1 && row < 14)
            {
                if (tiles[column][row+1] == 1 && tiles[column][row-1] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5template.png"));
                }
                else if (tiles[column][row+1] == 0 && tiles[column][row-1] == 0 && tiles[column-1][row+1] == 0 && tiles[column-1][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5f.png"));
                }
                else if (tiles[column][row+1] == 0 && tiles[column][row-1] == 0 && tiles[column-1][row+1] == 0 && tiles[column-1][row-1] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5d.png"));
                }
                else if (tiles[column][row+1] == 0 && tiles[column][row-1] == 0 && tiles[column-1][row+1] == 1 && tiles[column-1][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5e.png"));
                }
                else if (tiles[column][row+1] == 1 && tiles[column][row-1] == 0 && tiles[column-1][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5g.png"));
                }
                else if (tiles[column][row+1] == 0 && tiles[column][row-1] == 1 && tiles[column-1][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5h.png"));
                }
                else if (tiles[column][row+1] == 0 && tiles[column][row-1] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5a.png"));
                }
                else if (tiles[column][row+1] == 1 && tiles[column][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5b.png"));
                }
                else if (tiles[column][row+1] == 0 && tiles[column][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5c.png"));
                }
            }
            if (column >= 1 && tiles[column-1][row] != 1)
            {
              //Layer 4
                if (tiles[column-1][row+1] == 1 && tiles[column-1][row-1] == 1)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4template.png"));
                }
                else if (tiles[column-1][row+1] == 0 && tiles[column-1][row-1] == 1)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4a.png"));
                }
                else if (tiles[column-1][row+1] == 1 && tiles[column-1][row-1] == 0)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4b.png"));
                }
                else if (tiles[column-1][row+1] == 0 && tiles[column-1][row-1] == 0)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4c.png"));
                }
            }
            if (column > 2 && tiles[column-2][row] != 1)
            {
                //Layer 3
                if (tiles[column-2][row+1] == 1 && tiles[column-2][row-1] == 1)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3template.png"));
                }
                else if (tiles[column-2][row+1] == 0 && tiles[column-2][row-1] == 1)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3a.png"));
                }
                else if (tiles[column-2][row+1] == 1 && tiles[column-2][row-1] == 0)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3b.png"));
                }
                else if (tiles[column-2][row+1] == 0 && tiles[column-2][row-1] == 0)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3c.png"));
                }
            }
              
            if (column > 3 && tiles[column-3][row] != 1)
            {
                //Layer 2
                if (tiles[column-3][row+1] == 1 && tiles[column-3][row-1] == 1)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2template.png"));
                }
                else if (tiles[column-3][row+1] == 0 && tiles[column-3][row-1] == 1)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2a.png"));
                }
                else if (tiles[column-3][row+1] == 1 && tiles[column-3][row-1] == 0)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2b.png"));
                }
                else if (tiles[column-3][row+1] == 0 && tiles[column-3][row-1] == 0)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2c.png"));
                }
            }
              
            if (column > 4 && tiles[column-4][row] != 1)
            {
                //Layer 1
                if (tiles[column-4][row+1] == 1 && tiles[column-4][row-1] == 1)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1template.png"));
                }
                else if (tiles[column-4][row+1] == 0 && tiles[column-4][row-1] == 1)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1a.png"));
                }
                else if (tiles[column-4][row+1] == 1 && tiles[column-4][row-1] == 0)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1b.png"));
                }
                else if (tiles[column-4][row+1] == 0 && tiles[column-4][row-1] == 0)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1c.png"));
                }
            }
            break;
        case "E":
            if (column < 10 && (tiles[column+5][row] == 1 || tiles[column+4][row] == 1 || tiles[column+3][row] == 1 || tiles[column+2][row] == 1 || tiles[column+1][row] == 1))
            {
                lblLayerCenter.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer6wall.png"));
            }
            else
            {
                lblLayerCenter.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer6empty.png"));
            }
            if (column < 14 && tiles[column+1][row] == 1)
            {
                lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4wall.png"));
            }
            else if (column < 13 && tiles[column+2][row] == 1)
            {
                lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3wall.png"));
            }
            else if (column < 12 && tiles[column+3][row] == 1)
            {
                lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2wall.png"));
            }
            else if (column < 11 && tiles[column+4][row] == 1)
            {
                lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1wall.png"));
            }
            //Layer 5
            if (row >=1 && row < 14)
            {
                if (tiles[column][row-1] == 1 && tiles[column][row+1] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5template.png"));
                }
                else if (tiles[column][row-1] == 0 && tiles[column][row+1] == 0 && tiles[column+1][row-1] == 0 && tiles[column+1][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5f.png"));
                }
                else if (tiles[column][row-1] == 0 && tiles[column][row+1] == 0 && tiles[column+1][row-1] == 0 && tiles[column+1][row+1] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5d.png"));
                }
                else if (tiles[column][row-1] == 0 && tiles[column][row+1] == 0 && tiles[column+1][row-1] == 1 && tiles[column+1][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5e.png"));
                }
                else if (tiles[column][row-1] == 1 && tiles[column][row+1] == 0 && tiles[column+1][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5g.png"));
                }
                else if (tiles[column][row-1] == 0 && tiles[column][row+1] == 1 && tiles[column+1][row-1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5h.png"));
                }
                else if (tiles[column][row-1] == 0 && tiles[column][row+1] == 1)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5a.png"));
                }
                else if (tiles[column][row-1] == 1 && tiles[column][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5b.png"));
                }
                else if (tiles[column][row-1] == 0 && tiles[column][row+1] == 0)
                {
                    lblLayer5.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer5c.png"));
                }
            }
            if (column < 14 && tiles[column+1][row] != 1)
            {
              //Layer 4
                if (tiles[column+1][row-1] == 1 && tiles[column+1][row+1] == 1)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4template.png"));
                }
                else if (tiles[column+1][row-1] == 0 && tiles[column+1][row+1] == 1)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4a.png"));
                }
                else if (tiles[column+1][row-1] == 1 && tiles[column+1][row+1] == 0)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4b.png"));
                }
                else if (tiles[column+1][row-1] == 0 && tiles[column+1][row+1] == 0)
                {
                    lblLayer4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer4c.png"));
                }
            }
            if (column < 13 && tiles[column+2][row] != 1)
            {
                //Layer 3
                if (tiles[column+2][row-1] == 1 && tiles[column+2][row+1] == 1)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3template.png"));
                }
                else if (tiles[column+2][row-1] == 0 && tiles[column+2][row+1] == 1)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3a.png"));
                }
                else if (tiles[column+2][row-1] == 1 && tiles[column+2][row+1] == 0)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3b.png"));
                }
                else if (tiles[column+2][row-1] == 0 && tiles[column+2][row+1] == 0)
                {
                    lblLayer3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer3c.png"));
                }
            }
              
            if (column < 12 && tiles[column+3][row] != 1)
            {
                //Layer 2
                if (tiles[column+3][row-1] == 1 && tiles[column+3][row+1] == 1)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2template.png"));
                }
                else if (tiles[column+3][row-1] == 0 && tiles[column+3][row+1] == 1)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2a.png"));
                }
                else if (tiles[column+3][row-1] == 1 && tiles[column+3][row+1] == 0)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2b.png"));
                }
                else if (tiles[column+3][row-1] == 0 && tiles[column+3][row+1] == 0)
                {
                    lblLayer2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer2c.png"));
                }
            }
              
            if (column < 11 && tiles[column+4][row] != 1)
            {
                //Layer 1
                if (tiles[column+4][row-1] == 1 && tiles[column+4][row+1] == 1)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1template.png"));
                }
                else if (tiles[column+4][row-1] == 0 && tiles[column+4][row+1] == 1)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1a.png"));
                }
                else if (tiles[column+4][row-1] == 1 && tiles[column+4][row+1] == 0)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1b.png"));
                }
                else if (tiles[column+4][row-1] == 0 && tiles[column+4][row+1] == 0)
                {
                    lblLayer1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\layer1c.png"));
                }
            }
            break;
        } 
    }
    public static int getPlayerX()
    {
        return column;
    }
    public static int getPlayerY()
    {
        return row;
    }
    
    public static String getPlayerDirection()
    {
        return d;
    }
    
    public  void showEnemy(Enemy e)
    {
        String dir = getPlayerDirection();
        //int x = e.getEnemyXPosition();
        //int y = e.getEnemyYPosition();
        if (dir == "N" && enemyVisible(e))
        {
            if (e.getSpritePosition() == 4)
            {
                lblEnemy1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy4.gif"));
            }
            else if (e.getSpritePosition() == 3)
            {
                lblEnemy2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy3.gif"));
            }
            else if (e.getSpritePosition() == 2)
            {
                lblEnemy3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy2.gif"));
            }
            else if (e.getSpritePosition() == 1)
            {
                lblEnemy4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy1.gif"));
            }
            else
            {
                lblEnemy1.setIcon(null);
                lblEnemy2.setIcon(null);
                lblEnemy3.setIcon(null);
                lblEnemy4.setIcon(null);
            }
            if (!enemyOnSpot(getPlayerX(), getPlayerY() - 4))
                lblEnemy1.setIcon(null);
            if (!enemyOnSpot(getPlayerX(), getPlayerY() - 3))
                lblEnemy2.setIcon(null);
            if (!enemyOnSpot(getPlayerX(), getPlayerY() - 2))
                lblEnemy3.setIcon(null);
            if (!enemyOnSpot(getPlayerX(), getPlayerY() - 1))
                lblEnemy4.setIcon(null);
            
        }
        
        else if (dir == "S" && enemyVisible(e))
        {
            if (e.getSpritePosition() == 4)
            {
                lblEnemy1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy4.gif"));
            }
            else if (e.getSpritePosition() == 3)
            {
                lblEnemy2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy3.gif"));
            }
            else if (e.getSpritePosition() == 2)
            {
                lblEnemy3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy2.gif"));
            }
            else if (e.getSpritePosition() == 1)
            {
                lblEnemy4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy1.gif"));
            }
            else
            {
                lblEnemy1.setIcon(null);
                lblEnemy2.setIcon(null);
                lblEnemy3.setIcon(null);
                lblEnemy4.setIcon(null);
            }
            if (!enemyOnSpot(getPlayerX(), getPlayerY() + 4))
                lblEnemy1.setIcon(null);
            if (!enemyOnSpot(getPlayerX(), getPlayerY() + 3))
                lblEnemy2.setIcon(null);
            if (!enemyOnSpot(getPlayerX(), getPlayerY() + 2))
                lblEnemy3.setIcon(null);
            if (!enemyOnSpot(getPlayerX(), getPlayerY() + 1))
                lblEnemy4.setIcon(null);
            
        }
        
        else if (dir == "W" && enemyVisible(e))
        {
            if (e.getSpritePosition() == 4 && enemyOnSpot(getPlayerX() - 4, getPlayerY()))
            {
                lblEnemy1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy4.gif"));
            }
            else if (e.getSpritePosition() == 3 && enemyOnSpot(getPlayerX() - 3, getPlayerY()))
            {
                lblEnemy2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy3.gif"));
            }
            else if (e.getSpritePosition() == 2 && enemyOnSpot(getPlayerX() - 2, getPlayerY()))
            {
                lblEnemy3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy2.gif"));
            }
            else if (e.getSpritePosition() == 1 && enemyOnSpot(getPlayerX() - 1, getPlayerY()))
            {
                lblEnemy4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy1.gif"));
            }
            else
            {
                lblEnemy1.setIcon(null);
                lblEnemy2.setIcon(null);
                lblEnemy3.setIcon(null);
                lblEnemy4.setIcon(null);
            }
            if (!enemyOnSpot(getPlayerX() - 4, getPlayerY()))
                lblEnemy1.setIcon(null);
            if (!enemyOnSpot(getPlayerX() - 3, getPlayerY()))
                lblEnemy2.setIcon(null);
            if (!enemyOnSpot(getPlayerX() - 2, getPlayerY()))
                lblEnemy3.setIcon(null);
            if (!enemyOnSpot(getPlayerX() - 1, getPlayerY()))
                lblEnemy4.setIcon(null);
            
        }
        
        else if (dir == "E" && enemyVisible(e))
        {
            
            if (e.getSpritePosition() == 4 && enemyOnSpot(getPlayerX() + 4, getPlayerY()))
            {
                lblEnemy1.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy4.gif"));
            }
            else if (e.getSpritePosition() == 3 && enemyOnSpot(getPlayerX() + 3, getPlayerY()))
            {
                lblEnemy2.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy3.gif"));
            }
            else if (e.getSpritePosition() == 2 && enemyOnSpot(getPlayerX() + 2, getPlayerY()))
            {
                lblEnemy3.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy2.gif"));
            }
            else if (e.getSpritePosition() == 1 && enemyOnSpot(getPlayerX() + 1, getPlayerY()))
            {
                lblEnemy4.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\enemy1.gif"));
            }
            else
            {
                lblEnemy1.setIcon(null);
                lblEnemy2.setIcon(null);
                lblEnemy3.setIcon(null);
                lblEnemy4.setIcon(null);
            }
            if (!enemyOnSpot(getPlayerX() + 4, getPlayerY()))
                lblEnemy1.setIcon(null);
            if (!enemyOnSpot(getPlayerX() + 3, getPlayerY()))
                lblEnemy2.setIcon(null);
            if (!enemyOnSpot(getPlayerX() + 2, getPlayerY()))
                lblEnemy3.setIcon(null);
            if (!enemyOnSpot(getPlayerX() + 1, getPlayerY()))
                lblEnemy4.setIcon(null);
        }
    }
    
    public void spawnEnemy(Enemy e, int x, int y)
    {
        e.setEnemyPosition(x, y);
    }
    
    public Boolean enemyOnSpot(int x, int y)
    {
        for (int i = 0; i < level.getEnemyCount(); i++)
        {
            if (enemies[i].getEnemyXPosition() == x && enemies[i].getEnemyYPosition() == y)
                return true;
        }
        return false;
    }
    
    public Boolean enemyVisible(Enemy e)
    {
        String dir = getPlayerDirection();
        int x = e.getEnemyXPosition();
        int y = e.getEnemyYPosition();
        
        if (dir == "N")
        {
            if (row >= 5 && tiles[column][row - 4] == 0 && tiles[column][row - 3] == 0 && tiles[column][row - 2] == 0 && tiles[column][row - 1] == 0 && (x - getPlayerX()) == 0 && (y - getPlayerY()) == -4)
            {
                e.setSpritePosition(4);
                e.enemy_visible = true;
                return true;
            }
            else if (row >= 4 && tiles[column][row - 3] == 0 && tiles[column][row - 2] == 0 && tiles[column][row - 1] == 0 && (x - getPlayerX()) == 0 && (y - getPlayerY()) == -3)
            {
                e.setSpritePosition(3);
                e.enemy_visible = true;
                return true;
            }
            else if (row >= 3 && tiles[column][row - 2] == 0 && tiles[column][row - 1] == 0 && (x - getPlayerX()) == 0 && (y - getPlayerY()) == -2)
            {
                e.setSpritePosition(2);
                e.enemy_visible = true;
                return true;
            }
            else if (row >= 2 && tiles[column][row - 1] == 0 && (x - getPlayerX()) == 0 && (y - getPlayerY()) == -1)
            {
                e.setSpritePosition(1);
                e.enemy_visible = true;
                return true;
            }
            else
            {
                e.setSpritePosition(-1);
                e.enemy_visible = false;
                return false;
            }
        }
        
        else if (dir == "S")
        {
            if (row <= 10 && tiles[column][row + 4] == 0 && tiles[column][row + 3] == 0 && tiles[column][row + 2] == 0 && tiles[column][row + 1] == 0 && (x - getPlayerX()) == 0 && (y - getPlayerY()) == 4)
            {
                e.setSpritePosition(4);
                e.enemy_visible = true;
                return true;
            }
            else if (row <= 11 && tiles[column][row + 3] == 0 && tiles[column][row + 2] == 0 && tiles[column][row + 1] == 0 && (x - getPlayerX()) == 0 && (y - getPlayerY()) == 3)
            {
                e.setSpritePosition(3);
                e.enemy_visible = true;
                return true;
            }
            else if (row <= 12 && tiles[column][row + 2] == 0 && tiles[column][row + 1] == 0 && (x - getPlayerX()) == 0 && (y - getPlayerY()) == 2)
            {
                e.setSpritePosition(2);
                e.enemy_visible = true;
                return true;
            }
            else if (row <= 13 && tiles[column][row + 1] == 0 && Math.abs(x - getPlayerX()) == 0 && (y - getPlayerY()) == 1)
            {
                e.setSpritePosition(1);
                e.enemy_visible = true;
                return true;
            }
            else
            {
                e.setSpritePosition(-1);
                e.enemy_visible = false;
                return false;
            }
        }
        
        else if (dir == "W")
        {
            if (column >= 5 && tiles[column - 4][row] == 0 && tiles[column - 3][row] == 0 && tiles[column - 2][row] == 0 && tiles[column - 1][row] == 0 && (x - getPlayerX()) == -4 && (y - getPlayerY()) == 0)
            {
                e.setSpritePosition(4);
                e.enemy_visible = true;
                return true;
            }
            else if (column >= 4 && tiles[column - 3][row] == 0 && tiles[column - 2][row] == 0 && tiles[column - 1][row] == 0 && (x - getPlayerX()) == -3 && (y - getPlayerY()) == 0)
            {
                e.setSpritePosition(3);
                e.enemy_visible = true;
                return true;
            }
            else if (column >= 3 && tiles[column - 2][row] == 0 && tiles[column - 1][row] == 0 && (x - getPlayerX()) == -2 && (y - getPlayerY()) == 0)
            {
                e.setSpritePosition(2);
                e.enemy_visible = true;
                return true;
            }
            else if (column >= 2 && tiles[column - 1][row] == 0 && (x - getPlayerX()) == -1 && (y - getPlayerY()) == 0)
            {
                e.setSpritePosition(1);
                e.enemy_visible = true;
                return true;
            }
            else
            {
                e.setSpritePosition(-1);
                e.enemy_visible = false;
                return false;
            }
        }
        
        else
        {
            
            if (column <= 10 && tiles[column + 4][row] == 0 && tiles[column + 3][row] == 0 && tiles[column + 2][row] == 0 && tiles[column + 1][row] == 0 && (x - getPlayerX()) == 4 && (y - getPlayerY()) == 0)
            {
                e.setSpritePosition(4);
                e.enemy_visible = true;
                return true;
            }
            else if (column <= 11 && tiles[column + 3][row] == 0 && tiles[column + 2][row] == 0 && tiles[column + 1][row] == 0 && (x - getPlayerX()) == 3 && (y - getPlayerY()) == 0)
            {
                e.setSpritePosition(3);
                e.enemy_visible = true;
                return true;
            }
            else if (column <= 12 && tiles[column + 2][row] == 0 && tiles[column + 1][row] == 0 && (x - getPlayerX()) == 2 && (y - getPlayerY()) == 0)
            {
                e.setSpritePosition(2);
                e.enemy_visible = true;
                return true;
            }
            else if (column <= 13 && tiles[column + 1][row] == 0 && (x - getPlayerX()) == 1 && (y - getPlayerY()) == 0)
            {
                e.setSpritePosition(1);
                e.enemy_visible = true;
                return true;
            }
            else
            {
                e.setSpritePosition(-1);
                e.enemy_visible = false;
                return false;
            }
        }
    }
}
