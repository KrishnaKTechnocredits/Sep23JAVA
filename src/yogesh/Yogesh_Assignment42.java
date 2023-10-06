//Assignment 42: 01-Oct-23
//WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
//Input: t1ecehnoecredit983
//Output: 1+9+8+3 = 21

package yogesh;

public class Yogesh_Assignment42 {

	void test(String input) {
		String output="";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int firstindex = input.indexOf(ch);
				int lastindex = input.lastIndexOf(ch)+1;
				output = input.substring(firstindex, lastindex);
				break;
			}
			
		}
		System.out.println("Substring is: "+output);
		
	}
void sum(String input) {
	test(input);
	int sum=0;
	for (int index = 0; index < input.length(); index++) {
		char ch = input.charAt(index);
		if(Character.isDigit(ch))
		sum=sum+Character.getNumericValue(ch);
	}
	System.out.println("Sum is :"+sum);
	
	
}
	
	public static void main(String[] args) {
		Yogesh_Assignment42 assignment42 = new Yogesh_Assignment42();
		assignment42.sum("t1ecehnoecredit983");
	}
}
