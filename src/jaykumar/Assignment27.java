/*Assingment - 27 : 18th Sep'2023
Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2*/

package jaykumar;

public class Assignment27 {
	
	void firstRepCharFreq(String input) {
		while(input.length()!=0) {
			int orgLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int newLen = input.length();
			int count = orgLen-newLen;
			if(count >1) {
				System.out.println(ch+" -> "+count);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		assignment27.firstRepCharFreq("abcdcededffff");
	}
}
