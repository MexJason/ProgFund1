//for harry poter fans
package project3;
import java.util.Scanner;
public class DiagonAlleyGuide {
public static void main(String[] agrs){
	System.out.println("Welcome to Diagon Alley!");
	int galleons = 0;
	int sickles = 0;
	int knuts = 0;
	boolean hasBroom = false;
    boolean hasRobes = false;
    boolean hasWand = false;
    boolean hasBook = false;
    boolean hasHistory = false;
    boolean hasMagical = false;
    boolean hasCauldron = false;
	int i=0;
	while (i!=-1){
	System.out.print("\nMain Menu:\n");
	System.out.print("1. Gringotts Bank\n2. List of Supplies\n3. Shoppes\n4. Leave\n");
	System.out.println("Selection:");
	Scanner input = new Scanner(System.in);
	int selection = input.nextInt();
	String Inventory = "";
   	String Need = "";
    if (hasBroom)
    	Inventory += "Broom\n";
    if (hasRobes)
    	Inventory += "School robes\n";
    if (hasWand)
    	Inventory += "Wand\n";
    if (hasBook)
    	Inventory += "The Standard Book of Spells\n";
    if (hasHistory)
    	Inventory += "A History of Magic\n";
    if (hasMagical)
    	Inventory += "Magical Drafts and Potions\n";
    if (hasCauldron)
    	Inventory += "Cauldron\n";
    if (hasBroom==false)
    	Need += "Broom\n";
    if (hasRobes==false)
    	Need += "School robes\n";
    if (hasWand==false)
    	Need += "Wand\n";
    if (hasBook==false)
    	Need += "The Standard Book of Spells\n";
    if (hasHistory==false)
    	Need += "A History of Magic\n";
    if (hasMagical==false)
    	Need += "Magical Drafts and Potions\n";
    if (hasCauldron==false)
    	Need += "Cauldron\n";
	switch(selection){
	case 1: int a = 0;
		while(a!=3){
		System.out.print("\nGringotts Bank\n1. Exchange Money\n2. Check Balance\n3. Exit\n");
		System.out.println("Selection:");
		int bankselect = input.nextInt();
			switch(bankselect){
			case 1:
				System.out.println("How much would you like to exchange?");
				System.out.println("USD:");
				double USD = input.nextDouble();
				if (USD<0){
					System.out.print("Transaction failed!\nInput cannot be negative!\n");
					break;
				}
				galleons += exchangeGalleons(USD);
				sickles += exchangeSickles(USD);
				knuts += exchangeKnuts(USD);
				System.out.println("Transaction Complete!");
				break;
			case 2: 
				balance(galleons, sickles, knuts); break;
			case 3: a=3;
				break;
			default: System.out.println("Invalid entry!"); break;
			}
		}
		break;
	case 2: 
        System.out.print("\nInventory:\n"+Inventory+"\n");
		System.out.print("Need:\n"+Need+"");
		break;
	case 3: int b=0;
		while(b!=6){
		System.out.print("\nShoppes\n1. Broomstix \n2. Second-Hand Robes \n3. Olivanders \n4. Flourish and Blotts \n5. Potage’s Cauldron Shop \n6. Exit\n");
		System.out.println("Selection:");
		int shopselect = input.nextInt();
		switch(shopselect){
		case 1: int c = 0;
		while(c!=1){
			System.out.println("Broomstix");
			System.out.print("1. Buy Broom for 1 Galleon\n2. Exit\n");
			System.out.println("Selection:");
			int broomselect = input.nextInt();
			switch(broomselect){
			case 1:	if (hasBroom==true){
				System.out.println("Transaction failed!");
				System.out.println("You already have this!");
				System.out.println("");
				break;
				}
				int cost = 49;
				if (enoughMoney(galleons, sickles, knuts, cost)){
					galleons= galleons - 1;  
					hasBroom= true;
				}
				break;
			case 2: c=1;
				break;
			default: System.out.println("Invalid entry!"); break;
		}
		}
			break;
		case 2:  int d = 0;
		while(d!=1){
			System.out.println("Second-Hand Robes");
		System.out.print("1. Buy School robes for 12 Sickles\n2. Exit\n");
		System.out.println("Selection:");
		int robeselect = input.nextInt();
			switch(robeselect){
			case 1:	if (hasRobes==true){
				System.out.println("Transaction failed!");
				System.out.println("You already have this!");
				System.out.println("");
			}
			int cost = (int)(12*2.9); 
			if (enoughMoney(galleons, sickles, knuts, cost)){
				hasRobes= true;
				if (sickles<12&&galleons>=1){
					galleons = galleons - 1;
					sickles = (sickles + 17);
					sickles= sickles - 12;
					break;
				}
				sickles= sickles - 12;  
				
			}
				break;
			case 2: d=1;
				break;
			default: System.out.println("Invalid entry!"); break;
		}
		}
			break;
		case 3: int e = 0;
			while(e!=1){
				System.out.println("Olivanders");
				System.out.print("1. Buy Wand for 7 Sickles\n2. Exit\n");
				System.out.println("Selection:");
				int wandselect = input.nextInt();
				switch(wandselect){
					case 1:	if (hasWand==true){
						System.out.println("Transaction failed!");
						System.out.println("You already have this!");
						System.out.println("");
					}
					int cost = (int)(7*2.9); 
					if (enoughMoney(galleons, sickles, knuts, cost)){
						hasWand= true;
						if (sickles<7&&galleons>=1){
							galleons = galleons - 1;
							sickles = (sickles + 17);
							sickles= sickles - 7;
							break;
						}
						sickles= sickles - 7;  
						
					}
						break;
					case 2: e=1;
					break;
					default: System.out.println("Invalid entry!"); break;
				}
			}
			break;
		case 4: int f = 0;
		while(f!=1){
			System.out.println("Flourish and Bloots");
		System.out.print("1. Buy The Standard Book of Spells for 5 Sickles\n2. Buy A History of Magic for 3 Sickles and 12 Knuts\n3. Buy Magical Drafts and Potions for 27 Knuts\n4. Exit\n");
		System.out.println("Selection:");
		int fbselect = input.nextInt();
		switch(fbselect){
		case 1:	if (hasBook==true){
			System.out.println("Transaction failed!");
			System.out.println("You already have this!");
			System.out.println("");
			}
			int costA = (int)(5*2.9); 
			if (enoughMoney(galleons, sickles, knuts, costA)){
			hasBook= true;
			if (sickles<5&&galleons>=1){
				galleons = galleons - 1;
				sickles = (sickles + 17);
				sickles= sickles - 5;
				break;
			}
			sickles= sickles - 5;  
			
		}
			break;
		case 2:if (hasHistory==true){
			System.out.println("Transaction failed!");
			System.out.println("You already have this!");
			System.out.println("");
			}
			int costB = (int)(3*2.9+12/10); 
			if (enoughMoney(galleons, sickles, knuts, costB)){
			hasHistory= true;
				if (sickles<3&&galleons>=1){
				galleons = galleons - 1;
				sickles = (sickles + 17);
				sickles=  sickles - 3;
				}
				if(knuts<12&&sickles>=1){
				sickles= sickles - 1; 
				knuts = (knuts + 29);
				knuts= knuts - 12; 
				break;
				}
			sickles=  sickles - 3;
			knuts= knuts - 12; 
			
		}
			break;
		case 3: if (hasMagical==true){
			System.out.println("Transaction failed!");
			System.out.println("You already have this!");
			System.out.println("");
			}
			int costC = (int)(27/10); 
			if (enoughMoney(galleons, sickles, knuts, costC)){
			hasMagical = true;
			if (knuts<27&&sickles>=1){
				sickles=sickles - 1;
				knuts = (knuts + 29);
				knuts= knuts - 27;
				break;
			}
			knuts = knuts - 27; 
			
			}
			break;
		case 4: f=1;
			break;
		default: System.out.println("Invalid entry!"); break;
		}
		}
			break;
		case 5:  int g = 0;
		while(g!=1){
			System.out.println("Potage's Cauldron Shop");
			System.out.print("1. Buy Cauldron for 10 Sickles\n2. Exit\n");
			System.out.println("Selection:");
			int cauldselect = input.nextInt();
			switch(cauldselect){
				case 1:	if (hasCauldron==true){
					System.out.println("Transaction failed!");
					System.out.println("You already have this!");
					System.out.println("");
					}
					int cost = (int)(10*2.9); 
					if (enoughMoney(galleons, sickles, knuts, cost)){
					hasCauldron= true;
						if (sickles<10&&galleons>=1){
							galleons = galleons - 1;
							sickles = (sickles + 17);
							sickles= sickles - 10;
							break;
						}
					sickles= sickles - 10;  
						
					}
					break;
				case 2: g=1; break;
				default: System.out.println("Invalid entry!"); break;
			}
		}
		break;
		case 6: b=6; break;
		default: System.out.println("Invalid entry!");break;
		}
		}
		break;
	case 4: 
		if ((hasBroom)&&(hasRobes)&&(hasWand)&&(hasBook)&&(hasHistory)&&(hasMagical)&&(hasCauldron)){
		System.out.println("Have a nice day!!");
		i = -1;
		break;
		}
			if (!(hasBroom)&&!(hasRobes)&&!(hasWand)&&!(hasBook)&&!(hasHistory)&&!(hasMagical)&&!(hasCauldron)){
				System.out.println("You have no supplies!");
				break;
	}
				else {
					System.out.println("You are missing some items!");
					System.out.print("\nMissing:\n"+Need+"\n");
			}	
			break;
	default: System.out.println("Invalid entry!");break;
	}
	}
	
}
//Takes the dollar input and returns number of galleons to add.
public static int exchangeGalleons(double USD){
	double Galleons= Math.floor(USD/49.3);
	int galleon=(int) Galleons;
	return galleon;
}
                    
//Takes the dollar input and returns number of sickles to add.
public static int exchangeSickles(double USD){
	double Galleons= Math.floor(USD/49.3);
	double mat = Math.floor(USD - Galleons*49.3);
	double Sickles = Math.floor(mat/2.9);
	int sickles=(int) Sickles;
	return sickles;
}
                    
//Takes the dollar input and returns number of knuts to add.
public static int exchangeKnuts(double USD){
	double Galleons= Math.floor(USD/49.3);
	double mat = Math.floor(USD - Galleons*49.3);
	double Sickles = Math.floor(mat/2.9);
	double moremat = (USD-Galleons*49.3-Sickles*2.9);
	double Knuts = moremat*10;
	int knuts=(int) Knuts;
	return knuts;
}
                    
//Prints out your balance. Singularity is noted.
public static void balance(int galleon, int sickle, int knut){
	String gall="Galleon";
	String sick="Sickle";
	String kuts="Knut";
	String G ="s";
	if (galleon!=1)
		gall+=G;
	if(sickle!=1)
		sick+=G;
	if (knut!=1)
		kuts+=G;
	System.out.println("You have "+galleon +" " +gall+", "+sickle+" " + sick+", and "+knut+" " + kuts+".");
}
//Checks if you have enough money to purchase desired item.
public static boolean enoughMoney(int galleon, int sickle, int knut, int cost){
	int USD = 1+ (int)(galleon*49.3 + sickle*2.9 + knut/10);
	int transaction = USD - cost;
	boolean result = false; 
	if (transaction<0){
		System.out.println("Transaction failed!");
		System.out.println("You do not have enought moeny!");
		System.out.println("");
		result = false; 
	}
	if(transaction>=0){
		System.out.println("Transaction sucessful!");
		System.out.println("");
		result = true;
	}
	return result; 
}

}
