package rahul;

class Assignment8_StdGrade {
	
	void studentGrade(int marks) {
		if (marks > 100) {
			System.out.println("Invalid marks entered");
		}
		else if (marks < 0) {
			System.out.println("Invalid marks entered");
		}
		else if (marks > 90 && marks <= 100) {
			System.out.println("A+");
		}
		else if (marks > 80 && marks <= 90) {
			System.out.println("A");
		}
		else if (marks > 70 && marks <=80) {
			System.out.println("B+");
		}
		else if (marks > 60 && marks <= 70) {
			System.out.println("B");
		}
		else if (marks > 0 && marks <= 60) {
			System.out.println("work harder");
		}
	}
	
	public static void main (String args[]) {
		Assignment8_StdGrade assignment8_stdGrade = new Assignment8_StdGrade();
		assignment8_stdGrade.studentGrade(92);
		assignment8_stdGrade.studentGrade(76);
		assignment8_stdGrade.studentGrade(80);
		assignment8_stdGrade.studentGrade(23);
		assignment8_stdGrade.studentGrade(-19);
		assignment8_stdGrade.studentGrade(102);
	}
}