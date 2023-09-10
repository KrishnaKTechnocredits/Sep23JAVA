package akshita;

class Example1{
	int num;
	
	void processData(){
	   num = 10;
	}
	
	void display(){
	  System.out.println("Number is " + num);
	
	}
    
public static void main(String[] args){
	     Example1 example = new Example1();
		 example.display();
		 example.processData();
		 example.display();
	}

}