package hetal;

public class Assignment23 {
	
	void charCase(String input) {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for(int index=0;index<input.length();index++) {
			if (Character.isUpperCase(input.charAt(index))){
				count1++;
			}
			else if(Character.isLowerCase(input.charAt(index))){
				count2++;
			}
			else if(Character.isDigit(input.charAt(index))){
				count3++;
			}
			else {
				count4++;
			}		
		}
		System.out.println("Uppercase in given input is "+ count1);
		System.out.println("Lowercase in given input is "+ count2);
		System.out.println("Digit in given input is "+ count3);
		System.out.println("Special Character in given input is "+ count4);
	}
	
	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.charCase("TecHNo_cR6ediTs");
	}
}

