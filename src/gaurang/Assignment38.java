/*WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0*/

package gaurang;

public class Assignment38 {

	int sumOfDigit(String input) {
		boolean flag;
		int sum = 0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				flag = true;
				break;
			}
		}
		if(flag=true) {
			for(int index=0;index<input.length();index++) {
				char ch = input.charAt(index);
				if(Character.isDigit(ch)) {
					int x = Character.getNumericValue(ch);
					sum = sum + x;
				}
			}
			
		}
		System.out.println("Sum of all Digit numbers in given input is "+sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment38 a = new Assignment38();
		a.sumOfDigit("Pu1ne5Ind3ia");
	}
	
}
