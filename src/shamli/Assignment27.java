/*Assingment - 27 : 18th Sep'2023
Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2*/


package shamli;

public class Assignment27 {
	
	void printFirstRepCharFreq(String input) {
		while(input.length()!=0) {
			int originalLength=input.length();
			char ch=input.charAt(0);
			input=input.replace(String.valueOf(ch), "");
			int newLength=input.length();
			int count=originalLength-newLength;
			if(count>1) {
				System.out.println(ch+"-> "+count);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment27 assignment27=new Assignment27();
		assignment27.printFirstRepCharFreq("abcdcededffff");
	}
}
