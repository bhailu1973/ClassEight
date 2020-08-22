package JavaCollection;

import java.util.Set;
import java.util.TreeSet;

public class ThreeSet {

	public static void main(String[] args) {
		// Explain collection
		// Hashset is random no duplicate
		//Linked in order as request no duplicates
		//Tree Alphabetic order no duplicates
		Set<String> tfClass = new TreeSet <String>();
		
		tfClass.add("CNS");
		tfClass.add("SQL");
		tfClass.add("ALM");
		tfClass.add("JAVA");
		tfClass.remove(2);
		tfClass.add("Dog");
		tfClass.add("Cat");
		tfClass.add("Girl");
		tfClass.add("Boy");
		tfClass.add("Male");
		tfClass.add("Female");
		tfClass.add("Dad");
		tfClass.add("mom");
		
		
	
		System.out.println(tfClass.size());
		
		for(String item :tfClass) {
			System.out.println(item);
	}
		Object[] myValuesArray = tfClass.toArray();
		System.out.println(myValuesArray[0]);
	
		}
	}


