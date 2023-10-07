/*Assignment 41: 01-Oct-23
WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtres
*/

package jyoti;

public class Assignment41 {

	void getProcessedData(String str) {
		String output = "";

		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				output = output + str.substring(index);

				System.out.println("output--->" + output);
				break;

			}

		}

	}

	public static void main(String[] args) {
		Assignment41 fv = new Assignment41();
		fv.getProcessedData("pqrabcgtyes");

	}

}