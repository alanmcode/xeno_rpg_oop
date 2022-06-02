Student number: 200410780

Now complete the statements below for each level you wish to be marked. Replace all text in square brackets.

LEVEL ONE

My code demonstrates inheritance in the following way...

I have a superclass called Character

This superclass is extended into at least two subclasses called Attacker and Enemy

For each of the named subclasses complete the following...

Subclass 1.

Subclass Attacker extends the superclass by adding at least one property and its getters and setters. The name of the added properties is "attack"

This new property is used by the subclass in the following way: The attack variable makes choosing an attacker over a defender a strategic option and makes the attacker's stats unique. in line 47 of Attacker.java, the variable is used to add onto the player's damage stat when Attacker.fight() is used on an enemy in Game.java [and influences the hit that is given to the enemy in line 76 of Game.java] if an attacker is chosen.

Subclass Attacker extends the superclass by overriding the following methods (there must be at least one): getHP(int HP) in line 22 of Attacker.java and line 17 of Character.java superclass

These overridden methods are used in the working code in the following places: in Game.java, line 58. in Attacker.java, line 46.

Subclass 2.

Subclass Enemy extends the superclass by adding at least one property and its getters and setters. The name of the added properties is "armour"

This new property is used by the subclass in the following way: The armour variable adds more difficulty to the fights between the player and makes the enemy's stats unique. It is used when calling the getter for armour to form the local variable in the fight method in Enemy.java at line 49 and the getter for the variable is also used in Game.java at line 64. 

Subclass Enemy extends the superclass by overriding the following methods (there must be at least one): getHP(int HP) in line 27 of Enemy.java and line 17 of Character.java superclass

These overridden methods are used in the working code in the following places: in Enemy.java, line 47 and line 49.


LEVEL TWO

Polymorphism consists of the use of the Substitution principle and Late Dynamic binding.

In my code, polymorphism is implemented in at least two places…

Example 1.

The substitution principle can be seen in use in Game.java, line 60. The name of the superclass used in this example is Character and the subclasses used are Defender.

Late dynamic binding can be seen in Game.java, line 53.

This is necessary in my code as its creating a defender object is used where a character object is expected, with its unique attributes and is used in the code to battle against an enemy when the user chooses to be a defender. dynamic binding where the method is decided at compile time is needed here to get the quantity of a new item to display to the user, whether it is gold or food that the user recieves.

Example 2.

The substitution principle can be seen in use in Game.java, line 57. The name of the superclass used in this example is Character and the subclasses used are Attacker.

Late dynamic binding can be seen in Game.java, line 52.

The code needs to create an object of Attacker as a Character so that it can be used to fight against an enemy if the user chooses to be an attacker. And this use of dynamic binding is necessary to show the user all the items in their pouch, which is displayed to them when they use items in battle.
