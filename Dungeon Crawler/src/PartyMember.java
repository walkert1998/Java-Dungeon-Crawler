
public class PartyMember
{
    private int member_health;
    private int max_health;
    private int max_mana;
    private int member_mana;
    private boolean dead;
    
    public PartyMember()
    {
        dead = false;
    }
    
    public void take_damage(int damage)
    {
        member_health -= damage;
        if (member_health <= 0)
            die();
    }
    
    public void restore_health(int health)
    {
        if (member_health < max_health - health)
            member_health += health;
        
        else
            member_health = max_health;
    }
    
    public void decrease_mana(int mana)
    {
        member_mana -= mana;
        
    }
    
    public void increase_mana(int mana)
    {
        if (member_mana < max_mana - mana)
            member_mana += mana;
        
        else
            member_mana = max_mana;
    }
    
    public void use_right_hand()
    {
        
    }
    
    public void die()
    {
        dead = true;
    }
}
