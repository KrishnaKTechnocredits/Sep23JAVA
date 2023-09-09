class Example10{
	int testCount=0;	
	int infoCount=0;
	
	void test(){
	//count=0;
	System.out.println("test count" + testCount);
	testCount =testCount +1;
	}

	void info(){
	System.out.println("test count" + infoCount);
	infoCount =infoCount +1;
	}
	

	void display(){
		System.out.println("count =" + testCount);
		System.out.println("count info =" + infoCount);
	}
	
	public static void main(String[] args){
	Example10 example10= new Example10();
	example10.test();	
	example10.test();
	example10.test();
	example10.test();	
	
	example10.display();
	}

}