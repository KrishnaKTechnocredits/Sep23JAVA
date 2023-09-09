//Assignment - 8 : 5th Sep'2023
//Print student grade based on obtain score. *
//If score is between 90 (including) to 100 (including) -> "A+"
//If score is between 80 (including) to 90 -> "A"
//If score is between 70 (including) to 80 -> "B"
//If score is between 70 to 0 (including) -> "work harder"
//Any other score should be considered as Invalid score.
//input : 92
//output : A+
//input : 76
//output : B
//input : 23
//output : work harder
//input : -19
//output : Invalid score
//input : 102
//output : Invalid score
package harshada;
class StudentGrade{

	void grade(int score){
		if(score<0 || score>100){
			System.out.println("Invalid score");
		}else if(score>=90 && score<100){
			System.out.println("A+");
		}else if(score>=80 && score<90){
			System.out.println("A");
		}else if(score>=70 && score<80){
			System.out.println("B");
		}else if(score>=0 && score<70){
			System.out.println("work harder");
		}
	}

	public static void main(String[]args){
		StudentGrade studentGrade=new StudentGrade();
		studentGrade.grade(95);
		studentGrade.grade(85);
		studentGrade.grade(75);
		studentGrade.grade(65);
		studentGrade.grade(0);
		studentGrade.grade(-95);
		studentGrade.grade(101);
	}

}