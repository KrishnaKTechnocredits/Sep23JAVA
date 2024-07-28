package vijay;

class Example7a{
	String name;
	int empId;
	String empDeptName;
	
	void setData(String name, int id, String deptName){
		this.name = name;
		empId = id;
		empDeptName = deptName;
	}
	
	void displayInfo(){
		System.out.println("Employee name is " + name);
		System.out.println("Employee id is " + empId);
		System.out.println("Employee DeptName is " + empDeptName);
	}
	
	public static void main (String[] args){
		Example7a example7a = new Example7a();
		example7a.setData("Maulik", 10101, "IT");
		example7a.displayInfo();
	}
}