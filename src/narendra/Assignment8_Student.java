package narendra;

class Assignment8_Student {

	void printGrades(int score) {
		if (score >= 90 && score <= 100) {
			System.out.println("Scores A+ Grade");
		} else if (score >= 80 && score < 90) {
			System.out.println("Scores A Grade");
		} else if (score >= 70 && score < 80) {
			System.out.println("Scores B Grade");
		} else if (score >= 0 && score < 70) {
			System.out.println("Need to work hard");
		} else {
			System.out.println("Invalid score");
		}
	}

	public static void main(String[] args) {
		Assignment8_Student student = new Assignment8_Student();
		student.printGrades(92);
		student.printGrades(76);
		student.printGrades(23);
		student.printGrades(-19);
		student.printGrades(102);
	}
}
