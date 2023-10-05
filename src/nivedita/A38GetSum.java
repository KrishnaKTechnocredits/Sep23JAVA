/* Assignment 38
 WAP to get the sum of digits in string only if there are any vowels in the string input:Pu1ne5ind3ia__1+5+3=9 input:R1hlTns7h__0
*/

package nivedita;

public class A38GetSum {
	
	int printSum(String input) {
		int sum = 0;
		boolean flag = false;
		for(int index = 0 ; index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				flag = true;
			}
		}
		if(flag==true) {
			for(int index = 0 ; index<input.length();index++) {
				char ch = input.charAt(index);
				if(Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		A38GetSum getSum = new A38GetSum();
		getSum.printSum("Pu1ne5ind3ia");
		getSum.printSum("R1hlTns7h");
	}
}
