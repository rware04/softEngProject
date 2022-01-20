/**
 * 
 */
package testing;

import java.util.Random;

// import random number generator

/**
 * @author robertware
 *
 */
public class RollTwoSixSidedDie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(dieMessage(dice(), dice()));

	}
	
	/**
	 * 
	 * @return
	 */
	private static int dice() {
		int d1;
		
		Random r = new Random();
		
		d1 = r.nextInt(6);
		
		return d1;
	}
	
	/**
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	private static String dieMessage(int d1, int d2) {
		String dM;
		
		dM = "You rolled a " + d1 + " and a " + d2 + ". Your Score is " +(d1+d2);
		
		return dM;
	}

}
