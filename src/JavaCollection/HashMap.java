package JavaCollection;
import java.util.Map;


public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Map<Integer, String> tfClass = new HashMap <Integer, String>();
		
		tfClass.put(0,"CNS");
		tfClass.put(1,"SQL");
		tfClass.put(2,"ALM");
		tfClass.put(3,"JAVA");
		tfClass.remove(2);
		tfClass.put(4,"Dog");
		tfClass.put(5,"Cat");
		tfClass.put(6,"Girl");
		tfClass.put(7,"Boy");
		tfClass.put(8,"Male");
		tfClass.put(9,"Female");
		tfClass.put(10,"Dad");
		tfClass.put(11,"mom");
		
		
	
		System.out.println(tfClass.size());
		
		//for(String item :tfClass) {
			//System.out.println(item);
	
		//Object[] myValuesArray = tfClass.toArray();
		//System.out.println(myValuesArray[0]);
	
	}


}
