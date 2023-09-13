package jagrati;

/*Assignment-21 : 13th Sep'2023

Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5
 
 */
public class HighestFreqString {
       
	int getFreq(String input, char ch){
		return ch;

	}
	void maxFreq(String input) {
		int maxFreq =0;
		char maxCh = ' ';
		for(int index =0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int freq = getFreq(input, ch);
			if(maxFreq<freq) {
				maxFreq= freq;
				maxCh = ch;
			}
			
		}
		System.out.println(input + " -> " +maxCh+ " -> " + maxFreq);
	}
	
	    public static void main(String[] args) {
	    	HighestFreqString freq = new HighestFreqString();
			freq.maxFreq("aakanksha");
			freq.maxFreq("teecccchnoceredites");
		}
}
