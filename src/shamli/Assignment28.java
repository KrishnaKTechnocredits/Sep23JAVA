package shamli;


public class Assignment28 {

	void firstNonRepChar(String input) {
		
		System.out.println("Input String is :"+input);
		while(input.length()!=0) {
			int orginalLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int newLength = input.length();
			int count = orginalLength-newLength;
			if(count==1) {
				System.out.println("First non repetative char from string is :"+ch);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.firstNonRepChar("technocredits");

	}

}
