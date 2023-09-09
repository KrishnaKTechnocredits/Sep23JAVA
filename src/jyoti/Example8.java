class Example8{

	int num1;
	int num2;
	String name;
	String deptName;
	
	void setData(int firstNumber, int secondNumber, String name){
	num1=firstNumber;
	num2=secondNumber;
	this.name=name;
	deptName="IT";
	
	}
	void updateData(String deptName){
			this.deptName=deptName;
	}	
	
	public static void main(String[] args){
		Example8 example8 = new Example8();
		example8.setData(10,12,"Jyoti");
		example8.updateData("HR");
		
		System.out.println(example8.num1);
	}
}	