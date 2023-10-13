/*Write a program to find character having maximum frequency from given String.*/

package subramanium;

public class Assignment_21 {

	int getCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (ch == input.charAt(index)) {
				count++;
			}	
		}
		return count;
	}
	
	void maxCharFreq(String input) {
		int maxFreq=0;
		char maxChar=' ';
		for(int index=0;index<input.length();index++) {
		char ch= input.charAt(index);
		int freq=getCharFreq(input, ch);
		if(maxFreq<freq) {
			maxFreq=freq;
			maxChar=ch;
			
		}
		}
		System.out.println("Maximum frequency for "+input+" is "+maxChar+" = " +maxFreq);
		
	}

	public static void main(String[] args) {
		Assignment_21 assignment_21 = new Assignment_21();
		assignment_21.maxCharFreq("aakanksha");
		assignment_21.maxCharFreq("teecccchnoceredites");
	}

}
