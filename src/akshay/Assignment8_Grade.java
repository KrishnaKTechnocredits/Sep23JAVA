package akshay;

public class Assignment8_Grade {

	void method1(int score) {
		if (score >= 90 && score < 100) {
			System.out.println("Grade-A");
		} else if (score < 90 && score > 75) {
			System.out.println("average");

		} else if (score < 0) {
			System.out.println("invalid");

		} else {
			System.out.println("need hard work");
		}

	}

	public static void main(String[] args) {
		Assignment8_Grade grade = new Assignment8_Grade();
		grade.method1(65);
		grade.method1(95);
		grade.method1(50);

	}
}
