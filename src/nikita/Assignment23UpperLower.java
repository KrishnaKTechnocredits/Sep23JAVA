package nikita;

public class Assignment23UpperLower {

	int ucount,lcount,dcount,scount;

	void getUppercase(String input) {
		for(int i=0; i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i))){
				ucount++;
			}
			else if(Character.isLowerCase(input.charAt(i))) {
				lcount++;
			}
			else if(Character.isDigit(input.charAt(i))) {
				dcount++;
			}
			else
				scount++;
		}
		System.out.println("The uppercase letter count is :"+ucount);
		System.out.println("The lowercase letter count is :"+lcount);
		System.out.println("The digit count is :"+dcount);
		System.out.println("The count of special character is :"+scount);
	}

	public static void main(String[]args) {
		Assignment23UpperLower assignment23= new Assignment23UpperLower();
		assignment23.getUppercase("TecHNo_cR6ediTs");
	}
}
