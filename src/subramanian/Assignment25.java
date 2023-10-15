/*Assignment 25
 	Print the freq of all character using nested for loop. 
	String str = "aakansha";
	output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1*/

package subramanian;

public class Assignment25 {

	void printCharFreq(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			if (ch != '*') {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					if (ch == input.charAt(innerIndex)) {
						count++;
					}
				}
				System.out.println(ch + "-->" + count);
				input = input.replace(ch, '*');
			}
		}
	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		assignment25.printCharFreq("aakanksha");

	}

}
