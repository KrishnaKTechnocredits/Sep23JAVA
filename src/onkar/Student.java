package onkar;

class Student{
	String name="Onkar";
	int rno=33;
	
	void display(){
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.display();
	}
}