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
output : Invalid score*/
package deepak;
class Grade_Assignment8{
	void getGrade(int score){
		if(score >=90 && score <=100){
			System.out.println("Based on the score entered, Grade is A+");
		} else if(score >=80 && score <90){
			System.out.println("Based on the score entered, Grade is A");			
		} else if(score >=70 && score <80){
			System.out.println("Based on the score entered, Grade is B");
		} else if(score >=0 && score <70){
			System.out.println("Work Harder");
		} else
			System.out.println("Invalid Score entered, enter valid score!");
	}
	
	public static void main(String[] args){
		Grade_Assignment8 grade = new Grade_Assignment8();
		grade.getGrade(92);
		grade.getGrade(76);
		grade.getGrade(23);
		grade.getGrade(-19);
		grade.getGrade(102);
	}
}