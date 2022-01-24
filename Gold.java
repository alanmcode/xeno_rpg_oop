
/**
 * Write a description of class Gold here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gold extends Item
{
    // instance variables - replace the example below with your own
    private int quantity; //how many of item
    private int value; //how much gold
    /**
     * Constructor for objects of class Gold
     */
    public Gold(int quantity, int value)
    {
        quantity=3;
        value=50;
    }

    /**
     getters
     */
    public int getQuantity(int quantity)
    {
        return quantity;
    }
    
    /**
     getters
     */
    public int getValue(int value)
    {
        return value;
    }
}
