package swati;

class Student{
	
	String name="swati";
	int rno=1;
	
	void display(){
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main(String[] a){
		Student s =new Student();
		s.display();
	}
}