package jaykumar;

class Employee{
	String empName;
	int empId;
	String empDeptName;
	
	void setData(String name, int id, String deptName){
		empName = name;
		empId = id;
		empDeptName = deptName;
	}
	
	void displayInfo(){
		System.out.println("Emp name is " + empName);
		System.out.println("Emp id is " + empId);
		System.out.println("Emp dept name is " + empDeptName);
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setData("Jaykumar", 57364, "CATIA");
		employee.displayInfo();
	}
}