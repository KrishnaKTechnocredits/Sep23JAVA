//Assignment 8
package yogesh;
class Student1{
	
	void grade(int score){
		if(score>=90 && score<=100)
			System.out.println("Your Grade is A+ ");
		else if(score>=80 && score<90)
			System.out.println("Your Grade is A ");
		else if(score>=70 && score<80)
			System.out.println("Your Grade is B ");
		else if(score>=0 && score<70)
			System.out.println("Work Harder");
		else
			System.out.println("Invalied Score ");
	
	}
	
	public static void main(String[] args){
		Student1 student=new Student1();
		student.grade(92);
		student.grade(76);
		student.grade(23);
		student.grade(-19);
		student.grade(102);
	}
}