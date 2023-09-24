//Assingment - 29 : 18th Sep'2023
//Print the last non repeatative character using while loop.
//String str = "technocredits";
//output : s

package harshada;

public class LastNonRepChar {

	void printNonRepChar(String str) {
		
		while (str.length()>0) {
			int orgLen= str.length();
			String ch= String.valueOf(str.charAt(str.length()-1));
			str= str.replace(ch,"");
			int newLen=str.length();
			
			if(orgLen-newLen==1) {
				System.out.println(ch+"-->"+ (orgLen-newLen));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		LastNonRepChar lastNonRepChar= new LastNonRepChar();
		lastNonRepChar.printNonRepChar("technocredits");
	}
}