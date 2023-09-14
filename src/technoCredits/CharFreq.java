package technoCredits;

public class CharFreq {
	int max = 10;
	String name = "techno";
	
	void charFreqFromGivenInput(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int count = 0;
			for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
				if(input.charAt(innerIndex) == ch) {
					count++;
				}
			}
			System.out.println(ch + "->" + count);
		}
	}
	
	public static void main(String[] args) {
		//Reference variable
		//Reference type
		CharFreq charFreq = new CharFreq();
		String input = "aakanksha";
		charFreq.charFreqFromGivenInput(input);
	}
}
