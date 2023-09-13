package pushpa;
public class MaxFrequencyChar {
	
	public int getCharFrequency(String str, char ch) {
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch)	
				count++;
		}
		return count;	
	}
	
	public void printMaxFreqChar(String str){
		char maxChar = ' ';
		int maxFreqCount = 0 ;
		for (int i = 0; i < str.length(); i++) {
			int freq = getCharFrequency(str, str.charAt(i));
			if(maxFreqCount < freq) {
				maxFreqCount = freq;
				maxChar = str.charAt(i);
			}
		}
		System.out.println(str + " -> " + maxChar + " -> " + maxFreqCount);
	}
	
	public static void main(String[] args) {
		MaxFrequencyChar maxFrequencyChar = new MaxFrequencyChar();
		maxFrequencyChar.printMaxFreqChar("teecccchnoceredites");
	}

}
