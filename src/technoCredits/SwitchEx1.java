package technoCredits;

// int, string, enum
// int -> byte, short are allowed
// char is also allowed as it is represented by its ascii value which is int.
// not allowed : boolean, double, float, long

public class SwitchEx1 {

	void start(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launch Chrome");
		} else if (browser.equalsIgnoreCase("safari")) {
			System.out.println("Launch safari");
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Launch edge");
		} else {
			System.out.println("Invalid browser");
		}

		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("Launch chrome browser");
			break;

		default:
			System.out.println("Invalid browser");
			break;

		case "safari":
			System.out.println("Launch safari browser");
			break;

		case "edge":
			System.out.println("Launch edge browser");
			break;
		}
	}

	void processNumber(int num) {
		switch (num) {
		case 0:
			System.out.println("Not a positive not a negative number");
			break;

		case 1:
			System.out.println("positive number");
			break;

		case -1:
			System.out.println("Negative number");
		}
	}

	/*
	 * void processNumberCondition(int num) { switch (num) { case num>90 && num<100:
	 * System.out.println("A+"); break; } }
	 */

	void processBoolean(char ch) {
		switch (ch) {
		case 'a':
		case 'b':
			System.out.println("first char");
			break;

		case 'c':
		case 'd':	
			System.out.println("second char");
			break;

		case 'e':
			System.out.println("third char");
		}
	}

	void processShort(short s) {
		switch (s) {
		case 1:
			System.out.println("Not a positive not a negative number");
			break;

		case 2:
			System.out.println("positive number");
			break;

		case 3:
			System.out.println("Negative number");
		}
	}

	void processByte(byte s) {
		switch (s) {
		case 1:
			System.out.println("Not a positive not a negative number");
			break;

		case 2:
			System.out.println("positive number");
			break;

		case 3:
			System.out.println("Negative number");
		}
	}

	void processLong(long s) {
		switch ((int) s) {
		case 1:
			System.out.println("Not a positive not a negative number");
			break;

		case 2:
			System.out.println("positive number");
			break;

		case 3:
			System.out.println("Negative number");
		}
	}
	
	int testYourKnowledge(String name){
		switch(name){
			case "techno":
				return 10;
				
			case "credits":
				return 2+3;
				
			default:
				return -1;
		}
	}


	public static void main(String[] args) {
		int value = new SwitchEx1().testYourKnowledge("techno");
		System.out.println(value);
	}
}
