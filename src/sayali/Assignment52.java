/* WAP to return count of vowels
String str = "technocredits";
output : 4
int getVowels(String str){
} */

package sayali;

public class Assignment52 {

	void getVowelsCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println(+count);
	}

	public static void main(String[] args) {
		new Assignment52().getVowelsCount("technocredits");
	}
}