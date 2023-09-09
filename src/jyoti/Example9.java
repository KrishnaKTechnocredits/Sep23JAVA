class Example9{
	
	String empName="Techno";
	String managerName;
	int deptId;
	
	void processData(String empName){
		System.out.println(empName);
		System.out.println(this.empName);
		
		empName=this.empName;
		System.out.println(empName);
		System.out.println(this.empName);
	}
	
	void display(){
	System.out.println(empName);
	System.out.println(this.empName);
	}
	
	public static void main(String [] args){
		Example9 example9= new Example9();
		//example9.processData("Credits");
		example9.display();
	
	}
	
	
}