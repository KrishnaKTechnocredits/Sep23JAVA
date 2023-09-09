package shamli;

class Student
{
	String name="Shamli";
	int rno=101;
	
	
	
	void displayInfo()
	{
		System.out.println("Name Of Student is :"+ name);
		System.out.println("RollNo of Student is :"+rno);
	}
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.displayInfo();
	}
}