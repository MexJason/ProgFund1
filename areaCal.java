//Name: Jason Dubon
//UFL ID: jasondubon
//Section: 11H6
//Project Number: Lab6
//Program will give you area of circle or rectangle or triangle.
import java.util.Scanner;
public class Lab6 {
	
	public static void main(String[] args){
		System.out.println("| Area Calculator |");
		System.out.println("1. Circle");
		System.out.println("2. Triangle");
		System.out.println("3. Rectangle");
		System.out.println("4. Exit");
		Scanner input = new Scanner(System.in);
		String choice = "";
		while(!(choice.equals("4"))){
		System.out.println("Type desired number or shape:");
		choice = input.next();
		if (choice.equals("1")||choice.equalsIgnoreCase("Circle")){
		Lab6.areaCircle();
		}
		if (choice.equals("2")||choice.equalsIgnoreCase("Rectangle")){
			Lab6.areaRectangle();
		}
		if (choice.equals("3")||choice.equalsIgnoreCase("Triangle")){
			Lab6.areaTriangle();
		}
		}
		System.out.println("Invalid input. Try again.");
	}
	public static void areaCircle(){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the circle?");
		int radius = input.nextInt();
		if (radius < 0){
			System.out.println("Failed consistency check!");
			System.exit(0);
		}
		double areaCircle = radius*radius*3.14159;
		System.out.println("The area of the circle is " + radius*radius*3.14159);
	}
	public static void areaRectangle(){
		Scanner input = new Scanner(System.in);
		System.out.println("Type desired number:");
		System.out.println("What is the base of the triangle?");
		int base = input.nextInt();
		System.out.println("What is the height of the triangle?");
		int height = input.nextInt();
		if ((base%2==0)&&(height% 2 == 0)){
			System.out.println("Failed consistency check!");
			System.exit(0);
		}
		System.out.println("The area of the triangle is " + base*height*0.5);
	}
	public static void areaTriangle(){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		int length = input.nextInt();
		System.out.println("What is the width of the rectangle");
		int width = input.nextInt();
		if (length == width){
			System.out.println("Failed consistency check!");
			System.exit(0);
		}
		System.out.println("The area of the rectangle is " + length*width);
	}
	}
