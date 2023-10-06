/*Assignment - 7 : 5th Sep'2023

Print student grade based on obtain score. *

If score is between 90 (including) to 100 (including) -> "A+"
If score is between 80 (including) to 90 -> "A"
If score is between 70 (including) to 80 -> "B"
If score is between 70 to 0 (including) -> "work harder"
Any other score should be considered as Invalid score.

input : 92
output : A+

input : 76
output : B

input : 23
output : work harder

input : -19
output : Invalid score

input : 102
output : Invalid score*/

package mohit;

public class Assignment_8 {
	void studentGrade(int score) {
		if (score >= 90 && score <= 100) {
			System.out.println("grade is A+");
		} else if (score >= 80 && score < 90) {
			System.out.println("grade is A");
		} else if (score >= 70 && score < 80) {
			System.out.println("grade is B");
		} else if (score > 0 && score <= 70) {
			System.out.println("work harder");
		} else {
			System.out.println("invalid score");
		}
	}
	
	public static void main(String[] args) {
		Assignment_8 assignment_8 = new Assignment_8();
		assignment_8.studentGrade(92);
		assignment_8.studentGrade(76);
		assignment_8.studentGrade(23);
		assignment_8.studentGrade(-19);
		assignment_8.studentGrade(102);
		}
}
