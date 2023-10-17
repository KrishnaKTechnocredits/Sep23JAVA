/*Assignment 38: 01st Oct 2023
WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0
*/

package roshani;

public class Ass38SumDigitsIfVowels {

	int addNum(String input) {
		boolean flag = false;
		int sum = 0;
		
		for (int index=0; index < input.length(); index++){
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				flag = true;
			}
		}
		if(flag == true){
			for (int index=0; index < input.length(); index++){
				char ch = input.charAt(index);
				if(Character.isDigit(ch)){
					sum = sum + Character.getNumericValue(ch);
				}
			}
			System.out.print("'" +input + "' is having vowels, so sum is: ");
			return sum;
		}else{
			System.out.print("'" +input + "' is not having vowels, so sum is: ");
			return 0; 
		}
	}

	public static void main(String[] args) {
		Ass38SumDigitsIfVowels assignment38 = new Ass38SumDigitsIfVowels();
		System.out.println(assignment38.addNum("Pu1ne5Ind3ia"));
		System.out.println(assignment38.addNum("R1hlTns7h"));
	}
}