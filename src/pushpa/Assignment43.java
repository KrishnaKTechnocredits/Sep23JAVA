package pushpa;

public class Assignment43 {
	String str1;
	String str2;
	
	void findSubString(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U'){
				int j = str.indexOf(ch);
				int k = str.lastIndexOf(ch);
				str1 = str.substring(0,j)+str.substring(k+1);
				str2 = str.substring(j,k+1);
				break;
			}
		}
		System.out.println(str1);
		System.out.println(str2);
	}
	
	void calculateDiff(String str) {
		findSubString(str);
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
		System.out.println("Inner string sum is: "+sum2);
		System.out.println("Outer string sum is: "+sum1);
		if(sum1>sum2) {
			System.out.println("Difference of sums is: "+(sum1-sum2));
		}else {
			System.out.println("Difference of sums is: "+(sum2-sum1));
		}
	}
	
	public static void main(String[] args) {
		Assignment43 assignment43 = new Assignment43();
		assignment43.calculateDiff("t1ec5ehno4e7credit983");
	}
}
