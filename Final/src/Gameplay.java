import java.util.ArrayList;
import java.util.Scanner;


public class Gameplay
	{
		static int randomNumber = (int)(Math.random()* 5)+1;
		static ArrayList<Gameplay>comSkills = new ArrayList<Gameplay>();
		static ArrayList<Gameplay>playerSkills = new ArrayList<Gameplay>();
		private int defense;
		private int health;
		private String name;
		static int player;
		static boolean com;
		public Gameplay(String n ,int d, int h)
			{
				name = n;
				defense = d;
				health = h;
			}
		public static void main (String[] args)
			{
				userPlayerMaker();
				comPlayerMaker();
				determiningTheCharacter();
				runningTheGame();
				checkWonGame();
				//theBeholder();
			}
		public static void userPlayerMaker()
			{
				randomNumber = (int)(Math.random()* 5)+1;
				if(randomNumber == 1)
				{
					playerSkills.add(new Gameplay("Human Knight", 18, 16));
				}
				if(randomNumber == 2)
				{
					playerSkills.add(new Gameplay("Half-Elf Theif", 14, 14));
				}
				if(randomNumber == 3)
				{
					playerSkills.add(new Gameplay("Dark Elf Warlock", 12, 14));
				}
				if(randomNumber == 4)
				{
					playerSkills.add(new Gameplay("Wood Elf Archer", 16, 14));
				}
				if(randomNumber == 5)
				{
					playerSkills.add(new Gameplay("Dwarven Cleric", 16, 16));
				}
			}
		public static void comPlayerMaker()
			{
				randomNumber = (int)(Math.random()* 4)+1;
				if(randomNumber == 1)
				{
					comSkills.add(new Gameplay("Kobold", 14, 10));
				}
				if(randomNumber == 2)
				{
					comSkills.add(new Gameplay("Dark Wizard", 10, 12));
				}
				if(randomNumber == 3)
				{
					comSkills.add(new Gameplay("the Beholder", 10, 35));
				}
				if(randomNumber == 4)
				{
					comSkills.add(new Gameplay("Vampire King", 13, 20));
				}
			}
		public static void determiningTheCharacter()
		{
			System.out.println("Now it's time to battle!");
			System.out.println("Your player is " + playerSkills.get(player).getName() + " and its Defense is " + playerSkills.get(player).getDefense() + " and its health is " + playerSkills.get(player).getHealth() + ".");
			System.out.println("Your monster is " + comSkills.get(player).getName() + " and its Defense is " + comSkills.get(player).getDefense() + " and its health is " + comSkills.get(player).getHealth() + ".");
			System.out.println("You go first.");
		}
		public static void runningTheGame()
			{
				System.out.println("Now the you will roll a 20 sided die and you have to get above the monster's defense.");
				Scanner userlnput = new Scanner(System.in);
				System.out.println("Hit r enter to roll");
				String r = userlnput.nextLine();
				int dieRoll = (int)(Math.random()* 20)+1;
				System.out.println("You rolled a: " + dieRoll + ".");
				if(dieRoll > comSkills.get(player).getDefense())
				{
					System.out.println("You hit :) :) :) :)!!!!");
				}
				else
				{
					System.out.println("You missed :( :( :( :( :(.");
				}
				if(dieRoll > comSkills.get(player).getDefense())
				{
					System.out.println("Now it's time to roll the damage dice.");
					Scanner userlnput1 = new Scanner(System.in);
					System.out.println("Hit d enter for damage roll.");
					String d = userlnput1.nextLine();
					int dieRoll1 = (int)(Math.random()* 6)+1;
					if(dieRoll1 == 1)
					{
						//comSkills.getHealth().setHealth( - 1);
					}
					if(dieRoll1 == 2)
					{
//						comSkills.getHealth().setHealth( - 2);
					}
					if(dieRoll1 == 3)
					{
//						comSkills.getHealth().setHealth( - 3);
					}
					if(dieRoll1 == 4)
					{
//						comSkills.getHealth().setHealth( - 4);
						//System.out.println(comSkills.getHealth());
					}
					if(dieRoll1 == 5)
					{
						//comSkills.getHealth().setHealth();
						//System.out.println(comSkills.getHealth());
					}
					if(dieRoll1 == 6)
					{
						//comSkills.getHealth().setHealth( - 6);
						//System.out.println(comSkills.getHealth());
					}
				}
				else
				{
					System.out.println("Sorry... it's the computer's turn now.");
				}
				System.out.println();
				System.out.println("Now the monster will roll a 20 sided die to see if he will hit you.");
				int comRoll = (int)(Math.random()* 20)+1;
				System.out.println("Monster rolled a: " + comRoll + ".");
				if(comRoll > playerSkills.get(player).getDefense())
				{
					System.out.println("Monster hit :( :( :( :(.");
				}
				else
				{
					System.out.println("Monster missed :) :) :) :) :)!!!!");
				}
				int dieRoll2 = (int)(Math.random()* 4)+1;
				if(dieRoll2 == 1)
				{
					//playerSkills.getHealth().setHealth( - 1);
				}
				if(dieRoll2 == 2)
				{
					//playerSkills.getHealth().setHealth( - 2);
				}
				if(dieRoll2 == 3)
				{
					//playerSkills.getHealth().setHealth( - 3);
				}
				if(dieRoll == 4)
				{
					//playerSkills.getHealth().setHealth( - 4);
				}
				runningTheGame();
			}
//		public static void theBeholder()
//		{
//			if(com = comSkills.get(2))
//			{
//				int dieRoll = (int)(Math.random()*4)+1;
//				int dieRoll = (int)(Math.random()*4)+1;
//				int dieRoll = (int)(Math.random()*4)+1;
//				int dieRoll = (int)(Math.random()*4)+1;
//			}
//		}
		public static void checkWonGame()
		{
			
		}
		public int getDefense()
			{
				return defense;
			}
		public void setDefense(int defense)
			{
				this.defense = defense;
			}
		public int getHealth()
			{
				return health;
			}
		public void setHealth(int health)
			{
				this.health = health;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
	}
