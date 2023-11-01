/*WAP to return reverse number without converting it to String.

input : 123
output : 321*/

package onkar;

public class Assignment66 {
	
	void reverseNum (int num) {
		int temp = num;
		int reverseNum = 0;
		while(num>0) {
			int lastDigit = num%10;
			reverseNum = reverseNum*10 + lastDigit;
			num /= 10;
		}
		System.out.println("Original Number : "+temp);
		System.out.println("Reversed number : "+reverseNum);
	}
	
	public static void main(String[] args) {
		new Assignment66().reverseNum(123);
	}
}
