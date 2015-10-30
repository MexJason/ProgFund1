import java.util.Scanner;
public class Lab8 {
public static void main(String[] args){
	System.out.println("Please provide the size of the input array.");
	Scanner input = new Scanner(System.in);
	int a = 0;
	int inputSize = 0; 
	while (a == 0){
	a =1; 
	inputSize = input.nextInt();
	if(inputSize<=0){
		System.out.println("Invalid array size! Please try again.");
		a =0;
	}
	}
	createInputArray(inputSize);
	int[] array = new int[inputSize];
	System.out.println("Please provide the values of the array. Each value should be seperated by the return key");
	computeAverage(array, inputSize);
	checkAboveAndBelow(array, inputSize);
	splitArray(array,inputSize);
	int[][] NewArray = create2DArray(); 
	for (int row = 0; row < NewArray.length; row++) {
		  for (int column = 0; column < NewArray[row].length; column++) {
		    System.out.print(NewArray[row][column] + " ");
		  }

		  System.out.println();
		  }
	sumRows(NewArray);
}
public static int[] createInputArray(int size){
	int[] array = new int[size];
	return array; 
}
public static double computeAverage(int[] input,int size){
	Scanner user = new Scanner(System.in);
	double sum =0;
	int i =0;
	for(i = 0;i<size;i++){
		input[i]=user.nextInt(); 
		sum +=input[i];
	}
	return sum/i; 
}
public static void checkAboveAndBelow(int[] input,int size){
	int evencount=0;
	int oddcount=0;
	int sum=0;
	int a =0;
	for(a = 0;a<size;a++){
		sum +=input[a];
	}
	int average = sum/a; 
	for(int i = 0;i<size;i++){
		if(input[i]%2==0&&input[i]>=average){
			evencount++;
		}
		if(input[i]%2!=0&&input[i]<average){
			oddcount++;
		}
	}
	System.out.println("The array has "+ evencount+" even numbers above or equal to the average and "+oddcount+" odd numbers below the average.");
}
public static void splitArray(int[] inputArray, int size){
	int a =0;
	String even = "";
	String odd = "";
	for(a = 0;a<size;a++){
		if(a%2==0){
			String temp = Integer.toString(inputArray[a]);
			even += temp+ " ";
			
		}
		if(a%2!=0){
			String temp = Integer.toString(inputArray[a]);
			odd += temp+" ";
			
		}	
	}
	System.out.println("The even indicies are: " + even);
	System.out.println("The odd indicies are: " +odd);
}
public static int[][] create2DArray(){
	Scanner input = new Scanner(System.in);
	System.out.println("How many rows would you like in your 2D Array?");
	int rows = input.nextInt();
	System.out.println("How many columns would you like in your 2D Array?");
	int columns = input.nextInt();
	int[][] NewArray = new int[rows][columns];
	for(int i =0; i<rows;i++){
	System.out.println("You are now creating the array that is row "+i+"!");
	System.out.println("Please provide the values of the array. Each value should be seperated by the return key.");
	for(int a =0; a<columns;a++){
		NewArray[i][a]= input.nextInt();
	}
	}
	return NewArray;
}
public static void sumRows(int[][] array2D){
	int sum=0;
	for(int i =0;i<array2D.length;i++){
		sum=0;
		for(int a=0;a<array2D[i].length;a++){
		sum += array2D[i][a];
		}
		System.out.println("The sum of row "+i+" is "+sum+".");
	}
}
}

