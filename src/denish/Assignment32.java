package denish;

public class Assignment32 {
	
	void printAllChar(String input) {
		
		int uppercase = 0;
		int lowercase = 0;
		int digit = 0;
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			int temp = ch;
			if(temp>=65 && temp<=90) {
				uppercase++;
			}else if(temp>=97 && temp<=122) {
				lowercase++;
			}else if(temp>=48 && temp<=57) {
				digit++;
			}
		}
		System.out.println("UpperCase -> "+uppercase);
		System.out.println("LowerCase -> "+lowercase);
		System.out.println("Digit -> "+digit);
	}
	
	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.printAllChar("TeCHNoc33r44editS");
	}
}
