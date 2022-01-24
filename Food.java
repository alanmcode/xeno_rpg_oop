
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food extends Item
{
    //instance variables
    private int quantity; //how many of item
    private int heal; //how much HP will be healed
    private int cost; // cost of food
    /**
     * Constructor for objects of class Food
     */
    public Food(int quantity, int heal, int cost)
    {
        // initialise instance variables
        quantity=2;
        heal=60;
        cost = 50;
    }

    /**
     getters
     */
    public int getQuantity(int quantity)
    {
        // put your code here
        return quantity;
    }
    
    public int heal(int heal)
    {
        return heal;
    }
    
}
