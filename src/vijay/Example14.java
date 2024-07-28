package vijay;

class Example14{

	void test(int marks){
		if(marks>90 && marks<=100 && marks>0){
			System.out.println("A+");
		}
	}
	
	public static void main(String[] args){
		Example14 example14 = new Example14();
		example14.test(92);
	}
}

// one if else block can have multiple conditions like above (marks>90 && marks<=100 && marks>0)
// 