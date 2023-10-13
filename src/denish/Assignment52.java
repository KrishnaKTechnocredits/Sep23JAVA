/*Assignment-52 : 13th Oct'2023
String str = "technocredits";
output : 4*/
package denish;

public class Assignment52 {

	String getVowels(String str) {
		String output = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
				sum++;
			}
		}
		System.out.println(sum);
		return output;
	}

	public static void main(String[] args) {
		Assignment52 ass = new Assignment52();
		ass.getVowels("technocredits");
	}
}
