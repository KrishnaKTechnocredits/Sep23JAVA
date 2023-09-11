package aditya;

public class LengthOfStr {
	
	void printLengthOfString(String Input) {
		System.out.println("Lenth of string:- " +Input.length());
		System.out.println("character at 0th position:- " +Input.charAt(0));
		for(int index=0; index<Input.length();index++) {
			System.out.println(index+ ":- " +Input.charAt(index));
		}
	}
	
	void printLengthOfStringReverse(String Input) {
		for(int index=Input.length()-1;index>=0;index--) {
			System.out.println("Reverse String with Index " +index+ ":- " +Input.charAt(index));
		}
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		LengthOfStr string =new LengthOfStr();
		string.printLengthOfString("MagicSoftware");
		string.printLengthOfStringReverse("aditya");

	}

}
