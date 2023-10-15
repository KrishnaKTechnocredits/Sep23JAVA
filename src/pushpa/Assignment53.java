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

package pushpa;

public class Assignment53 {

	public String getUniqueVowels(String input) {
		String uniqueVowels = "";
		int i = 0;
		while (i < input.length()) {
			Character ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				if (!uniqueVowels.contains(Character.toString(ch)))
					uniqueVowels += ch;
			}
			i++;
		}

		return uniqueVowels;
	}

	public static void main(String[] args) {
		Assignment53 assignment53 = new Assignment53();
		String result = assignment53.getUniqueVowels("aakaniksha eaep dube");
		System.out.println("Unique Vowls in String: " + result);
	}

}
