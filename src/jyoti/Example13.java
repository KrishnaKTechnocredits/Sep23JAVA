class Example13{
	//boolean flag = false;
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
		Example13 exmaple = new Example13();
		exmaple.test(92);
		System.out.println("2");
		
	}
}