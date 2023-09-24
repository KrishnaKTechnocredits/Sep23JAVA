package gaurang;

public class Test1 {
	
	void reverseString(String input) {
		String upper1 = "" ;
		String lower1 = "";
		String digit1 = "";
		for(int index = 0; index < input.length();index++) {
			if(Character.isUpperCase(input.charAt(index))) {
				char upper =  input.charAt(index);
				upper1 = upper1+ upper;
			}
			else if(Character.isLowerCase(input.charAt(index))) {
				char lower = input.charAt(index);
				lower1 = lower1 + lower;
			}
			else {
				char digit = input.charAt(index);
				digit1 = digit1+ digit;
			}
		}
		System.out.println(digit1+lower1+upper1);
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.reverseString("TeCHNoc33r44editS");
	}

}
