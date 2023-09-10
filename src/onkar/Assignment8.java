package onkar;

class Assignment8{
	
	void findStudentGrade(int score){
		if(score>90 && score<=100){
			System.out.println("A+");
		}else if(score>80 && score<=90){
			System.out.println("A");
		}else if(score>70 && score<=80){
			System.out.println("B");
		}else if(score>=0 && score<70){
			System.out.println("Work harder");
		}else if(score>100 || score<0){
			System.out.println("Invalid Score");
		}
	}
	
	public static void main(String[] args){
		Assignment8 assignment8 = new Assignment8();
		assignment8.findStudentGrade(92);
		assignment8.findStudentGrade(76);
		assignment8.findStudentGrade(23);
		assignment8.findStudentGrade(-19);
		assignment8.findStudentGrade(112);
	}
}