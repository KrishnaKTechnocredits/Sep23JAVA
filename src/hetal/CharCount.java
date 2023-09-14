package hetal;

public class CharCount {
	
	void printFrequencyOfGivenCharacter(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			
			if(input.charAt(index) == ch) {
			count++;	
			}
		}
		System.out.println("frequency of "+ch+" is " + count);
	}
	
	public static void main(String[] args) {
		CharCount charCount = new CharCount();
		charCount.printFrequencyOfGivenCharacter("technocredits",'e');
	}

}
