package akshay;

public class Assignment12_divNumber {

	void method1(int start, int end) {
		int sum = 0;
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				;
			System.out.println(index);
			sum = sum + index;
		}
		System.out.println("sum of all number"+sum);

	}

	public static void main(String[] args) {
		Assignment12_divNumber divnumber = new Assignment12_divNumber();
		divnumber.method1(10, 20);

	}
}