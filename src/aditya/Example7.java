package aditya;
class Example7{
	String empname;
	int empId;
	String empDeptName;
	
	void setdata(String name, int id, String deptName){
		empname = name;
		empId = id;
		empDeptName = deptName;
	}
	
	void displayInfox	(){
		System.out.println("Employee name is" +empname);
		System.out.println("Employee id is" +empId);
		System.out.println("Employee Department name is" +empDeptName);
	}
	
	public static void main(String[] args){
		Example7 example7= new Example7();
		example7.setdata("Aditya",1479,"IT");
		example7.displayInfox();
	}
}