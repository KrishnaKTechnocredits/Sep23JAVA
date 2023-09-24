//Assingment - 28 : 18th Sep'2023
//Print the first non repeatative character using while loop.
//String str = "technocredits";
//output : h

package harshada;

public class FirstNonRepChar {

	void printNonRepChar(String str) {
		
		while (str.length()>0) {
			int orgLen= str.length();
			String ch= String.valueOf(str.charAt(0));
			str= str.replace(ch,"");
			int newLen=str.length();
			
			if(orgLen-newLen==1) {
				System.out.println(ch+"-->"+ (orgLen-newLen));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FirstNonRepChar firstNonRepChar= new FirstNonRepChar();
		firstNonRepChar.printNonRepChar("technocredits");
	}
}
