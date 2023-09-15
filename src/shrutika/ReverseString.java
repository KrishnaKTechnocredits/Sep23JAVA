//Assignment-19 : 10th Sep'2023
//1. Print the frequecy of given character from given String.
//input : technocredits
//      t
		
//output : frequency of t in technocredits is 2.

//2. Print character of given String in reverse order.
//input : techno
//output : 
//       o
//	   n
//      h
//     c
//	   e
//	   t
package shrutika;

public class ReverseString {

	void countString(String input) {
		int count = 0;
		char ch = 't';
		for (int name = input.length() - 1; name >= 0; name--) {
			System.out.println(name + "->" + input.charAt(name));
			if (input.charAt(name) == 't') {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " is " + count);
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.countString("techno");

	}

}
