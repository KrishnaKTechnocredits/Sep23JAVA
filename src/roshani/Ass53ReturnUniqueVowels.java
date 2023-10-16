/*Assignment-53 : 13th Oct'2023

Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu
*/

package roshani;

public class Ass53ReturnUniqueVowels{
	
	String getUniqueVowels(String str){
		String output = "";
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if(ch != '#'){
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					output = output + ch;
				}	
			}
			str = str.replace(ch,'#');	
		}
		return output;
	}
	
	public static void main(String[] args){
		Ass53ReturnUniqueVowels assignment53 = new Ass53ReturnUniqueVowels();
		System.out.print("Unique vowels in string are: "+assignment53.getUniqueVowels("aakaniksha eaep dube"));
	}
}