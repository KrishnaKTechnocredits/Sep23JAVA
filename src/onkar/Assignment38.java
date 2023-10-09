/*WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0*/

package onkar;

public class Assignment38 {
	
	void addNum (String input) {
		int sum = 0;
		if(input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
			for (int index=0; index<input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch))
					sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		assignment38.addNum("Pu1ne5Ind3ia");
		assignment38.addNum("R1hlTns7h");
	}
}
