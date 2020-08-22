package JavaCollection;

import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> tfClass = new LinkedList();
		
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
	}

}
