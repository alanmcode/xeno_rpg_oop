
/**
 * Write a description of class Defender here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defender extends Player
{
    // instance variables - replace the example below with your own
    private int HP; //health
    private int SP; //special
    private int damage; //damage dealt each turn
    private int defence; //extra attack when choosing attacker
    /**
     * Constructor for objects of class Defender
     */
    public Defender(int HP, int SP, int damage, int defence)
    {
        // initialise instance variables
        HP = 250;
        SP = 40;
        damage = 50;
        defence = HP+100; //defender gets more HP
    }

    /**
     getters */
    public int getHP(int HP)
    {
        return HP; //overriding
    }
    
    public int getSP(int SP)
    {
        return SP;
    }
    
    public int getDamage(int damage)
    {
        return damage;
    }
    
    public int getDefence(int defence)
    {
        return defence;
    }
    
    public static int fight(int playerHit)
    {
        Defender defender11 = new Defender(350,0,50,100);
        
        int HP = defender11.getHP(350);
        int damage = defender11.getDamage(50);
        
        System.out.println(damage+" attack power");
        System.out.println("You attack the enemy");
        
        return damage;
    }
}
