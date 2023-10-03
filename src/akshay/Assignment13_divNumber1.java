package akshay;

public class Assignment13_divNumber1 {

	void method1(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 7 == 0) {
				System.out.println(index + "this is divisible by 7");
			}
		}
	}

	public static void main(String[] args) {
		Assignment13_divNumber1 divnumber = new Assignment13_divNumber1();
		divnumber.method1(10, 40);

	}
}