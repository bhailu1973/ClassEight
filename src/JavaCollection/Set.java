package JavaCollection;

import java.util.HashSet;
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> tfClass = new HashSet <String>();
	
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
		
		
		System.out.println(tfClass.get(2));
		System.out.println(tfClass.size());
		
		for(String item :tfClass) {
			System.out.println(item);
			//Set does not  count duplicates
			//Responds the answer in random order
			//Because it responds in random you can remove with index, you actually have to request the value
	
	}
	}
}
