/*Assignment-55 : 13th Oct'2023

WAP to print vowels of each string from the given String array.
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai

 */

package jagrati;

public class Assignment55 {
	
	String nameArray(String str) {
		String output ="";
		for(int index =0; index < str.length(); index++) {
			char ch = str.charAt(index);
			//str = str.replace(String.valueOf(ch), "");
			if (ch =='a'|| ch =='e'|| ch == 'i' || ch=='o' || ch == 'u') {
				output = output + ch;
			}
		}
		return output;
	}
	void vowelArray(String [] input){
		for(int index =0; index <input.length; index ++) {
			String output = nameArray(input[index]);
			System.out.println(input[index]+ "-->" +output);
		}
	}
public static void main(String[] args) {
	String[] input = {"technocredits","aakanksha","yogesh","shamli"};
	Assignment55 assign = new Assignment55();
	assign.vowelArray(input);
}
}
