//Assignment-52 : 13th Oct'2023
//
//WAP to print the count of vowels in the given string
//String str = "technocredits";
//output : 4

package sakshi;
public class Assignment52{
	
	void getVowelsCount(String input){
		String vowelStr = "";
		int vowelCount =0;
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowelStr = vowelStr + ch;
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
	}
	
	public static void main(String[] args){
		Assignment52 assignment52 = new Assignment52();
		String input = "technocredits";
		assignment52.getVowelsCount(input);
	}
}