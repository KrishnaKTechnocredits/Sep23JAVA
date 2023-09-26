package aditya;
public class CharFreq {
	
	void printCharFreq(String input) {
		for(int index=0;index<input.length();index++) {
			int count = 0;
			char ch = input.charAt(index);
			
			if(ch != '*') {
				for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
					if(ch == input.charAt(innerIndex))
						count++;
				}
				System.out.println(ch + "-->" + count);
				input = input.replace(ch, '*');
			}
		}
	}
	
	public static void main(String[] args) {
		CharFreq charFreq = new CharFreq();
		charFreq.printCharFreq("aakanksha");
	}
}