/*Assingment - 27 : 18th Sep'

Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2 */

package mahesh;

public class Assignment27 {

	void printFreqOfFirstRepChar(String str) {
		while (str.length() > 0) {
			int orgLen = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLen = str.length();
			if (orgLen - newLen > 1) {
				System.out.println("The first repeatative character string is: " + ch + " --> " + (orgLen - newLen));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		assignment27.printFreqOfFirstRepChar("abcdcededffff");
	}

}