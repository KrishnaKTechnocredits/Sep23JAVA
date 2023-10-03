package akshay;

public class Assignment10_month {

	void method1(int num) {

		if (num <= 5 && num >= 1) {
			System.out.println("Jan to may, its summer");
		} else if (num <= 9 && num >= 6) {
			System.out.println("june to oct, its rain");
		} else if (num > 12) {
			System.out.println("invalid");
		} else {
			System.out.println("winter");
		}

	}

	public static void main(String[] args) {
		Assignment10_month month = new Assignment10_month();
		month.method1(4);
		month.method1(13);
		
		month.method1(2);
		month.method1(6);

	}

}
