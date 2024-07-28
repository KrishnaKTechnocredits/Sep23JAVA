package vijay;

class Example13b{

	void test(int marks){
		if(true){
			System.out.println("3");
			System.out.println("5");
		}else{
			System.out.println("4");
		}
		System.out.println("1");
	}
	
	public static void main(String[] args){
		Example13b example13b = new Example13b();
		example13b.test(92);
		System.out.println("2");
	}
}