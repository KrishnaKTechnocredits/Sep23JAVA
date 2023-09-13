package aditya;

public class CharFreq {
	
	void displayFrequncy(String input) {

		for(int index=0;index<input.length();index++) {
			int count=0;
			char ch= input.charAt(index);
			for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
				if(input.charAt(innerIndex)==ch) {
					count++;
				}							
			}
			System.out.println(input+ "-> " +ch+ ":- " +count);
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharFreq Ch =new CharFreq();
		String input="aakanskha";
		Ch.displayFrequncy(input);
		
	}
}
