package naresh;


public class Assignment25 {
	
	void printCharFreq(String input) {
		for(;input.length()!=0;) {
			int count = 0;
			char ch = input.charAt(0);
			
			
				for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
					if(ch == input.charAt(innerIndex))
						count++;
				}
				
				
				System.out.println(ch + "-->" + count);
				input = input.replace(String.valueOf(ch),"");
			
		}
	}
	
	public static void main(String[] args) {
		Assignment25 charFreq = new Assignment25();
		charFreq.printCharFreq("aakanksha");
	}
}

































































