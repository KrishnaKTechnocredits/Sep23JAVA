//Write a program to find count of Uppercase, lowercase, digits and special characters.

package subramanian;

public class Assignment23 {
	void findCharCase(String input) {
		int ucount=0;
		int lcount=0;
		int dcount=0;
		int special=0;
		for(int index=0; index<input.length();index++) {
			if(Character.isUpperCase(input.charAt(index))){
				ucount++;
			}
			else if (Character.isLowerCase(input.charAt(index))){
				lcount++;
			}
			else if (Character.isDigit(input.charAt(index))){
				dcount++;
			}
			else
				special++;
		}
		System.out.println("Upper Case count for :" +input+ "is "+ucount );
		System.out.println("Lower Case count for :" +input+ "is "+lcount );
		System.out.println("Digit count for :" +input+ "is "+dcount );
		System.out.println("Special Character count for :" +input+ "is "+special );
		
		
	}
		
	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.findCharCase("TecHNo_cR6ediTs");
		System.out.println("===============================");
		assignment23.findCharCase("AbdbFF1231&%*dssf");

	}

}
