//Program decrypts text messages and finds substrings within the string.  
import java.util.Scanner;
import java.io.File; 

public class TextThreatAssessment {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int L=300;
	while (L!=1){
	System.out.println("Enter the UFID of the person who wrote the message:");
	int ufid = input.nextInt();
		if ((ufid < 10000000)||(ufid > 99999999)){
			System.out.println("Error. Enter UFID again.");
			System.exit(0);
		}
	System.out.println("Opening file: "+ ufid +".txt");
	System.out.println("Enter the word of interest: ");
	String word = input.next();
	if(ufid==12345678){
//Decrypts text
		String encryptedString= "";
		try
     {
    	File file = new File("12345678.txt");
    	Scanner sc = new Scanner(file);
    	while (sc.hasNextLine())
     {
    		encryptedString+=sc.nextLine();
	 }
    	sc.close();
     } 		catch(Exception ex){
		ex.printStackTrace();
     }
		String word2 = "";
		for(int i = 1; i<encryptedString.length(); i++ ){
			if(i % 2 == 1)
			word2 = encryptedString.charAt(i) + word2;
		}
		int index = word2.indexOf(word);
		int count = 0;
		while (index != -1) {
		    count++;
		    word2 = word2.substring(index + 1);
		    index = word2.indexOf(word);
		}
		System.out.println("The word "+word+" was found "+count+" time(s).");
		if (count==2)
			System.out.println("Messages from student "+ufid+" were found to be: Somewhat Threatening");
		else if (count==3)
			System.out.println("Messages from student "+ufid+" were found to be: Threatening");
		else if (count>=4)
			System.out.println("Messages from student "+ufid+" were found to be: Highly Threatening");
		else if (count<2)
			System.out.println("Messages from student "+ufid+" were found to be: Safe");
	}
		
	if(ufid==99999999){
		String encryptedString= "";
	    try
	     {
	    	File file = new File("99999999.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine())
		{
			encryptedString+=sc.nextLine();
	}
		sc.close();
	} 	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	    String word2 = "";
		for(int i = 1; i<encryptedString.length(); i++ ){
			if(i % 2 == 0)
			word2 = encryptedString.charAt(i) + word2;
		}
		int index = word2.indexOf(word);
		int count = 0;
		while (index != -1){
		    count++;
		    word2 = word2.substring(index + 1);
		    index = word2.indexOf(word);
		}
		System.out.println("The word "+word+" was found "+count+" time(s).");
		if (count==2)
			System.out.println("Messages from student "+ufid+" were found to be: Somewhat Threatening");
		else if (count==3)
			System.out.println("Messages from student "+ufid+" were found to be: Threatening");
		else if (count>=4)
			System.out.println("Messages from student "+ufid+" were found to be: Highly Threatening");
		else if (count<2)
			System.out.println("Messages from student "+ufid+" were found to be: Safe");
		
	}
	System.out.println("Press (y) to continue or (n) to exit.");
	String YorN = input.next();
	if (YorN.equalsIgnoreCase("y")){
		L=300; 
	}
	if (YorN.equalsIgnoreCase("N"))
		System.exit(0);
	if (!(YorN.equalsIgnoreCase("N"))&&!(YorN.equalsIgnoreCase("Y"))){
		System.out.println("Error. Try Again.");
		System.exit(0);
	}
	}
	}
	}