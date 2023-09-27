/*
Program 2 : W1rite a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS

String getOutput(String input){

}*/
package mayank;

public class Mayank_ProgrammingTest2 {
			public String getoutput(String str) {
			String upper = "", lower = "";
			int digitSum = 0;
			
			
			for (int index = 0; index < str.length(); index++) {
				if (Character.isDigit(str.charAt(index)))
					digitSum += Character.getNumericValue(str.charAt(index));
			else if (Character.isUpperCase(str.charAt(index)))
				upper += str.charAt(index);
			else if (Character.isLowerCase(str.charAt(index)))
				lower += str.charAt(index);
			}
			return digitSum + lower + upper;
		}
			
		public static void main(String[] args) {
			Mayank_ProgrammingTest2 test = new Mayank_ProgrammingTest2();
			String result = test.getoutput("TeCHNoc33r44editS");
			System.out.println("output; " + result);

		}
}
