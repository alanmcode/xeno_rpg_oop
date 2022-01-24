
public class Character
{
    // instance variables 
    private int HP; //health
    private int damage; //damage dealt each turn
    /**
     * Constructor for objects of class Character
     */
    public Character()
    {
        // initialise instance variables
        HP = 0;
        damage = 0;
    }

    public int getHP(int HP)
    {
        return HP;
    }
    
    public int getDamage(int damage)
    {
        return damage;
    }
}
