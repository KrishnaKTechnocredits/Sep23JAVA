//Assignment-54 : 13th Oct'2023
//
//Write a program to return unique (non-repeated) vowels included in the string, ensure sequence is maintained.
//String str = "aakaniksha eaep dube";
//output : iu

package sakshi;
public class Assignment54{
	
	void getUniqueVowel(String input){
		String vowelStr = "";
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				if(input.indexOf(ch) == input.lastIndexOf(ch)){
				vowelStr = vowelStr + ch;
				}
			}
		}
		System.out.println(vowelStr);
	}
	
	public static void main(String[] args){
		Assignment54 assignment54 = new Assignment54();
		String input = "aakaniksha eaep dube";
		assignment54.getUniqueVowel(input);
	}
}