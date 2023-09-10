package shrutika;
//Assignment 9
class StudentGrade{
	
	void test(int marks){
		if(marks>=90 && marks<=100){
			System.out.println(marks+" is total score and achived grade is: A+");
		}else if(marks>=80 && marks<90){
			System.out.println(marks+" is total score and achived grade is: A");
		}else if(marks>=70 && marks<80){
			System.out.println(marks+" is total score and achived grade is: B");
		}else if(marks>=0 && marks<70){
			System.out.println(marks+" is total score and Need to Work Hard");
		}else {
			System.out.println(marks+" Invalid score");
		}			
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.test(92);
		studentGrade.test(76);
		studentGrade.test(23);
		studentGrade.test(-19);
		studentGrade.test(102);
		
	}
}