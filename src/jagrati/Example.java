package jagrati;

class Example{
	int num;// default value 0
	String name;// default value null 
	
	void proccessData(){
		num=10;
	
	}
	void display(){
		System.out.println("number is " +num);
	
	}
	public static void main(String[] args){
		Example example = new Example();
		example.display();
		example.proccessData();
		example.display();
		
	}
	
}