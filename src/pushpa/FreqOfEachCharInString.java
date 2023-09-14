//Write a program to print frequency of each character from given String.
//Assignment 20
package pushpa;

public class FreqOfEachCharInString {
	

	public int getCharFrequency(String str, char ch) {
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch)	
				count++;
		}
		return count;	
	}
	
	public void printFreqChar(String str){
		for (int i = 0; i < str.length(); i++) {
			int freq = getCharFrequency(str, str.charAt(i));
			System.out.println(str.charAt(i)+ " -> " + freq);

		}
	}

	public static void main(String[] args) {
		FreqOfEachCharInString freqOfEachCharInString = new FreqOfEachCharInString();
		freqOfEachCharInString.printFreqChar("aakanksha");
	}

}
