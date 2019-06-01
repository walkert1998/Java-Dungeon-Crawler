import javax.swing.ImageIcon;

public class AISuper 
{
    protected static int npcHealth, npcEvasion, npcOpinion, npcMelDam, npcAccuracy;
    protected static boolean isPoisoned;
    protected static ImageIcon iconSet;
    protected static String npcName, npcDescription;
    public static int getNpcHealth()
    {
        return npcHealth;
    }
    public static void setNpcHealth(int npcHealth)
    {
        AISuper.npcHealth = npcHealth;
    }
    public static int getNpcEvasion()
    {
        return npcEvasion;
    }
    public static void setNpcEvasion(int npcEvasion)
    {
        AISuper.npcEvasion = npcEvasion;
    }
    public static int getNpcOpinion()
    {
        return npcOpinion;
    }
    public static void setNpcOpinion(int npcOpinion)
    {
        AISuper.npcOpinion = npcOpinion;
    }
    public static int getNpcMelDam()
    {
        return npcMelDam;
    }
    public static void setNpcMelDam(int npcMelDam)
    {
        AISuper.npcMelDam = npcMelDam;
    }
    public static int getNpcAccuracy()
    {
        return npcAccuracy;
    }
    public static void setNpcAccuracy(int npcAccuracy)
    {
        AISuper.npcAccuracy = npcAccuracy;
    }
    public static String getNpcName()
    {
        return npcName;
    }
    public static void setNpcName(String npcName)
    {
        AISuper.npcName = npcName;
    }
    public static String getNpcDescription()
    {
        return npcDescription;
    }
    public static void setNpcDescription(String NpcDescription)
    {
        AISuper.npcDescription = NpcDescription;
    }
    public static ImageIcon getIconSet()
    {
        return iconSet;
    }
    public static void setIconSet(ImageIcon IconSet)
    {
        AISuper.iconSet = IconSet;
    }
}
