/*Assignment 43: 01-Oct-23 WAP to calculate difference of outer sum (t1+dit983) 
- inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983 
Output: Inner sum: e->e : 5+4+7 = 16 Outer sum: t1+dit983 : 1+9+8+3 = 21*/
package swati;

public class Ass43DiffOfOuterSumToInnerSum {
	String outerstring = "";
	String innerstring = "";

	void populateInnerAndOutString(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int firstindex = input.indexOf(ch);
				int lastindex = input.lastIndexOf(ch);
				outerstring = input.substring(0, firstindex) + input.substring(lastindex);
				innerstring = input.substring(firstindex, lastindex);
				System.out.println(outerstring);
				System.out.println(innerstring);
				break;
			}
		}
	}

	int calculateSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
			sum = sum + Character.getNumericValue(ch);
		}
		System.out.println(input+" ->"+sum);
		return sum;
	}

	public static void main(String[] args) {
		int diff = 0;
		Ass43DiffOfOuterSumToInnerSum ass43 = new Ass43DiffOfOuterSumToInnerSum();
		ass43.populateInnerAndOutString("t1ec5ehno4e7credit983");
		int outersum = ass43.calculateSum(ass43.outerstring);
		int innersum = ass43.calculateSum(ass43.innerstring);
		if(outersum>innersum) {
			diff = outersum - innersum;
		}else {
			diff = innersum - outersum;
		}
		System.out.println("Diff between outerstring and innerstring is -> "+diff);	
	}
}
