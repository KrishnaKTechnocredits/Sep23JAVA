// WAP to print Student grade based on obtained score. 

package sayali;

class StudentGradeSystem{
	
	void displayGrades(int score){
		if(score>=90 && score<=100){
			System.out.println("A+");	
		}else if(score>=80 && score<90){
			System.out.println("A");
		}else if(score>=70 && score<80){
			System.out.println("B");
		}else if(score<70 && score>=0){
			System.out.println("Work Harder");
		}else if(score<0 || score>100){
			System.out.println("Invalid Score");
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