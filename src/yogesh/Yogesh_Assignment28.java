/*Assignment28
 
Print the first non repeatative character using while loop.
String str = "technocredits";
output : h*/
package yogesh;

public class Yogesh_Assignment28 {
	void charFreq(String str) {
		while (str.length() > 0) {
			int orgLen = str.length();
			char ch = str.charAt(0);
			str = str.replace(str.valueOf(ch), "");
			int newLen = str.length();
			if (orgLen - newLen == 1) {
				System.out.println("First non repetative character in string is-->"+ch);
				break;
			}
		}

	}

	public static void main(String[] args) {
		Yogesh_Assignment28 assignment28 = new Yogesh_Assignment28();
		assignment28.charFreq("technocredits");

	}
}
