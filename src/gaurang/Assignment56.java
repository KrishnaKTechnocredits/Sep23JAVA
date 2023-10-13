/*String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai*/

package gaurang;

public class Assignment56 {

	String getVowel(String input) {
		String output = "";
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output += ch;
			}
		}
		return output;
	}
	
	void printVowel(String[] input) {
		String[] output = new String[input.length];
		for(int index=0 ; index<input.length ; index++) {
			String x = input[index];
			output[index] = getVowel(x);
			System.out.println(input[index]+"--->"+output[index]);
		}
	}
	
	public static void main(String[] args) {
		Assignment56 a = new Assignment56();
		String[] input = {"technocredits","aakanksha","yogesh","shamli"};
		a.printVowel(input);
	}
}
