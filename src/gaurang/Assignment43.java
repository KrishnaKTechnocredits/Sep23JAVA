/*WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21*/

package gaurang;

public class Assignment43 {

	void getDiff(String input,char ch) {
		int initial = input.indexOf(ch);
		int last = input.lastIndexOf(ch);
		String update1 = input.substring(initial, last);
		String update2 = input.substring(0, initial) + input.substring(last);
		int sum1 = 0;
		int sum2 = 0;
		for (int index = 0 ; index<update1.length();index++) {
			char c1 = update1.charAt(index);
			if(Character.isDigit(c1)) {
				sum1 = sum1 + Character.getNumericValue(c1);
			}
		}
		for (int index = 0 ; index<update2.length();index++) {
			char c2 = update2.charAt(index);
			if(Character.isDigit(c2)) {
				sum2 = sum2 + Character.getNumericValue(c2);
			}
		}
		int total = sum2 - sum1;
		System.out.println("Total answer after all operation is "+total);
		
	}
	
	public static void main(String[] args) {
		Assignment43 a = new Assignment43();
		a.getDiff("t1ec5ehno4e7credit983",'e');
	}
}
