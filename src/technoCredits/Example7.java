package technoCredits;
class Example7{
	String name; // null
	int empId;
	String empDeptName;
  
	void setData(String name, int id, String deptName){
		name = name;
		empId = id;
		empDeptName = deptName;
	}

	void displayInfo(){
		System.out.println("Employee name is " + name);
		System.out.println("Employee id is " + empId);
		System.out.println("Employee deptname is " + empDeptName);
	}

	public static void main(String[] args){
		Example7 example7 = new Example7();
		example7.setData("Maulik",10101,"IT");
		example7.displayInfo();
	}
}