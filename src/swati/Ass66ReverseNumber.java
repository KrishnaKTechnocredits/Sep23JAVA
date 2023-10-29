/*Assignment-66 : 28th Oct'2023
WAP to return reverse number without converting it to String.
input : 123
output : 321*/
package swati;

public class Ass66ReverseNumber {
	static int input = 123;

	void reverseNumber(int numb) {
		int output = 0;
		while (numb != 0) {
			int temp = numb % 10;
			output = output * 10 + temp;
			numb = numb / 10;
		}
		System.out.println("Reverse Number of given input "+input+" is -> "+output);
	}

	public static void main(String[] args) {
		Ass66ReverseNumber ass66 = new Ass66ReverseNumber();
		ass66.reverseNumber(input);
	}
}
