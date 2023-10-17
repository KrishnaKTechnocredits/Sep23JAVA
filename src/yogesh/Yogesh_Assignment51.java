//Assignment-51 : 13th Oct'2023
//String str = "technocredits";
//output : eoei
//
//String getVowels(String str){
//	
//}
//
//output : technocredits -> eoei
package yogesh;

public class Yogesh_Assignment51 {

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
		Yogesh_Assignment51 assignment51 = new Yogesh_Assignment51();
		String input = "technocredits";
		String output = assignment51.getVowels(input);
		System.out.println("Vowels in given string are:-->" + output);
	}

}
