import java.util.Scanner;
    
public class Game
{
        // instance variables 
        private int x;
    
        /**
         * Constructor for objects of class Game
         */
        public Game()
        {
            x = 0;
        }
    
     
        public static void main(String[] a)
        {
            // main
            System.out.println("Enemies have attacked the base!");
            System.out.println("Enter the name of your character");
            
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Make "+name+" an Attacker or Defender?");
            System.out.println("Input: 1 for Attacker, 2 for Defender");
            String abilityTemp = scanner.nextLine();
            int ability = Integer.parseInt(abilityTemp);
            int HP;
            if (ability == 1)
            {
                System.out.println(name+" is an Attacker");
            }
            else if (ability == 2)
            {
                System.out.println(name+" is a Defender");
            }
            
            Item g = new Gold(3,50); //dynamic bind 
            Food food = new Food(0,60,50);
            
            int pouch = 0; //your inventory
            System.out.println("");
            System.out.println("Would you like to buy food before battle?");
            System.out.println("You have "+g.getQuantity(2)+" coins");
            System.out.println("Input: 1 for yes or 0 for no");
            String shopTemp = scanner.nextLine();
            int shop = Integer.parseInt(shopTemp);
            
            if (shop == 1)
            {
                pouch = g.getQuantity(2);// dynamic bind
                System.out.println("You bought "+g.getQuantity(2)+ " portions");
                System.out.println("");
            }
            
            Attacker attacker = new Attacker(200,0,0,130); //sp
            int HP1 = attacker.getHP(200);
            
            Defender defender = new Defender(350,0,50,0); //subst princ
            int HP2 = defender.getHP(350);
            
            Enemy enemy = new Enemy(300,60,0);
            int enemyHP = enemy.getArmour(320);
            
            Boolean enemyBeat = false; //flag for end of a fight
            System.out.println(name+" is fighting the enemy.");
            while (enemyBeat == false && ability == 1)
            {
                int enemyHit = 0;
                int playerHit = 0;
                
                System.out.println("");
                System.out.println("Your stats are:");
                System.out.println(HP1+" HP");
                playerHit = Attacker.fight(0);
                enemyHP = enemyHP-playerHit;
                if (enemyHP <= 0)
                {
                    System.out.println("Enemy HP is 0. You win!");
                    enemyBeat=true;
                    break;
                }
                
                System.out.println("");
                System.out.println("The enemy has:");
                System.out.println(enemyHP+" HP");
                enemyHit = Enemy.fight(playerHit);
                HP1 = HP1-enemyHit;
                if (HP1 <= 0)
                {
                    System.out.println("Your HP is 0. You lose...");
                    enemyBeat=false;
                    break;
                }
                
                //heal
                if (pouch >= 1)
                {
                    System.out.println("");
                    System.out.println("Do you want to eat your food?");
                    System.out.println("You have "+pouch);
                    System.out.println("Input: 1 for yes, 0 for no");
                    String decTemp = scanner.nextLine();
                    int dec = Integer.parseInt(decTemp);
                    
                    if (dec == 1)
                    {
                        HP1 = HP1+food.heal(60);
                        pouch = pouch-1;
                        System.out.println("HP is now "+HP1);
                    }
                }
            }
            
            
            while (enemyBeat == false && ability == 2)
            {
                int enemyHit = 0;
                int playerHit = 0;
                
                System.out.println("");
                System.out.println("Your stats are:");
                System.out.println(HP2+" HP");
                playerHit = Defender.fight(0);
                enemyHP = enemyHP-playerHit;
                if (enemyHP <= 0)
                {
                    System.out.println("Enemy HP is 0. You win!");
                    enemyBeat=true;
                    break;
                }
                
                System.out.println("");
                System.out.println("The enemy has:");
                System.out.println(enemyHP+" HP");
                enemyHit = Enemy.fight(playerHit);
                HP2 = HP2-enemyHit;
                if (HP2 <= 0)
                {
                    System.out.println("Your HP is 0. You lose...");
                    enemyBeat=false;
                    break;
                }
                
                //heal
                if (pouch >= 1)
                {
                    System.out.println("");
                    System.out.println("Do you want to eat your food?");
                    System.out.println("You have "+pouch);
                    System.out.println("Input: 1 for yes, 0 for no");
                    String decTemp = scanner.nextLine();
                    int dec = Integer.parseInt(decTemp);
                    
                    if (dec == 1)
                    {
                        HP2 = HP2+food.heal(60);
                        pouch = pouch-1;
                        System.out.println("HP is now "+HP2);
                    }
                }
            }
        }

}
