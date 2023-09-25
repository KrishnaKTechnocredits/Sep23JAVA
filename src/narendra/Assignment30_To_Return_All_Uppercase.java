/*
Assignment-30 : 22nd Sep'2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index);

*/
package narendra;

public class Assignment30_To_Return_All_Uppercase {
/* Using While Loop */
	void toPrintUppercaseChar1(String str) {
		String output = "";
		int index = 0;
		while (index < str.length()) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + ch;
			}
			index++;
		}
		System.out.println("Output Using While Loop --> " + output);

	}
	
/* Using For Loop */	
	void toPrintUppercaseChar2(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + ch;
			}
		}
		System.out.println("Output Using For Loop --> " + output);

	}

	public static void main(String[] args) {
		Assignment30_To_Return_All_Uppercase toprintuppercase = new Assignment30_To_Return_All_Uppercase();
		toprintuppercase.toPrintUppercaseChar1("TeCHNocreditS");
		toprintuppercase.toPrintUppercaseChar2("TeCHNocreditS");
	}

}
