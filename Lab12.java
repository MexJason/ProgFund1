import java.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Lab12 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String str="";
	String text="";
	File file;
	Scanner scan;
	String shapeFile="";
	boolean found=false;
	while(!found){
		System.out.println("What is the name of the file containing the information for the shapes?");
		shapeFile = input.nextLine();
		try{
		file = new File(shapeFile+".txt");
		scan= new Scanner(file);
		found=true;
//		FileReader fr = new FileReader();
//		BufferedReader br = new BufferedReader(fr);
	}
		catch(IOException e1){
			System.out.println("FileNotFoundException: The file"+" “"+shapeFile+"”"+" could not be found.");
		}
		catch(InputMismatchException e2){
			System.out.println("InputMismatchException: The input given does not match what is expected, please try again.");
		}
	}
	try{
		file = new File(shapeFile+".txt");
		scan= new Scanner(file);
//	System.out.println("How many shapes do you want to create?");	
	int shapes = Integer.valueOf(scan.nextLine());
//	System.out.println(shapes);
	ArrayList<Shape> shape = new ArrayList<Shape>(shapes);
	int e=0;
	for(int i=0;i<shapes;i++){
	//System.out.println("What shape do you want to make (1=circle, 2=rectangle, 3=triangle)?");
	int shap = Integer.valueOf(scan.nextLine());
	//System.out.println(shap);
	if(shap==1){
		//System.out.println("What color is this circle?");
		String color = scan.nextLine();
	//	System.out.println("What's the radius?");
		double radius = Double.valueOf(scan.nextLine());
		Circle circle = new Circle(color,radius);
		shape.add(circle);
		e++;
		}
	else if(shap==2){
		//System.out.println("What color is this rectangle?");
		String color = scan.nextLine();
		//System.out.println("What's the height?");
		int height = Integer.valueOf(scan.nextLine());
		//System.out.println("What's the width?");
		int width = Integer.valueOf(scan.nextLine());
		e++;
		Rectangle rectangle = new Rectangle(color,height,width);
		shape.add(rectangle);
	}
	else if(shap==3){
		//System.out.println("What color is this triangle?");
		String color = scan.nextLine();
		//System.out.println("What's the height?");
		int height = Integer.valueOf(scan.nextLine());
		//System.out.println("What's the base?");
		int base = Integer.valueOf(scan.nextLine());
		Triangle triangle = new Triangle(color,height,base);
		shape.add(triangle);
		e++;
	}
	else if(shap!=1||shap!=2||shap!=3){
		System.out.println("Invalid input");
		i--;
	}
	}
int j=0;
	while(j==0){
	System.out.print("Select an option:\n1. Display info for circles\n2. Display info for rectangles\n3. Display info for triangles\n4. Add another shape\n5. Exit");
	int option = input.nextInt();
	switch(option){
	case 1:
	int p=1;
	PrintWriter x;
	try{	
		x = new PrintWriter("CircleInfo.txt");
		for(int r=0;r<shape.size();r++){
		if(shape.get(r) instanceof Circle){
			String first = "Circle "+p+"'s Info:";
			String print =shape.get(r).toString();
			x.println(first+print);
			p++;
		}
		}
		x.close();
	}		
	catch(IOException e4){
		
	}
	break;
	case 2: int u=1;
	PrintWriter z;
	try{	
		z = new PrintWriter("RectangleInfo.txt");
		for(int r=0;r<shape.size();r++){
		if(shape.get(r) instanceof Rectangle){
			String first = "Rectangle "+u+"'s Info:";
			String print =shape.get(r).toString();
			z.println(first+ print);	
			u++;
		}
		}
		z.close();
	}
	catch(Exception e5){
		
	}
		break;
	case 3: int q=1;
	PrintWriter f;
	try{	
		f = new PrintWriter("TriangleInfo.txt");
		for(int r=0;r<shape.size();r++){
			if(shape.get(r) instanceof Triangle){
				String first = "Triangle "+q+"'s Info:";
				String print =shape.get(r).toString();
				//System.out.println(first+print);
				f.println(first+ print);		
				q++;
			}
			}
		f.close();
	}
	catch(Exception e6){
	}
	break;
	case 4: 
		System.out.println("What shape do you want to make (1=circle, 2=rectangle, 3=triangle)?");
		int shapp = input.nextInt();
		if(shapp==1){
			System.out.println("What color is this circle?");
			String color = input.next();
			System.out.println("What's the radius?");
			double radius = input.nextDouble();
			Circle circle = new Circle(color,radius);
			shape.add(circle);
			e++;
			}
		else if(shapp==2){
			System.out.println("What color is this rectangle?");
			String color = input.next();
			System.out.println("What's the height?");
			int height = input.nextInt();
			System.out.println("What's the width?");
			int width = input.nextInt();
			e++;
			Rectangle rectangle = new Rectangle(color,height,width);
			shape.add(rectangle);
		}
		else if(shapp==3){
			System.out.println("What color is this triangle?");
			String color = input.next();
			System.out.println("What's the height?");
			int height = input.nextInt();
			System.out.println("What's the base?");
			int base = input.nextInt();
			Triangle triangle = new Triangle(color,height,base);
			shape.add(triangle);
			e++;
		}
		else if(shapp!=1||shapp!=2||shapp!=3){
			System.out.println("Invalid input");	
		}
		else
		{
			System.out.println("!");
		}
	break;
	case 5: System.out.println("Good Bye");
	System.exit(0);
	break;
	}
	}
	}
	catch(InputMismatchException e){
		System.out.println("InputMismatchException: The input given does not match what is expected, please try again.");
	}
	catch(Exception e7){
		System.out.println("File not found.");
	}
	
	}
}