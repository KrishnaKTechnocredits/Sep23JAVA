/*Assignment-31 : 23nd Sep'2023 
Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS*/

package jaykumar;

public class Assignment31 {

		String upperCaseAscii(String input) {
			String output = "";
			for(int index=0; index<input.length(); index++) {
				char ch = input.charAt(index);
				int temp = ch;
				if(temp>=65 && temp<=90) {
					output = output+ch;
				}
			}
			return output;
		}
		
		public static void main(String[] args) {
			Assignment31 assignment31 = new Assignment31();
			String output = assignment31.upperCaseAscii("TeCHNocreditS");
			System.out.println(output);
		}
}
