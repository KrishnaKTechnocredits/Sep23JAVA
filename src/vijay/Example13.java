package vijay;

class Example13{

	void test(int marks){
		if(marks>90){
			System.out.println("3");
			System.out.println("5");
		}else{
			System.out.println("4");
		}
		System.out.println("1");
	}
	
	public static void main(String[] args){
		Example13 example13 = new Example13();
		example13.test(92);
		System.out.println("2");
	}
}