import java.util.Scanner;

public class BirthdateGuess {
	public static void main(String[] args){
	String set1 ="1 3 5 7\n"+"9 11 13 15\n"+"17 19 21 23\n"+"25 27 29 31\n";
	String set2="2 3 6 7\n"+"10 11 14 15\n"+"18 19 22 23\n"+"26 27 30 31\n";
	String set3="4 5 6 7\n"+"12 13 14 15\n"+"20 21 22 23\n"+"28 29 30 31\n";
	String set4="8 9 10 11\n"+"12 13 14 15\n"+"24 25 26 27\n"+"28 29 30 31\n";
	String set5 ="16 17 18 19\n"+"20 21 22 23\n"+"24 25 26 27\n"+"28 29 30 31\n";
	System.out.println("I will guess the day you were born ....");
	int guess = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("Is your birthday in this set?");
	System.out.println(set1);
	System.out.println("Yes or No");
	String uno = input.nextLine();
	System.out.println("Is your birthday in this set?");
	System.out.println(set2);
	System.out.println("Yes or No");
	String dos = input.nextLine();
	System.out.println("Is your birthday in this set?");
	System.out.println(set3);
	System.out.println("Yes or No");
	String tres = input.nextLine();
	System.out.println("Is your birthday in this set?");
	System.out.println(set4);
	System.out.println("Yes or No");
	String cuatro = input.nextLine();
	System.out.println("Is your birthday in this set?");
	System.out.println(set5);
	System.out.println("Yes or No");
	String cinco = input.nextLine();
	if(uno.equalsIgnoreCase("yes"))
		guess+=1;
	if(dos.equalsIgnoreCase("yes"))
		guess+=2;
	if(tres.equalsIgnoreCase("yes"))
		guess+=4;
	if(cuatro.equalsIgnoreCase("yes"))
		guess+=8;
	if(cinco.equalsIgnoreCase("yes"))
		guess+=16;
	System.out.println("Your birthday is "+guess);
	}
}
