/*Assignment-31 : 23nd Sep'2023 
Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS
*/

package mayank;

public class Assignment31 {

	void upperCaseAscci(String input) {
		for (int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int temp=ch;
				if (temp>=65 && temp<=90) {
				System.out.println(ch);
				
			}
		}
		
	}
	public static void main(String[] args) {
		Assignment31 assignment31 =new Assignment31();
		assignment31.upperCaseAscci("TeCHNocreditS");
	}
}
