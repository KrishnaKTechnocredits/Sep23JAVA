/*Assignment-51 : 13th Oct'2023
String str = "technocredits";
output : eoei

String getVowels(String str){
	
}

output : technocredits -> eoei*/

package Jyoti_Practice;

public class Assignment51 {

	String getVowels(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;

			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment51 ass = new Assignment51();
		System.out.println("output--->" + ass.getVowels("technocredits"));
	}

}
