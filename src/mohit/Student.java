package mohit;


class Student{
	String name="Malik";
	int rno=13;
	
	void display(){
			System.out.println(name);
			System.out.println(rno);
	}
	public static void main(String[] args){
		Student student = new Student();
		student.display();
	
	}
}