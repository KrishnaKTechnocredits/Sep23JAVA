//WAP to print Uppercase,Lowercase  and Digit from given input "TeCHNoc33r44editS"
//Output:Uppercase->5,Lowercase->8,Digit->4

package akshita;

public class UcLcDigitASCII {
	
	void returnULD(String input) {
		int upperCase=0;
		int lowerCase=0;
		int digit =0;
			for(int index=0;index<input.length();index++) {
				char ch =input.charAt(index);
					if(ch>=48 && ch<=57) {
						digit++;
					}
					else if(ch>=65 && ch<=90) {
						upperCase++;
					}
					else if(ch>=97 && ch<=122){
						lowerCase++;
					}
			}
			System.out.println("Uppaercase : " + upperCase);
			System.out.println("Lowercase  : " + lowerCase);
			System.out.println("Digit      : " + digit);
	}

	public static void main(String[] args) {
		UcLcDigitASCII ucLcDigitASCII = new UcLcDigitASCII();
		
		System.out.println("Uppercase,Lowercase  and Digit from given input");
		String var = "TeCHNoc33r44editS";
		System.out.println("Input: " + var);
		
		ucLcDigitASCII.returnULD(var);
	}

}
