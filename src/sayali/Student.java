
package sayali;

class Student{
	String name="Sayali";
	int rno=1;
	
	void display() {
			System.out.println(name);
			System.out.println(rno);
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.display();
	}
	
}