package vijay;

class Example14a{

	void test(int marks){
		if(marks<0 || marks>100){
			System.out.println("Invalid Score");
		}
	}
	
	public static void main(String[] args){
		Example14a example14a = new Example14a();
		example14a.test(92);
	}
}
