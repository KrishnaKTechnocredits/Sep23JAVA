/*Print student grade based on obtain score. *

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
output : Invalid score
*/

//Assignment8
package roshani;

class StudentGrade{
	
	void score(int score){
		if(score >= 90 && score <= 100){
			System.out.println("A+ : Student score is between 90 to 100.");
		}else if(score >= 80 && score < 90){
			System.out.println("A : Student score is between 80 to 90.");
		}else if(score >= 70 && score < 80){
			System.out.println("B : Student score is between 70 to 80.");
		}else if(score < 70 && score >= 0){
			System.out.println("Work hard, as score low.");
		}else{
			System.out.println("Invalid Score!");
		}
	}
	
	public static void main(String[] args){
		StudentGrade studentgrade = new StudentGrade();
		studentgrade.score(92);
		studentgrade.score(76);
		studentgrade.score(23);
		studentgrade.score(-19);
		studentgrade.score(102);
	}
}