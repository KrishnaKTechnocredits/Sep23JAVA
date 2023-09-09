package sakshi;

class Student{
    String name="sakshi";
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
	