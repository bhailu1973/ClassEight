package excerise;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Excerise2RandomNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generate 3 numbers that must be a 3 digit number from 100 to 999999
	
		Set<Integer> randomvalue = new LinkedHasSet<Integer>();
		for(int i=0; i<500; i++) {
			//System.out.println(getRandomNumberInRange(100, 999));
			randomvalue.add(getRandomNumberInRange(100, 999));
		}
	}
	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
