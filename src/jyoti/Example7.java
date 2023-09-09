class Example7{
	String empName;
	int empId;
	String empDeptname;
	
	void setData(String name, int id, String deptName){
	empName=name;
	empId=id;
	empDeptName= deptName;
	}
	
	void displayInfo(){
	System.out.println("Employee name" + empName);
	System.out.println("Employee id is" + empId);
	System.out.println("Employee deptname is " + empDeptName);
	}
	
	public static void main(String[] args){
	Example7 example7 = new Example7();
	example7.setData("Maulik",10110,"IT");
	example7.displayInfo();
	}

}