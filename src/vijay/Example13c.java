package vijay;

class Example13c{

	void test(int marks){
		if(marks>90){
			System.out.println("3");
			System.out.println("5");
		}
		System.out.println("1");
	}
	
	public static void main(String[] args){
		Example13c example13c = new Example13c();
		example13c.test(92);
		System.out.println("2");
	}
}

// only if block is allowed;
// only else block is not allowed;
// with one if block only one else block is allowed;
// with one if block multiple else block is not allowed.
// one method can have multiple if else block.
// < <= > >= == !=