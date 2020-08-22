package javaException;

import java.util.Scanner;

public class FlagAndCountrer {

	private static int counter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Flag = boolen- needs to know if true or false
		//Count
		
		System.out.println("This is division calculator");
	    
	       Scanner userInput = new Scanner(System.in);
	    
			System.out.println("Give me the first Number");
			int a = userInput.nextInt();
			
			System.out.println("Give me the second Number");
			int b = userInput.nextInt();
						
			for(int i=a; i<b; i++) {
				System.out.println(i);
				
				//if(i%3==0) {
					//counter++;
					
				}
			}
		//	System.out.println("total amount:" + counter);
			//Interview question
			//divisble by 3 or multiple of 3
			//15- yes
			//10- no
			//5- np
		
	}

}
