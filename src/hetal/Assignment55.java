//*WAP to print vowels of each string from the given String array.
//*String[] str = {"technocredits","aakanksha","yogesh","shamli"};
//*output : technocredits -> eoei
        //* aakanksha -> aaaa
		//* yogesh -> oe
		 //*shamli -> ai

package hetal;

public class Assignment55 {
	
	void printVowels(String[] input) {	
		for(int index=0;index<input.length;index++) {
			String str = input[index];
			String output = getVowels(str);
			System.out.println(str +"-->"+ output);
		}
	
	}
	String getVowels(String input) {
		String output = "";
		for(int index =0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output = output+ch;
			}
		}
		return output;
	}
		
	
	
	public static void main(String[] args) {
		Assignment55 a = new Assignment55();
		String[] input = {"technocredits","aakanksha","yogesh","shamli"};
		a.printVowels(input);
	}

		
}
