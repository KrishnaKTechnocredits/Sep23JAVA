package technoCredits;
class Example10{
	int testCount;
	int infoCount;
	
	void test(){
		System.out.println("I am in test method");
		testCount = testCount + 1;
	}
	
	void info(){
		infoCount = infoCount + 1;
	}
	
	void display(){
		System.out.println(testCount + " test method has been called so far");
		System.out.println(infoCount + " info method has been called so far");
	}
	
	public static void main(String[] args){
		Example10 example10 = new Example10();
		example10.test();
		example10.info();
		example10.test();
		example10.test();
		example10.test();
		example10.info();
		example10.display();
	}
}