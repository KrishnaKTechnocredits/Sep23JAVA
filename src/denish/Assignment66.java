/*Assignment-66 : 28th Oct'2023
WAP to return reverse number without converting it to String.

input : 123
output : 321*/
package denish;

public class Assignment66 {

	int reverseNum(int num) {
		int output = 0;
		while (num != 0) {
			int a = num % 10;
			output = output * 10 + a;
			num = num / 10;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment66 ass = new Assignment66();
		int output = ass.reverseNum(123);
		System.out.println("Output from given number is-> " + output);
	}
}
