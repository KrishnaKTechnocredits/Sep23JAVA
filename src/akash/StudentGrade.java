package akash;

class StudentGrade{
	void grade(int score){
		if(score<=0 || score>100){
			System.out.println("Invalid score");
		}else if(score>=90 && score<100){
			System.out.println("A+");
		}else if(score>=80 && score<90){
			System.out.println("A");
		}else if(score>=70 && score<80){
			System.out.println("B");
		}else if(score>=0 && score<70){
			System.out.println("work Harder");
		}
	}
	
	public static void main(String[] args){
		StudentGrade studentgrade = new StudentGrade();
		studentgrade.grade(208);
		studentgrade.grade(94);
		studentgrade.grade(87);
		studentgrade.grade(72);
		studentgrade.grade(34);
		studentgrade.grade(-9);
	}
}