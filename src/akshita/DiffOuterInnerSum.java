//WAP to calculate difference of outer sum(t1dit983) and inner sum of (1st and last repeating vowels)
//t1ec5ehno4e7credit983
//Inner sum=5=4=7=16  & Outer sum =1=9=8=3=21 & diff= 5

package akshita;

public class DiffOuterInnerSum {
	String str="",str1="",vowel1="",str2="";
	int sum=0,sum1=0,sum2=0;
	String newString(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch =='u') {
				str1 = str1 + input.substring(input.indexOf(ch), input.lastIndexOf(ch)+1);
				break;
			}
			else {
				vowel1 = vowel1 + ch;
			}
		}
		for(int index1=0;index1<input.length();index1++) {
			char ch = input.charAt(index1);
			if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch =='u') {
				str2 = str2 + input.substring(input.lastIndexOf(ch));
				break;
			}
		}
		str= vowel1 + str2;
		System.out.println("Inner String : "+ str1);
		System.out.println("Outer String : " + str);
		return str;
	}
	
	void sum() {
		
	}
	void display(String userInput) {
		newString(userInput);
		for (int index2 = 0; index2 < str1.length(); index2++) {

			char ch1 = str1.charAt(index2);
			if (Character.isDigit(ch1)) {
				sum1 = sum1 + Character.getNumericValue(ch1);
			}
		}
		System.out.println("Inner Sum : " + sum1);
		
		for (int index2 = 0; index2 < str.length(); index2++) {

			char ch1 = str.charAt(index2);
			if (Character.isDigit(ch1)) {
				sum2 = sum2 + Character.getNumericValue(ch1);
			}
		}
		System.out.println("Outer Sum : " + sum2);
		diff();
	}
	
	void diff() {
		int diff=0;
		if(sum1>sum2) {
			sum= sum1-sum2;
		}
		else {
			sum=sum2-sum1;
		}
		System.out.println("Difference between Ineer and Outer : " + sum);
	}
	
	public static void main(String[] args) {
		DiffOuterInnerSum diff = new DiffOuterInnerSum();	
		String v1 = "t1ec5ehno4e7credit983";
		System.out.println("Input : " + v1);
		diff.display(v1);
	}

}
