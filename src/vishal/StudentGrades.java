package vishal;

class StudentGrades{
	
	void displayGrades(int marks)
	{
		if(marks>=90 && marks<=100)
		{
			System.out.println("A+");
		}
		else if(marks>=80 && marks<=90)
		{
			System.out.println("A");
		}
		else if(marks>=70 && marks<=80)
		{
			System.out.println("B");
		}
		else if(marks<70 && marks>0)
		{
			System.out.println("Work Hard");
		}
		else if(marks<0 || marks>100)
		{
			System.out.println("Invalid Marks");
		}	
	}
	
	public static void main(String[] arg)
	{
		StudentGrades studentGrades = new StudentGrades();
		studentGrades.displayGrades(99);
		studentGrades.displayGrades(86);
		studentGrades.displayGrades(77);
		studentGrades.displayGrades(22);
		studentGrades.displayGrades(-11);
		studentGrades.displayGrades(111);
		
	}
}
