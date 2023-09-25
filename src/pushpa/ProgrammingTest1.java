//Write a program to rearrange string as per below example.
//
//String input = "TeCHNoc33r44editS";
//output : 3344eocreditTCHNS

package pushpa;

public class ProgrammingTest1 {

	public String getOutput(String str) {
		String digits = "", upper = "", lower = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				digits += str.charAt(i);
			else if (Character.isUpperCase(str.charAt(i)))
				upper += str.charAt(i);
			else if (Character.isLowerCase(str.charAt(i)))
				lower += str.charAt(i);
		}
		return digits + lower + upper;
	}

	public static void main(String[] args) {
		ProgrammingTest1 programmingTest1 = new ProgrammingTest1();
		String result = programmingTest1.getOutput("TeCHNoc33r44editS");
		System.out.println("output : "+result);
	}

}
