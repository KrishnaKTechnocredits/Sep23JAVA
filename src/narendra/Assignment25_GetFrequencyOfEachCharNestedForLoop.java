/*
Assignment - 25 : 18th Sep'2023
Print the freq of all character using nested for loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1
 
 */

package narendra;

public class Assignment25_GetFrequencyOfEachCharNestedForLoop {

	void toPrintCharFreqOfEachChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = 0;
			if (ch != '#') {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					if (ch == input.charAt(innerIndex)) {
						count++;
					}
				}
				System.out.println(ch + "--> " + count);
				input = input.replace(ch, '#');
			}
		}
	}

	public static void main(String[] args) {
		Assignment25_GetFrequencyOfEachCharNestedForLoop printfreqofchar = new Assignment25_GetFrequencyOfEachCharNestedForLoop();
		String userinput = "aakanksha";
		printfreqofchar.toPrintCharFreqOfEachChar(userinput);

	}

}
