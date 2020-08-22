package JavaCollection;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {
		// Duplicate is not allowed
		//Respond in order. not random order
		Set<String> tfClass = new LinkedHashSet <String>();
		
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
	}

}
