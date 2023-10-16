/*Assignment-52 : 13th Oct'2023

WAP to print the count of vowels in the given string
String str = "technocredits";
output : 4
*/

package roshani;

public class Ass52CountVowelsInString{
	void printCountVowels(String str){
		int count = 0;
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				count++;
			}	
		}
		System.out.println("Total count of vowels in a string '"+str+ "' are: "+count);
	}
	
	public static void main(String[] args){
		String str = "technocredits";
		new Ass52CountVowelsInString().printCountVowels(str);
	}
}

