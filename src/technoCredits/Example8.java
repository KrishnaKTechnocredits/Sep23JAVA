package technoCredits;

class Example8{
	int num1;
	int num2;
	String name;
	String deptName; // IT // HR
	
	void setData(int firstNumber, int secondNumber, String name){
		num1=firstNumber;
		num2=secondNumber;
		this.name=name;
		deptName="IT";
	}
	
	void updateData(String deptName){
		System.out.println(deptName); // HR
		System.out.println(this.deptName); // IT 
		
		this.deptName=deptName;
		
		System.out.println(deptName); // HR
		System.out.println(this.deptName); // HR 
	}
	
	public static void main(String[] args){
		Example8 example8 = new Example8();
		example8.setData(10,12,"Maulik");
		example8.updateData("HR");
	}
}