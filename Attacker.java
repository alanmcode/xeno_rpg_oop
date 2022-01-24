public class Attacker extends Player
{
    // instance variables 
    private int HP; //health
    private int SP; //special
    private int damage; //damage dealt each turn
    private int attack; //extra attack when choosing attacker
    /**
     * Constructor for objects of class Attacker
     */
    public Attacker(int HP, int SP, int damage, int attack)
    {
        // initialise instance variables
        HP = 200;
        SP = 50;
        attack = 80;
        damage = attack+50; //attacker gets more attack power
    }

    /**
     getters */
    public int getHP(int HP)
    {
        return HP; //overriding
    }
    
    public int getSP(int SP)
    {
        return SP; //overriding
    }
    
    public int getDamage(int damage)
    {
        return damage; //overriding
    }
    
    public int getAttack(int attack)
    {
        return attack;
    }
    
    public static int fight(int playerHit)
    {
        Attacker attacker11 = new Attacker(200,0,50,80);
        
        int HP = attacker11.getHP(200);
        int damage = attacker11.getAttack(80)+50;
        
        System.out.println(damage+" attack power");
        System.out.println("You attack the enemy");
        
        return damage;
    }
}
