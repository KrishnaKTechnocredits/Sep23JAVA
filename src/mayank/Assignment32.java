//Write a method to print number of Uppercase,lowercase and digits in the input using ascii.
//	
//	input : "TeCHNoc33r44editS";
//	output : Uppercase -> 5
//	         Lowercase -> 8
//			 Digit -> 4
package mayank;

public class Assignment32 {
	void allCharacUsingAscci(String input) {
		int ucount=0;
		int lcount=0;
		int dcount=0;
		int scount=0;
		for (int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int temp=ch;
			int temp1=ch;
			int temp2=ch;
				if (temp>=65 && temp<=90) {
					ucount++;
				}
				else if (temp1>=97 && temp1<=122) {
					lcount++;
				}
				else if (temp2>=48 && temp2<=57) {
					dcount++;
				}
				else 
					
					scount++;
				}
		System.out.println("UpperCase -> " +ucount);
		System.out.println("lowercase -> " +lcount);
		System.out.println("Digit -> " +dcount);
		System.out.println("Specialchar -> " +scount);
	}
	public static void main(String[] args) {
		Assignment32 assignment32 =new Assignment32();
		assignment32.allCharacUsingAscci("TeCHNoc33r44editS");
	}
}


