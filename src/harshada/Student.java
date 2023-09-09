package harshada;
class Student{
	String name="Harshada";
	int rno=11;
	
	
	void display(){
		System.out.println(name);
		System.out.println(rno);
		
	}
	
	public static void main(String[] a){
		Student s= new Student();
		s.display();
	}
}