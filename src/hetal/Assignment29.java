package hetal;

public class Assignment29 {

	void printFirstNonRepeatChar(String input){
		while (input.length()>0){
			int orgLen = input.length();
			char ch = input.charAt(input.length()-1);
			input = input.replace(String.valueOf(ch),"");
			int newLen = input.length();
			if(orgLen-newLen == 1){
				System.out.println("last non repetataive character in given input->" + ch);
				break;
			}
		}
	}
	public static void main(String[] args){
		Assignment29 assignment29 = new Assignment29();
		assignment29.printFirstNonRepeatChar("technocredits");
	}
}
