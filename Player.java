public class Player extends Character
{
    // instance variables
    private int HP; //health
    private int SP; //special
    private int damage; //damage dealt each turn
    public Player()
    {
        // initialise instance variables
        HP = 0;
        damage = 0;
        SP = 0;
    }

    public int getHP(int HP)
    {
        // put your code here
        return HP;
    }
    
    public int getSP(int SP)
    {
        return SP;
    }
}
