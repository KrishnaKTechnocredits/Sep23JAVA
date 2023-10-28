/*Assignment-66 : 28th Oct'2023
WAP to return reverse number without converting it to String.
input : 123
output : 321*/

package jaykumar;

public class Assignment66 {
	
	int reverseNumber(int num) {
		int output = 0;
		while(num != 0) {
			int rem = num%10;
			output = output*10 + rem;
			num = num/10;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment66 assignment66 = new Assignment66();
		int input = 123;
		System.out.println("Reverse number of "+input+" is "+assignment66.reverseNumber(123));
	}
}
;