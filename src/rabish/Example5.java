package rabish;
class Example5 {
	
	int num=10;
	
	void processData(){
		int num=100;
		System.out.println(num);
	}
	void display(){
		System.out.println(num);
	}
	
	public static void main(String[] args){
			Example5 example1 = new Example5();
			example1.processData();
			example1.display();
	}
}

