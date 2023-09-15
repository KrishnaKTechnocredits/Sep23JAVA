/*2. Print character of given String in reverse order.
input : techno
output : 
       o
	   n
       h
       c
	   e
	   t*/

package rahul;

public class Assignment19_2 {

	void printString(String input) {
		System.out.println("Reverse string for '" + input + "' is: ");
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assignment19_2 assignment19_2 = new Assignment19_2();
		assignment19_2.printString("techno");
	}
}
