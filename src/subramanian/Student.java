package subramanian;
class Student
{
	String name="Subbu";
	int Rollno=46;
	
	void display()
	{
		System.out.println(name);
		System.out.println(Rollno);
	}
	
	public static void main(String[] args)
	{
		 Student studentObj = new Student();
		 studentObj.display();
}
}