import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

public class MapPanel extends JPanel {

    /**
     * Create the panel.
     */
    protected static int[][] map;
    private static int x=2, y=2;
    private LevelMap level;
    static JPanel panel_1;
    public MapPanel() 
    {
        setBackground(Color.BLACK);
        setLayout(null);
        
        level = new LevelMap();
        
        panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(0, 0, 300, 300);
        add(panel_1);
        panel_1.setLayout(new GridLayout(15, 15, 0, 0));
        
        
        
        map = level.getMap(1);
        updateMap();
    }
    
    public static void moveUp()
    {
        if (y > 1 && map[x][y-1] == 0)
        {
            map[x][y] = 0;
            map[x][y-1] = 2;
            y--;
            updateMap();
        }
    }
    public static void moveDown()
    {
        if (y < 14 && map[x][y+1] == 0)
        {
            map[x][y] = 0;
            map[x][y+1] = 2;
            y++;
            updateMap();
        }
    }
    public static void moveLeft()
    {
        if (x > 1 && map[x-1][y] == 0)
        {
            map[x][y] = 0;
            map[x-1][y] = 2;
            x--;
            updateMap();
        }
    }
    public static void moveRight()
    {
        if (x < 14 && map[x+1][y] == 0)
        {
            map[x][y] = 0;
            map[x+1][y] = 2;
            x++;
            updateMap();
        }
    }
    public static void updateMap()
    {
        panel_1.removeAll();
        for (int i = 0; i < 15; i++)
        {
            
            for (int j = 0; j < 15; j++)
            {
                JPanel panel = new JPanel();
                panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
                switch (map[j][i])
                {
                    case 0:
                        panel.setBackground(Color.WHITE);
                        break;
                    case 1:
                        panel.setBackground(Color.DARK_GRAY);
                        break;
                    case 2:
                        JLabel label = new JLabel();
                        panel.setBackground(Color.WHITE);
                        switch (FirstPersonPanel.getPlayerDirection())
                        {
                        case "N":
                            label.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\map_pointer_north.png"));
                            break;
                        case "S":
                            label.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\map_pointer_south.png"));
                            break;
                        case "E":
                            label.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\map_pointer_east.png"));
                            break;
                        case "W":
                            label.setIcon(new ImageIcon("C:\\Users\\Tommy\\.thumbnails\\Desktop\\Mod\\map_pointer_west.png"));
                            break;
                        }
                        label.setVerticalAlignment(SwingConstants.TOP);
                        panel.add(label);
                        break;
                    case 3:
                        panel.setBackground(Color.GREEN);
                        break;
                }
                panel_1.add(panel);
            }
            
        }
    }

}
