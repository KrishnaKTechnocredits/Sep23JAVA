package akshita;

class GradeSystem{
	
	void gradeAccordingToMarks(int score){
		if(score>90 && score<= 100){
			System.out.println("Grade is A+");
		}
		else if(score>80 && score<= 90){
			System.out.println("Grade is A");
		}
		else if(score>70 && score<= 80){
			System.out.println("Grade is B");
		}
		else if(score>0 && score<= 70){
			System.out.println("Work Harder");
		}
		else{
			System.out.println("Invalid Score");
		}
	}	
	public static void main(String[] args){
		GradeSystem gradeSystem = new GradeSystem();	
		gradeSystem.gradeAccordingToMarks(92);
		gradeSystem.gradeAccordingToMarks(76);
		gradeSystem.gradeAccordingToMarks(23);
		gradeSystem.gradeAccordingToMarks(-19);
		gradeSystem.gradeAccordingToMarks(102);
	}
}