package rabish;
class Student {
	String name="Ravish";
	int rno=7;
	
	void displayDetails()
	{
	 System.out.println(name);
	 System.out.println(rno);
	}
	public static void main(String[] args){
	Student s = new Student();
		s.displayDetails();
		
	}
}