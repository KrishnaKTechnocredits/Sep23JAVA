package vijay;

class Example7{
	String empName;
	int empId;
	String empDeptName;
	
	void setData(String name, int id, String deptName){
		empName = name;
		empId = id;
		empDeptName = deptName;
	}
	
	void displayInfo(){
		System.out.println("Employee name is " + empName);
		System.out.println("Employee id is " + empId);
		System.out.println("Employee DeptName is " + empDeptName);
	}
	
	public static void main (String[] args){
		Example7 example7 = new Example7();
		example7.setData("Maulik", 10101, "IT");
		example7.displayInfo();
	}
}