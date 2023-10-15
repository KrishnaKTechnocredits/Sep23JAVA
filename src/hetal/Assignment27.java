package hetal;

public class Assignment27 {

	void printFirstRepeatChar(String input){
		while (input.length()>0){
			int orgLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch),"");
			int newLen = input.length();
			if(orgLen-newLen > 1){
			System.out.println("first repetative character in given input->" + (orgLen-newLen));
			break;
			}
		}
	}
	public static void main(String[] args) {
		Assignment27 a = new Assignment27();
		a.printFirstRepeatChar("abcdcededffff");
	}

}
