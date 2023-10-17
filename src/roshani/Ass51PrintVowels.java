/*Assignment-51 : 13th Oct'2023

WAP to print vowels in the given String
String str = "technocredits";
output : eoei
*/

package roshani;

public class Ass51PrintVowels{
	
	void printVowels(String str){
		String vowels = "";
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowels = vowels + ch;
			}	
		}
		System.out.print("Vowels in given string are: "+ vowels);
	}
	
	public static void main(String[] args){
		String str = "technocredits";
		new Ass51PrintVowels().printVowels(str);
	}
	
}
