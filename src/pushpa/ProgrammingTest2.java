// Write a program to rearrange string as per below example.
//String input = "TeCHNoc33r44editS";
//output : 14eocreditTCHNS

package pushpa;

public class ProgrammingTest2 {
	public String getOutput(String str) {
		String upper = "", lower = "";
		int digitsSum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				digitsSum += Character.getNumericValue(str.charAt(i));
			else if (Character.isUpperCase(str.charAt(i)))
				upper += str.charAt(i);
			else if (Character.isLowerCase(str.charAt(i)))
				lower += str.charAt(i);
		}
		return digitsSum + lower + upper;
	}

	public static void main(String[] args) {
		ProgrammingTest2 programmingTest2 = new ProgrammingTest2();
		String result = programmingTest2.getOutput("TeCHNoc33r44editS");
		System.out.println("output : " + result);
	}

}
