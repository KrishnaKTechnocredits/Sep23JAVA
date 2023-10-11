/*
 * Assignment 38: 01st Oct 2023
WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0
 */

package shamli;

public class Assignment38 {
	
	int sumOfDigits(String input) {
		int sum=0;
		boolean flag=false;
		
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				flag=true;
			}
			
		}
			if(flag==true) {
				for(int index=0;index<input.length();index++) {
					char ch=input.charAt(index);
					if(Character.isDigit(ch)) {
						sum=sum+Character.getNumericValue(ch);
					}
				}
				System.out.print(input+" contains vowels, so sum digits is :");
				return sum;
		}else {
			System.out.print(input+" contains no vowels, so sum of digits is :");
			return 0;
		}
	}

	public static void main(String[] args) {
		Assignment38 assignment38=new Assignment38();
		System.out.println(assignment38.sumOfDigits("Pu1ne5Ind3ia"));
		System.out.println(assignment38.sumOfDigits("R1hlTns7h"));
		System.out.println(assignment38.sumOfDigits("R1hlTnEs7h"));
		
	}

}
