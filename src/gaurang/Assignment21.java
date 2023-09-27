package gaurang;

public class Assignment21 {
	
	int getCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (ch == input.charAt(index))
				count++;
		}
		return count;
	}
	void maxFreq(String input) { 
		int maxFreq = 0;
		char maxChar = ' ';
		for (int index = 0;index<input.length();index++) {
			char ch = input.charAt(index);
			int freq = getCharFreq(input, ch);
			if (maxFreq < freq) {
				maxFreq = freq;
				maxChar = ch;
			}
		}
		System.out.println(input + "->" + maxChar + "->" + maxFreq);
	}
	
	
	public static void main(String[] args) {
		Assignment21 e21 = new Assignment21();
		e21.maxFreq("aakansha");
		e21.maxFreq("teecccchnoceredites");
	}
}
