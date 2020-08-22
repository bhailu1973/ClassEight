package javaException;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//System.out.println("This is division calculator");
    
       //Scanner userInput = new Scanner(System.in);
    
		//System.out.println("Give me the first Number");
		//double a = userInput.nextDouble();
		
		//System.out.println("Give me the second Number");
		//double b = userInput.nextDouble();
		
		//System.out.println("Result:" + a/b);

		//Try Catch Block
		
		try {
			
			System.out.println("This is division calculator");
		    
		       Scanner userInput = new Scanner(System.in);
		    
				System.out.println("Give me the first Number");
				int a = userInput.nextInt();
				
				System.out.println("Give me the second Number");
				int b = userInput.nextInt();
				
				System.out.println("Result:" + a/b);
			
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Try running again, i think your 2nd inout was 0 and thats no pssible");
		}
		//this block will execute even if the rest of the code doesnt catch the exception
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("rest of my code -after try catch");
		}
	
	
}
	


