/*Program 1 : Write a program to rearrange string as per below example.
String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

Program 2 : Write a program to rearrange string as per below example.
String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS
*/

package mahesh;

public class ProgramTest1 {
	String output1="";
	String output2="";
	String output3="";
	int Sum =0;
	
	void reArrange(String input) {
				
		for(int index=0;index<input.length();index++) {
			char ch= input.charAt(index);
			
			if(Character.isDigit(ch)){
				output1=output1+ch;
			}
			else if(Character.isLowerCase(ch)) {
				output2=output2+ch;
			}
			else if(Character.isUpperCase(ch)) {
				output3=output3+ch;
			}			
			
		}
		System.out.println("Expected Output is : " +(output1+output2+output3));
		
	}
	
	void reArrangeSum(String input) {
				
		for(int index=0;index<input.length();index++) {
			char ch= input.charAt(index);
			
			if(Character.isDigit(ch)){
				Sum=Sum+Character.getNumericValue(ch);
			}
			else if(Character.isLowerCase(ch)) {
				output2=output2+ch;
			}
			else if(Character.isUpperCase(ch)) {
				output3=output3+ch;
			}			
			
		}
		System.out.println("Expected Output is : " +(Sum+output2+output3));
	
	}
	

	public static void main(String[] args) {
		ProgramTest1 programtest1= new ProgramTest1();
		programtest1.reArrange("TeCHNoc33r44editS");
		ProgramTest1 programtest2=new ProgramTest1();
		programtest2.reArrangeSum("TeCHNoc33r44editS");
	}

}
