package akshay;

public class Assignment14_divNumber02 {

	void method1(int start, int end) {
		int number = 0;
		for (int index = end; index >= start; index--) {
			if (index % 5 == 0) {
				System.out.println(index + "   " + "this is last divisible number by 5");
				number = index - 5;
				System.out.println(number + "  " + "This is the second last number");
				break;
			}

		}
	}

	public static void main(String[] args) {
		Assignment14_divNumber02 divnumber = new Assignment14_divNumber02();
		divnumber.method1(10, 90);

	}
}
