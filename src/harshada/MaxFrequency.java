//Write a program to find character having maximum frequency from given String.
//input : aakanksha
//output : aakanksha -> a -> 4
//input : teecccchnoceredites
//output : teecccchnoceredites -> e -> 5
package harshada;

public class MaxFrequency {
	
	int getCharfreq(String input, char ch) {
		int count=0;
		for(int index=0; index<input.length(); index++) {
			if(ch==input.charAt(index)) {
				count++;
			}
		}
		return count;
	}
	
	void printMaxFreqChar(String input) {
		int maxFreq= 0 ;
		char maxchar= ' ' ;
		for( int index=0; index<input.length(); index++) {
		char ab = input.charAt(index);
		int freq = getCharfreq( input , ab);
			if( maxFreq <= freq ) {
			maxFreq = freq ;
			maxchar = ab ;
			}
		}System.out.println(input+" -> "+maxchar+" -> "+maxFreq);
	}
	
	public static void main(String[] args) {
		MaxFrequency maxFrequency=new MaxFrequency();
		maxFrequency.printMaxFreqChar("aakanksha");
		maxFrequency.printMaxFreqChar("teecccchnoceredites");
	}
}
