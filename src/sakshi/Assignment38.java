//Assignment 38: 01st Oct 2023
//WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
//String str = "Pu1ne5Ind3ia";
//output : 1+5+3 = 9
//String str = "R1hlTns7h";
//output : 0
package sakshi;

public class Assignment38{

	int printSum(String input){
		boolean flag = false;
		int sum = 0;
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u'){
				flag = true;
			}
			if(Character.isDigit(ch)){
				sum = sum + Character.getNumericValue(ch);
			}
		}
		
		if(flag == true){
			return sum;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[] args){
		Assignment38 assignment38 = new Assignment38();
		Assignment38 assignment38_1 = new Assignment38();
		String str = "Pu1ne5Ind3ia";
		int sum1 = assignment38.printSum(str);
		System.out.println(sum1);
		String str1 = "R1hlTns7h";
		int sum2 = assignment38_1.printSum(str1);
		System.out.println(sum2);
	}
}