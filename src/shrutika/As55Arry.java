/*Assignment-55 : 13th Oct'2023 Print vowels in array of string
String[] str = {"technocredits","aakanksha","yogesh","shamli"}; 
output : technocredits -> eoei     
    aakanksha -> aaaa 
    yogesh -> oe 
    shamli -> ai 
   */
package shrutika;

public class As55Arry {

	String getVowel(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str = str + ch;
			}
		}
		return str;
	}

	void printVowel(String[] arry) {
		String[] newArry = new String[arry.length];
		for (int index = 0; index < arry.length; index++) {
			newArry[index] = getVowel(arry[index]);
			System.out.println(arry[index] + " -> " + newArry[index]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "technocredits", "aakanksha", "yogesh", "shamli" };
		As55Arry arryA55 = new As55Arry();
		arryA55.printVowel(input);
	}
}
