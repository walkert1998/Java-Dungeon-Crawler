import javax.swing.ImageIcon;

public class Tile 
{
    private final int rows=10, columns=10;
    private static ImageIcon tileImage;
    private ImageIcon[][] tiles = new ImageIcon[10][10];
    public Tile()
    {
        for(int i=0; i<tiles.length;i++)
        {
            for(int j=0; j<tiles[i].length;j++)
            {
                tiles[i][j]=tileImage;
            }
        }
    }
    public static void setTile(int Rows, int Columns, ImageIcon TileImage)
    {
        tileImage=TileImage;
    }
    public ImageIcon getTile()
    {
        return tileImage;
    }
}