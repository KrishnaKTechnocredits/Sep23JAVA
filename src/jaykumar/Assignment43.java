/*WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21*/

package jaykumar;

public class Assignment43 {
	String str1;
	String str2;
	
	void processString(String input) {
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				int j = input.indexOf(ch);
				int k = input.lastIndexOf(ch);
				str1 = input.substring(0,j)+input.substring(k+1);
				str2 = input.substring(j,k+1);
				break;
			}
		}
		System.out.println(str1);
		System.out.println(str2);
	}
	
	void diff(String input) {
		processString(input);
		int sum1=0;
		int sum2=0;
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(Character.isDigit(ch)) {
				sum1 += Character.getNumericValue(ch);
			}
		}
		for(int j=0; j<str2.length(); j++) {
			char ch = str2.charAt(j);
			if(Character.isDigit(ch)) {
				sum2 += Character.getNumericValue(ch);
			}
		}
		System.out.println("Inner string sum is:"+sum2);
		System.out.println("Outer string sum is: "+sum1);
		if(sum1>sum2) {
			System.out.println("Difference of sums is: "+(sum1-sum2));
		}else {
			System.out.println("Difference of sums is: "+(sum2-sum1));
		}
	}
	
	public static void main(String[] args) {
		Assignment43 assignment43 = new Assignment43();
		assignment43.diff("t1ec5ehno4e7credit983");
	}
}
