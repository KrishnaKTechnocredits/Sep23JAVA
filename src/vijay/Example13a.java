package vijay;

class Example13a{

	void test(int marks){
		if(marks==100){
			System.out.println("3");
			System.out.println("5");
		}else{
			System.out.println("4");
		}
		System.out.println("1");
	}
	
	public static void main(String[] args){
		Example13a example13a = new Example13a();
		example13a.test(92);
		System.out.println("2");
	}
}