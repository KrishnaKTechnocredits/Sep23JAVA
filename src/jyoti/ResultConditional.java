/*Assignment - 8 : 5th Sep'2023

Print student grade based on obtain score. *

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
output : Invalid score*/

class ResultConditional//Assignment 8
{
	
	void printStudentGrade(int marks)
	{
		if(marks > 90 && marks <=100)
		{
			System.out.println("A+");
			
		}else if(marks > 70 && marks<=80)
		{
			System.out.println("B");
		}else if(marks > 20 && marks<=70)
		{
			System.out.println("Please workhard");
		}else if(marks <0 || marks >100) 
		{
			System.out.println("Invalid Score");
		
		}else
		{
			System.out.println("All the best");
		}
		
	}
	
	public static void main(String[] args){
		ResultConditional reslt = new ResultConditional();
		reslt.printStudentGrade(92);
		reslt.printStudentGrade(76);
		reslt.printStudentGrade(23);
		reslt.printStudentGrade(-19);
		reslt.printStudentGrade(102);
				
	}
}