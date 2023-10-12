package technoCredits.constructor;

public class Student {

	String name;
	int rno;
	
	public Student(int rno, String name){
		System.out.println("2 param Constructor");
		this.rno = rno;
		this.name = name;
	}
	
	public Student(){
		this.rno = 10;
		this.name = "Credits";
	}
	
	Student(int rno){
		this.rno = rno;
		this.name = "Credits";
	}
	
	void setData(int rno, String name) {
		
	}
	
	void display() {
		System.out.println(rno + "->" + name);
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		
		Student student1 = new Student(1,"Techno");
		Student student2 = student1;
		student1 = new Student(1);
		
		
		student1.display();
		System.out.println("End");
		
	}
}
