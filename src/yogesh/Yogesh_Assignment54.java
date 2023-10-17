//Assignment-54 : 13th Oct'2023
//
//Write a program to return unique vowels included in the string, ensure sequence is maintained.
//String str = "aakaniksha eaep dube";
//output : iu
//
//String getVowels(String str){
//	String output = "";
//	while(str.length() != 0){
//		
//	}	
//}
package yogesh;

public class Yogesh_Assignment54 {

	String getVowvels(String str) {
		String output = "";
		int index = 0;
		while (index < str.length()) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				// if (str.indexOf(ch) >= 0) {
				int firstIndex = str.indexOf(ch);
				int lastIndex = str.lastIndexOf(ch);
				if (firstIndex == lastIndex) {
					output += ch;
				}
			}
			index++;
		}

		return output;
	}

	public static void main(String[] args) {
		Yogesh_Assignment54 assignment54 = new Yogesh_Assignment54();
		String str = "aakaniksha eaep dube";
		String output = assignment54.getVowvels(str);
		System.out.println("output is:-->"+output);
	}
}
