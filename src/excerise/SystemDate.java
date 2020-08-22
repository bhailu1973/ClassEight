package excerise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Everytime you run a code,  you want a system code
		
		  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date)); 
		
		
		
		// How long does it take to print out 1 to 5000 number
		for(int i =1;1 < 5000; i++) {
		System.out.println(i);
		}
		//Start time
		//End timme
		//How long it took to count to 5000= End time- Start time
	}

}
