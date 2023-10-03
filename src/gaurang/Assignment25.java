package gaurang;

public class Assignment25 {

	void printFreq(String input) {
		for(int index = 0 ; index<input.length();index++) {
			char ch = input.charAt(index);
			int count = 0;
			for(int innerindex=0;innerindex<input.length();innerindex++) {
				if(input.charAt(innerindex)==ch) {
					count++;
				}
			}
			
			System.out.println("Frequency of "+ch+" is "+count);
		}
	}
	
	public static void main(String[] args) {
		Assignment25 a = new Assignment25();
		a.printFreq("aakansha");
	}
}
