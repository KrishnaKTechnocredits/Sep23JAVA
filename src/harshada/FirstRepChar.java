//Assingment - 27 : 18th Sep'2023
//Print the freq of first repeatative character using while loop.
//String str = "abcdcededffff";
//output : c -> 2

package harshada;

public class FirstRepChar {
	
	void printFirstRepChar(String input) {
		
		while(input.length()>0) {
			int orgLen= input.length();
			char ch= input.charAt(0);
			input= input.replace(String.valueOf(ch),"");
			int newLen=input.length();
			
			if(orgLen-newLen>1) {
				System.out.println(ch+"-->"+ (orgLen-newLen));
				break;
			}
		}
	}

	public static void main(String[] args) {
		FirstRepChar firstRepChar=new FirstRepChar();
		firstRepChar.printFirstRepChar("abcdcededffff");
	}
}
