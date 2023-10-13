/*Assignment-55 : 13th Oct'2023 Print vowels in array of string
String[] str = {"technocredits","aakanksha","yogesh","shamli"}; 
output : technocredits -> eoei     
    aakanksha -> aaaa 
    yogesh -> oe 
    shamli -> ai 
   */
package swati;

public class Ass55PrintVowelsInArrayOfString {
	
	String getVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		return output;
	}
	
	void printVowels(String[] arr) {
		String[] newarr = new String[arr.length];
		for(int index = 0;index<arr.length;index++) {
			newarr[index] = getVowels(arr[index]);
			System.out.println(arr[index]+" -> "+newarr[index]);
		}
	}

	public static void main(String[] args) {
		String[] str = {"technocredits","aakanksha","yogesh","shamli"};
		new Ass55PrintVowelsInArrayOfString().printVowels(str);
	}
}
