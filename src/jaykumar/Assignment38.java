/*Assignment 38: 01st Oct 2023
WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0*/
package jaykumar;

public class Assignment38 {

	int sumDigits(String input) {
		boolean flag = false;
		int sum = 0;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				flag=true;
			}
		}
		if(flag==true) {
			for(int i=0; i<input.length(); i++) {
				char ch = input.charAt(i);
				if(Character.isDigit(ch)) {
					sum+=Character.getNumericValue(ch);
				}
			}
			System.out.println(input+" contain vowels, so sum is: ");
			return sum;
		}else {
			System.out.println(input+" does not contain vowels, so sum is: ");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		System.out.println(assignment38.sumDigits("Pu1ne5Ind3ia"));
		System.out.println(assignment38.sumDigits("R1hlTns7h"));
	}
}
