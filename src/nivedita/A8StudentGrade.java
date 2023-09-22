/* Assignment 8 : Print student grade based on obtain score. *

If score is between 90 (including) to 100 (including) -> "A+"
If score is between 80 (including) to 90 -> "A"
If score is between 70 (including) to 80 -> "B"
If score is between 70 to 0 (including) -> "work harder"
Any other score should be considered as Invalid score.

input : 92
output : A+

input : 76
output : B

input : 23
output : work harder

input : -19
output : Invalid score

input : 102
output : Invalid score	*/


package nivedita;
class A8StudentGrade{
	
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
		A8StudentGrade studentGrade = new A8StudentGrade();
		studentGrade.test(92);
		studentGrade.test(76);
		studentGrade.test(23);
		studentGrade.test(-19);
		studentGrade.test(102);
		
	}
}