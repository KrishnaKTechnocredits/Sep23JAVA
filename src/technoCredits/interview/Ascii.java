package technoCredits.interview;

public class Ascii {
	private static int temp;
	private void printCharToAscii(char ch) {
		temp = ch;
		System.out.println(ch + "->" + temp);
	}

	void printAsciiToChar(int num) {
		char ch = (char) num;
		System.out.println(num + "->" + ch); //
	}

	void printAscillForAllUppercase() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			printCharToAscii(ch);
		}
	}

	void printCountOfUpperCase(String input) {
		int uCount=0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch>=65 && ch<=90) {
				uCount++;
			}
		}
		System.out.println(input + "->" + uCount);
	}
	
	
	public static void main(String[] args) {
		Ascii ascii = new Ascii();
		// ascii.printCharToAscii('}'); //122
		// ascii.printAsciiToChar(122); // z
		ascii.printAscillForAllUppercase();
	}
}
