
public class Enemy
{
    private int xposition;
    private int yposition;
    public Boolean enemy_visible;
    public int sprite_position;
    public Enemy()
    {
        sprite_position = 0;
        xposition = 0;
        yposition = 0;
    }
    
    public Enemy(int Xposition, int Yposition)
    {
        sprite_position = 0;
        xposition = Xposition;
        yposition = Yposition;
    }
    
    public void setEnemyPosition(int x, int y)
    {
        xposition = x;
        yposition = y;
    }
    
    public int getEnemyXPosition()
    {
        return xposition;
    }
    
    public int getEnemyYPosition()
    {
        return yposition;
    }
    
    public Boolean isVisible()
    {
        return enemy_visible;
    }
    
    public int getSpritePosition()
    {
        return sprite_position;
    }
    
    public void setSpritePosition(int pos)
    {
        sprite_position = pos;
    }
}