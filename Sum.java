import java.util.Scanner;
public class Sum {
public static void main(String[] args){
	System.out.println("Welcome to the summation calculator!");
	System.out.println("Please enter a number");
	Scanner input = new Scanner(System.in);
	int userinput = input.nextInt();
	int result = (userinput*(userinput+1))/2;
	System.out.println("The sum of all numbers from 0 to "+userinput+" is "+result+".");
}
}
