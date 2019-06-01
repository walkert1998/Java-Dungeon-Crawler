
public class LevelMap 
{
    public static int level;
    public static int[][] map;
    public  Enemy[] enemies = new Enemy[10];
    public  int i = 0;
    public static Boolean enemies_added = false;
    public LevelMap()
    {
        i = 0;
    }
    
    public  int getLevel()
    {
        return level;
    }
    
    public  Enemy[] getEnemies(int level)
    {
        return enemies;
    }
    
    public  int getEnemyCount()
    {
        return i;
    }
    
    public  void addEnemy(Enemy e)
    {
        enemies[i] = e;
        i++;
    }
    
    public  int[][] getMap(int level)
    {
        switch (level)
        {
        case 1:
            map = new int[][]
                    {
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,1,0,0,0,0,0,0,1,1,1,0,1,1,1},
                    {1,1,1,1,0,1,1,1,1,0,1,0,1,1,1},
                    {1,1,1,1,0,0,0,0,0,0,1,0,1,1,1},
                    {1,1,1,1,1,1,1,0,1,0,1,0,1,1,1},
                    {1,1,1,1,1,1,1,0,0,0,1,0,1,1,1},
                    {1,1,1,1,1,1,1,1,1,0,1,0,1,1,1},
                    {1,1,1,0,0,0,0,0,0,0,1,0,1,1,1},
                    {1,1,1,0,1,0,1,0,1,0,0,0,1,1,1},
                    {1,1,1,0,0,0,0,0,1,1,1,1,1,1,1},
                    {1,1,1,0,1,0,1,0,1,1,1,1,1,1,1},
                    {1,1,1,0,0,0,0,0,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                    };
                    if (!enemies_added)
                    {
                        Enemy imp = new Enemy(10, 5);
                        Enemy imp2 = new Enemy(2, 11);
                        Enemy imp3 = new Enemy(3, 11);
                        Enemy imp4 = new Enemy(10, 3);
                        addEnemy(imp);
                        System.out.println(i);
                        addEnemy(imp2);
                        System.out.println(i);
                        addEnemy(imp3);
                        addEnemy(imp4);
                        System.out.println(i);
                        System.out.println(i);
                        System.out.println("called map");
                        enemies_added = true;
                    }
            break;
        }
        return map;
    }
    
    
}
