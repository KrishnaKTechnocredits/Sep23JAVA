package harshada;

class Example1{
	int num;// instance //0
	String name; // null
	
	void processData(){
		num=10;
	}

	void display(){									
		System.out.println("Number is "+num);		//3
	}
	
	public static void main(String[]args){
		Example1 example1= new Example1(); 			//1
		example1.display();							//2
		example1.processData();
		example1.display();
	}
}