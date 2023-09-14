package nikita;

public class Assignment19Char {

	int count;
	char charAt;
	
	void frequencyOfChar(String input) {
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i)=='t') {
				count++;				
			}			
		}
		
		System.out.println("The frequency for the given character is :"+count);		
	}
	
	void reverseString(String input) {
		for(int i=input.length()-1;i>=0;i--) {
			System.out.println(input.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		Assignment19Char assignment19= new Assignment19Char();
		assignment19.frequencyOfChar("technocredits");
		assignment19.reverseString("technocredits");		
	}	
}
