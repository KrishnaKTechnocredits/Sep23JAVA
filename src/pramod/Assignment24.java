package pramod;



public class Assignment24 {
	void getDigitSum(String input) {
		System.out.println("Input String: " + input);
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int charNum = Character.getNumericValue(ch);
				sum = sum + charNum;
			}
		}
		System.out.println("Sum of Digits in the given string is: " + sum);
	}

	void getAllCharCount(String input) {
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch))
				uCount++;
			else if (Character.isLowerCase(ch))
				lCount++;
			else if (Character.isDigit(ch))
				dCount++;
		}
		System.out.println("Different types of Character Count in the given String: ");
		System.out.println("UpperCase Count -> " + uCount);
		System.out.println("LowerCase Count -> " + lCount);
		System.out.println("Digits Count -> " + dCount);
	}

	public static void main(String[] args) {
		Assignment24 charCount = new Assignment24();
		charCount.getDigitSum("Rah5ulTEC6Hnoc2redItS");
		charCount.getAllCharCount("Rah5ulTEC6Hnoc2redItS");
	}
}

