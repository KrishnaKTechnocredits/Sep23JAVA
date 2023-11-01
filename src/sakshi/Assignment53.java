//Assignment-53 : 13th Oct'2023
//
//Write a program to return unique vowels included in the string, ensure sequence is maintained.
//String str = "aakaniksha eaep dube";
//output : aieu

package sakshi;
public class Assignment53{
	
	void getUniqueVowel(String input){
		String vowelStr = "";
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowelStr = vowelStr + ch;
				input = input.replace(ch, '*');
			}
		}
		System.out.println(vowelStr);
	}
	
	public static void main(String[] args){
		Assignment53 assignment53 = new Assignment53();
		String input = "aakaniksha eaep dube";
		assignment53.getUniqueVowel(input);
	}
}