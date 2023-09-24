package naresh;

public class Assignment34 {
	
	
	String m1(String input) {
		int digits=0 ;

		String upper = "";
		String lower = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digits =digits+Character.getNumericValue(ch);

			} else if (Character.isLowerCase(ch)) {
				lower = lower + ch;
			} else if (Character.isUpperCase(ch)) {
				upper = upper + ch;
			}
		}
		String output = digits + lower + upper;
		return output;
	}

	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		System.out.println(assignment34.m1("TeCHNoc33r44editS"));

	}
}


