package technoCredits;


class Example1{
	int num; // instance // 0
	String name; // null

	void processData(){
		num=10;
	}
	
	void display(){
		System.out.println("Number is " + num);
	}

	public static void main(String[] args){
		Example1 example1 = new Example1();
		example1.display(); // 0
		example1.processData(); // 10
		example1.display(); // 0
	}	
}