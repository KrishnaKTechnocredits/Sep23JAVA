package hetal;

public class Assignment28 {

	void printFirstNonRepeatChar(String input){
		while (input.length()>0){
			int orgLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch),"");
			int newLen = input.length();
			if(orgLen-newLen == 1){
				System.out.println("first non repetative characterin given input->" + ch);
				break;
			}
		}
	}
	public static void main(String[] args){
		Assignment28 assignment28 = new Assignment28();
		assignment28.printFirstNonRepeatChar("technocredits");
	}
}
