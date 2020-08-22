package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayLidtCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Array (group of data) 1. By  know the value
		String[] Students = {"Tom", "Tim", "Jane"};
		
		//2nd type of array the number of values ex. has 4 values
		String[] names = new String [5];
		
		//ArrayList = dynamic in size
		//Formula; List<objectdatatype> identifier = new typeoflist <objectdatatype>
		//data in the the brackects have to be non primative
		//The list is an interface
		//
		//List<Integer> al = new ArrayList<Integer>();
		
		List<String> tfClass = new ArrayList<String>();
		
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
			//whats the difference between a linkedlist and arraylist
		}
		
	}

}
