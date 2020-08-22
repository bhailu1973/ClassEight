package excerise;

import java.util.Scanner;

public class ReverseString {
	//ask the user to reverse a string/word. You need scanner userInout for the user to respond
	//Polindrome: a  word that reads the same way when reading backwards or forward
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.print("Give me a word: ");
		
		String userData = userInput.next();
		char[] allCharacters = userData.toCharArray();
		
		String finalOutput = "";
		for(int i=allCharacters.length-1; i>0; i--) {
			finalOutput = finalOutput + allCharacters[i];
		}
		
		System.out.println("Reversed");
		if(userData.equalsIgnoreCase(finalOutput)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
		System.out.println(finalOutput);
	

	}

	
	

}
