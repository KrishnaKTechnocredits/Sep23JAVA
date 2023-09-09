package technoCredits;

class Example9{
	
	String empName = "Techno";
	String managerName;
	int deptId;
	
	void processData(String empName){
		System.out.println(empName); // Credits
		System.out.println(this.empName); //
		
		empName = this.empName;
		System.out.println(empName); // 
		System.out.println(this.empName); //
	}
	
	
	void display(){
		System.out.println(empName);
		System.out.println(this.empName);
	}
	
	void testMyKnowledge(){
		String location = "Pune";
		//System.out.println(this.location); // CE
	}
	
	public static void main(String[] args){
		Example9 example9 = new Example9();
		example9.display();
	}
}