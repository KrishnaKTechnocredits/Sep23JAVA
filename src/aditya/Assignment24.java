package aditya;
//Write a program to print sum of all the digits within given input.

//String str = "Rah5ulTEC6Hnoc2redItS";

class Assignment24 {

	void display(String input) {
		int count = 0;
		int num = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				count++;
				num = num + Character.getNumericValue(input.charAt(index));
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		Assignment24 as24 = new Assignment24();
		as24.display("Rah5ulTEC6Hnoc2redItS");
	}
}