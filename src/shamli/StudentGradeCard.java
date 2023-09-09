/*Assignment - 8 : 5th Sep'2023
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
output : Invalid score */

package shamli;

class StudentGradeCard{

	void setScore(int marks){
		if(marks>=90 && marks<=100){
			System.out.println("You got A+ Grade ...Congratulation!");
		}
		else if(marks>=80 && marks<90){
			System.out.println("You got A Grade ...Very Good Job!");
		}
		else if(marks>=70 && marks<80){
			System.out.println("You got B Grade ... Good!");
		}
		else if(marks>=0 && marks<70){
			System.out.println("You need to work harder");
		}
		else if(marks<0 || marks>100){
			System.out.println("Invalid Score");
		}
	}
	 
	public static void main(String[] args){
		StudentGradeCard studentgrade=new StudentGradeCard();
		studentgrade.setScore(92);
		studentgrade.setScore(80);
		studentgrade.setScore(75);
		studentgrade.setScore(36);
		studentgrade.setScore(-6);
		studentgrade.setScore(106);
	}
}