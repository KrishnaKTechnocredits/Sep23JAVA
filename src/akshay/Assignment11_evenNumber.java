package akshay;

public class Assignment11_evenNumber {

	void method1(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}

	}

	public static void main(String[] args) {
		Assignment11_evenNumber evennumber = new Assignment11_evenNumber();
		evennumber.method1(10, 20);

	}
}