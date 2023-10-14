/*Assignment-51 : 13th Oct'2023

WAP to print vowels in the given String
String str = "/*Assignment-51 : 13th Oct'2023

WAP to print vowels in the given String
String str = "technocredits";
output : eoei
*/


package deepak;

public class Assignment51_GetVowels{
	String getVowels(String input){
		System.out.println("Input : "+input);
		String output = "";
		for(int index  = 0 ; index < input.length() ; index++){
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				output = output+ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args){
		Assignment51_GetVowels output = new Assignment51_GetVowels();
		System.out.println("Output : "+output.getVowels("technocredits"));
	}
}