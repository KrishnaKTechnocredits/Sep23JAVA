/*
Assignment19_2: 10th Sep'2023
Print character of given String in reverse order.
input : techno
output : 
       o
	   n
       h
       c
	   e
	   t
*/

package narendra;

public class ToDisplayStringInReverseOrder {

	void printGivenStringInReverseOrder(String input) {
		int initvalue = input.length() - 1;
		System.out.println("output in reverse order:");
		for (int index = initvalue; index >= 0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		ToDisplayStringInReverseOrder printstringreverseorder = new ToDisplayStringInReverseOrder();
		printstringreverseorder.printGivenStringInReverseOrder("techno");

	}

}
