package sumeet;

class Student{
	String name="Sumit";
	int rno = 123;
	
	void display(){
		System.out.println(name);
		System.out.println(rno);
	}
	public static void main(String[] args){
		Student s=new Student();
		s.display();
	}
}