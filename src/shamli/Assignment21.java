/*
 * Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5
 */

package shamli;
	
public class Assignment21 {
	
	int getCharFreq(String input,char ch) {
			int count=0;
			for(int index=0;index<input.length();index++) {
				if(input.charAt(index)==ch) {
					count++;
				}
			}
		return count;
	}

	void findMaxFreqOfChar(String input) {
		int maxFreq=0;
		char maxChar=' ';
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			int freq=getCharFreq(input,ch);
			if(maxFreq<freq) {
				maxFreq=freq;
				maxChar=ch;
			}
		}
		System.out.println(input + "--> "+ maxChar +" --> " + maxFreq);
	}


	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.findMaxFreqOfChar("aakanksha");
		assignment21.findMaxFreqOfChar("teecccchnoceredites");
	}
}
