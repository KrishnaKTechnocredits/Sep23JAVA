package vishal;

class Student{
      String name = "Vishal"; // String is a class and Datatype
	  int rno = 13;
	  
	  void display(){
	  System.out.println(name);
	  System.out.println(rno);
	  }
	  
	   public static void main(String[] args){
		   
		   Student s = new Student();
		   s.display();
		   
	   }
	}  
