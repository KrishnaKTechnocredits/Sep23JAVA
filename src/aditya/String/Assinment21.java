
//Write a program to find character having maximum frequency from given String.


package aditya.String;

public class Assinment21 {
	int printCharFreq(String input, char ch) {
		int count=0;
		for(int index=0; index<input.length();index++) {
			if(input.charAt(index)==ch) {
				count++;
			}
		}return count;
	}
	
	void getMaxFreChar(String input) {
		char maxChar= ' ';
		int maxFreq= 0;
		for(int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
			int frequency= printCharFreq(input, ch);
				if(maxFreq<frequency) {
					maxFreq=frequency;
					maxChar= ch;
				}
		}
		System.out.println(input+"--------> "+maxChar+ "---> " +maxFreq);
	}
	
	public static void main(String[] args) {
		Assinment21 as21 = new Assinment21();
		as21.getMaxFreChar("aakanksha ");
		System.out.println("========================");
		as21.getMaxFreChar("teecccchnoceredites");
	}
	
}
		
	
