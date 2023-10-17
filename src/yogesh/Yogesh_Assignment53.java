//Write a program to return unique vowels included in the string, ensure sequence is maintained.
//String str = "aakaniksha eaep dube";
//output : aieu
//
//String getVowels(String str){
//	String output = "";
//	while(str.length() != 0){
//		
//	}	
//}
package yogesh;

public class Yogesh_Assignment53 {

	String getVowvels(String str) {
		String output = "";

		while (str.length() != 0) {
			char ch = str.charAt(0);
			str = str.replace(str.valueOf(ch), "");
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		return output;

	}

	public static void main(String[] args) {
		Yogesh_Assignment53 assignment53 = new Yogesh_Assignment53();
		String input = "aakaniksha eaep dube";
		String output = assignment53.getVowvels(input);
		System.out.println("Output:-->"+output);
	}
}
