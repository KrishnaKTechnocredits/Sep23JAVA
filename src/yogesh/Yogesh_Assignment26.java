/*assignment26
Print the freq of all character using while loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1*/

package yogesh;

public class Yogesh_Assignment26 {

	void charFreq(String str) {
		while (str.length() > 0) {
			int orgLen = str.length();
			char ch = str.charAt(0);
			str = str.replace(str.valueOf(ch), "");
			int newLen = str.length();
			System.out.println(ch + "->" + (orgLen - newLen));
		}

	}

	public static void main(String[] args) {
		Yogesh_Assignment26 assignment26 = new Yogesh_Assignment26();
		assignment26.charFreq("aakanksha");

	}

}
