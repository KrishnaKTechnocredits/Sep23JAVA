/* Assignment 43
WAP to calculate difference of outer sum-inner sum (1st repeating vowel 'e' to last same repeating vowel 'e'
 * input:t1ec5ehno4e7credit983
 * output:5
 */


package nivedita;

public class A43PrintDetails {
	  
	void printsum(String input,char ch) {
		int f = input.indexOf(ch);
		int l = input.lastIndexOf(ch);
		int sum1 = 0;
		int sum2 = 0;
		int difference;
		String output1 = input.substring(f,l);
		String output2 = input.substring(0,f)+input.substring(l);
			for(int index=0;index<output1.length();index++) {
				char sh = output1.charAt(index);
				if(Character.isDigit(sh)) {
					sum1 = sum1 + Character.getNumericValue(sh);
				}
			}
			System.out.println("sum of inner index is " +sum1);
			for(int index=0;index<output2.length();index++) {
				char hh = output2.charAt(index);
				if(Character.isDigit(hh)) {
					sum2 = sum2 + Character.getNumericValue(hh);
				}
			}
			System.out.println("Sum of the outer index is " +sum2);
			if(sum1>sum2) {
				difference = sum1-sum2;
			}
			else {
				difference = sum2-sum1;
			}
			System.out.println("The difference is " + difference);
	}
	public static void main(String[] args) {
		A43PrintDetails printDetails = new A43PrintDetails();
		printDetails.printsum("t1ec5ehno4e7credit983",'e');
	}

}
