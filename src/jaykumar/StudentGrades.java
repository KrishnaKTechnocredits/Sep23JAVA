// Jaykumar Bankar - Assignment 8
package jaykumar;

class StudentGrades{
	
	void printStudentGrades(int marks){
		if(marks>=90 && marks<=100){
			System.out.println("Congratulations! You got A+ grade!");
		}else if(marks>=80 && marks<90){
			System.out.println("Well done, you got A grade!");
		}else if(marks>=70 && marks<80){
			System.out.println("Nice, you got B grade!");
		}else if(marks>=0 && marks<70){
			System.out.println("You need to work hard!");
		}else{
			System.out.println("Invalid marks!, Please give valid marks");
		}
	}
	
	public static void main(String[] args){
		StudentGrades studentGrades = new StudentGrades();
		studentGrades.printStudentGrades(92);
		studentGrades.printStudentGrades(76);
		studentGrades.printStudentGrades(23);
		studentGrades.printStudentGrades(-19);
		studentGrades.printStudentGrades(102);
	}
}
			
			
			