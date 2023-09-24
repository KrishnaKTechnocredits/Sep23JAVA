package hetal;

public class Hetal_Assignment21 {
	
	char printMaxFreqCharacter(String input) {
		int maxFreq = 0;
		char maxChar = ' ';
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int freq = 0;
			for(int innerindex = 0; innerindex<input.length();innerindex++) {
				if(input.charAt(innerindex)==ch) {
					freq++;
				}
			}
			if(maxFreq < freq) {
				maxFreq = freq;
				maxChar = ch;
			}
			
		}
		System.out.println(maxChar + "--" + maxFreq);
		return maxChar;
	}
	
	public static void main(String[] args) {
		Hetal_Assignment21 hetal_Assignment21 = new Hetal_Assignment21();
		hetal_Assignment21.printMaxFreqCharacter("teecccchnoceredites");
		hetal_Assignment21.printMaxFreqCharacter("aakanksha");
		
	}

}
