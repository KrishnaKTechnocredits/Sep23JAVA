package technoCredits;

public class Exanple2 {

	/**
	 * 
	 * if if else if else ladder nested if
	 * 
	 */

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = false;
		boolean b4 = false;
		boolean b5 = true;
		boolean b6 = false;

		// ---> Priority
		//		1. &&
		//		2. ||
		if (b1 || b2 && b3 || b4 || b5 && b6) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}
	}
}
