//WAP to find out the grade of the Student on the basis of scores
package sakshi;

class StudentGradeSystem{
	
	void displayGrades(int score){
		if(score>=90 && score<=100){
			System.out.println("A+");
		}else if(score>=80 && score<90){
			System.out.println("A");
		}else if(score>=70 && score<80){
			System.out.println("B");
		}else if(score<70 && score>=0){
			System.out.println("work harder");
		}else if(score<0 || score>100){
			System.out.println("Invalid score");
		}
	}
	
	public static void main(String[] args){
		StudentGradeSystem studentGradeSystem = new StudentGradeSystem();
		studentGradeSystem.displayGrades(92);
		studentGradeSystem.displayGrades(76);
		studentGradeSystem.displayGrades(23);
		studentGradeSystem.displayGrades(-19);
		studentGradeSystem.displayGrades(102);
		
	}
}