/*Assignment - 60 : 21st Oct'2023

Using scanner class, print digit sum of each name.

input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output :  Say2al1i -> 3
          Ad9it5ya -> 14
		  Shr4utik2a -> 6
		  Saks4hi -> 4*/

package gaurang;
import java.util.Scanner;

public class Assignment60 {

	int printSum(String input) {
		int sum = 0;
		for(int index = 0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	void getSum(String[] input) {
		for(int index = 0 ; index<input.length ; index++) {
			String x = input[index];
			int sum = printSum(x);
			System.out.println(x+" --> "+sum);
		}
	}
	
	public static void main(String[] args) {
		Assignment60 a = new Assignment60();
		Scanner sc = new Scanner(System.in);
		System.out.println("give input : ");
		String input = sc.nextLine();
		String[] str = input.split(" ");
		a.getSum(str);
		sc.close();
	}
}
