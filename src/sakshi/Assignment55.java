//Assignment-55 : 13th Oct'2023
//
//WAP to print vowels of each string from the given String array.
//String[] str = {"technocredits","aakanksha","yogesh","shamli"};
//output : technocredits -> eoei
//         aakanksha -> aaaa
//		 yogesh -> oe
//		 shamli -> ai

package sakshi;
public class Assignment55{
	
	String getVowelsFromString(String name){
		String vowelStr = "";
		for(int index=0; index<name.length(); index++){
			char ch = name.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowelStr = vowelStr + ch;
			}
		}
		return vowelStr;
	}
	
	void getStringFromArray(String[] input){
		String name="";
		for(int index=0; index<input.length; index++){
			name = getVowelsFromString(input[index]);
			System.out.println(name);
		}
		
	}
	
	public static void main(String[] args){
		Assignment55 assignment55 = new Assignment55();
		String[] input = {"technocredits","aakanksha","yogesh","shamli"};
		assignment55.getStringFromArray(input);
	}
}