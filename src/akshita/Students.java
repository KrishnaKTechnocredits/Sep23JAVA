package akshita;

class Students{

	String name = "Akshita";
	int rollnum = 1;
	int age= 18;
	
	void display(){
		System.out.println(name);
		System.out.println(rollnum);
		System.out.println(age);
}

   public static void main(String[] args){
	  
	  Students s = new Students();
	  s.display();
   }  
}