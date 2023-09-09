package technoCredits;

class Example13{
	
	void test(int marks){
		if(marks>90){
			System.out.println("3");
			System.out.println("5");
		}else{
			System.out.println("4");
		}
		
		if(marks >95){
			System.out.println("6");
		}else{
			System.out.println("7");
		}
		System.out.println("1");
	}

	public static void main(String[] args){
		Example13 example = new Example13();
		example.test(92);
		System.out.println("2");
	}
}
// < <= > >= != ==, equals()