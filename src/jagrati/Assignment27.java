package jagrati;

public class Assignment27 {
	void firstRepeatative(String input) {
		while(input.length()>0) {
			int orgLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int newLenth = input.length();
			if((orgLength-newLenth)>1){
				System.out.println("Character "+ ch + " is the first repeatative character and its frequecy is " + (orgLength-newLenth));
				break;
			}
		}
	}
 public static void main(String[] args) {
	 Assignment27 assign = new Assignment27();
	 assign.firstRepeatative("abcdcededffff");
	 
	
}
}
