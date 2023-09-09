class Example14{
	//boolean flag = false;
	void printStudentGrade(int marks){
		if(marks<0 || marks >100){
			System.out.println("A+");
			System.out.println("5");
		}else if(marks > 90 && marks<=100){
			System.out.println("A++");
		}else if(marks > 80 && marks<=90){
			System.out.println("A");
		}else {
			System.out.println("Workhard");
		
		}
		
	}
	
	
	public static void main(String[] args){
		Example14 exmaple = new Example14();
		exmaple.printStudentGrade(98);
				
	}
}