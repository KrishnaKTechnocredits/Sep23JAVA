//Assignment-51 : 13th Oct'2023
//
//WAP to print vowels in the given String
//String str = "technocredits";
//output : eoei

package sakshi;
public class Assignment51{
	
	void getVowels(String input){
		String vowelStr = "";
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowelStr = vowelStr + ch;
			}
		}
		System.out.println(vowelStr);
	}
	
	public static void main(String[] args){
		Assignment51 assignment51 = new Assignment51();
		String input = "technocredits";
		assignment51.getVowels(input);
	}
}