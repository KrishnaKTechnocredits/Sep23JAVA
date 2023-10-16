/*Assignment-54 : 13th Oct'2023

Write a program to return unique (non-repeated) vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu
*/
package roshani;

public class Ass54UniqueVowels{
	
	String getUniqueVowels(String str){
		String output = "";
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				if(str.indexOf(ch) == str.lastIndexOf(ch)){
					output = output + ch;
				}
			}	
		}
		System.out.println("Given string is: "+str);
		return output;
	}
	
	public static void main(String[] args){
		Ass54UniqueVowels assignment54 = new Ass54UniqueVowels();
		System.out.println("Unique vowels in string that are are: "+ assignment54.getUniqueVowels("aakaniksha eaep dube"));
	}
}