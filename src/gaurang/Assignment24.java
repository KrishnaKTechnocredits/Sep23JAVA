package gaurang;

public class Assignment24 {

	void sumNumeric(String input) {
		int sum = 0;
		for(int index = 0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				int x = Character.getNumericValue(ch);
				sum = sum + x;
			}
		}
		System.out.println("Sum of all digits in given input "+sum);
	}
	
	public static void main(String[] args) {
		Assignment24 a = new Assignment24();
		a.sumNumeric("Rah5ulTEC6Hnoc2redItS");
	}
}
