
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy extends Character
{
    // instance variables 
    private int HP; //health
    private int damage; //damage dealt each turn to player
    private int armour; //enemies have armour which means more immunity 
    //and are balanced to defenders
    /**
     * Constructor for objects of class Enemy
     */
    public Enemy(int HP, int damage, int armour)
    {
        // initialise instance variables
        HP = 300;
        damage = 40;
        armour = HP+20;
    }

    //getters
    public int getHP(int HP)
    {
        // overriding
        return HP;
    }
    
    public int getDamage(int damage)
    {
        return damage;
    }
    
    public int getArmour(int armour)
    {
        return armour;
    }
    
    public static int fight(int playerHit)
    {
        Enemy enemy11 = new Enemy(300,40,20);
        
        int HP = enemy11.getHP(300);
        int damage = enemy11.getDamage(40);
        int armour = enemy11.getHP(300)+enemy11.getArmour(20);
        
        System.out.println(damage+" attack power");
        System.out.println("The enemy attacks you");
        
        return damage;
    }
    
}
