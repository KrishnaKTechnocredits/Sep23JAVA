/*Assignmrnt 27
 * Print the freq of first repeatative character using while loop.
 
String str = "abcdcededffff";
output : c -> 2*/
package yogesh;

public class Yogesh_Assignment27 {

	void charFreq(String str) {
		while (str.length() > 0) {
			int orgLen = str.length();
			char ch = str.charAt(0);
			str = str.replace(str.valueOf(ch), "");
			int newLen = str.length();
			if ((orgLen - newLen) > 1) {
				System.out.println(ch + "->" + (orgLen - newLen));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment27 assignment27 = new Yogesh_Assignment27();
		assignment27.charFreq("abcdcededffff");

	}

}