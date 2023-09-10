package denish;

public class Assignment19 {
	
	void printLength(String input) {
		
		for(int index=input.length()-1;index>=0;index--) {
			System.out.println(index+ "->"+input.charAt(index));
		
	}
}
	void process(String input){
		int count=0;
		char ch='t';
		
		for(int index=input.length()-1; index>=0; index--) {
			if(input.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("Frequency of 't' is "+count);
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.printLength("techno");
		assignment19.process("technocredits");
		}
}