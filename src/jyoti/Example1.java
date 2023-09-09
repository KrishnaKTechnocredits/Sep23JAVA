package jyoti;
class Example1{

	int num;
	String name;
	
	void processData(){
	num=10;
	}
	void display(){
	System.out.println("Number is " + num);
	}
	
	public static void main(String[] args){
	Example example1= new Example1();
	example1.display();
	example1.processData();
	example1.display();
	}





}