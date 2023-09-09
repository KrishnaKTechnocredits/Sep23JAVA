//assignment 8

package mayank;


class StudentGrade{
	
	void grade(int marks){
		if(marks>=90 && marks<=100){
			System.out.println("A+");
		}
		else if (marks>=80 && marks<90){
			System.out.println("A");
		}
		else if (marks>=70 && marks<80){
			System.out.println("B");
		}
		else if (marks>=60 && marks<70){
			System.out.println("C");
		}
		else if (marks>=50 && marks<60){
			System.out.println("Work Hard");
		}
		else if (marks>=40 && marks<50){
			System.out.println("Work Hard");
		}
		else if (marks>100 || marks<0){
			System.out.println("Invdalid Marks");
		}
	}
	public static void main(String[] args){
		StudentGrade studentgrade = new StudentGrade();
		studentgrade.grade(95);
		studentgrade.grade(111);
		studentgrade.grade(-10);
		studentgrade.grade(40);
		studentgrade.grade(75);
	}
}