//*Using scanner class, print digit sum of each name.

//*input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
//*output :  Say2al1i -> 3
         //* Ad9it5ya -> 14
		 //* Shr4utik2a -> 6
		 //* Saks4hi -> 4
		  
package hetal;
import java.util.Scanner;

public class Assignment60 {
	int getDigitSum(String str) {
		int sum = 0;
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	void printDigitSumFromArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index] + "-->" + getDigitSum(arr[index]));
		}
	}
	public static void main(String[] args) {
		Assignment60 a = new Assignment60();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String name = sc.nextLine();
		String[] arr = name.split(" ");
		a.printDigitSumFromArray(arr);
		
	}

}
