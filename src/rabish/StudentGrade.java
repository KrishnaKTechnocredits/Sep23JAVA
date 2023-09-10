package rabish;
class StudentGrade{
	
	void grade(int a){
		if ( a>=90 && a<=100){
			System.out.println("A+");
		}
		else if(a>=80 && a<=90){
			System.out.println("A");
		}
		else if(a>=70 && a<=80){
			System.out.println("B");
		}
		else if(a>=0 && a<=70){
			System.out.println("work harder");
		}
		else {
		System.out.println("Invalid score");
		}
	}
	
	public static void main(String[] args){
	
	StudentGrade student=new StudentGrade();
		student.grade(92);
		student.grade(76);
		student.grade(23);
		student.grade(-19);
		student.grade(102);
	}
}