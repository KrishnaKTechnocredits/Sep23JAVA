//WAP that will have 2 method, 
//1 method will set employee data(name,empid,deptname), it shpuld be parameterized
//second method should print the value which is set by first method

package roshani;

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
		System.out.println("Employee name is " + empId);
		System.out.println("Employee name is " + empDeptName);
	}
	
	public static void main(String[] args){
		Example7 example7 = new Example7();
		example7.setData("Maulik",10101,"IT");
		example7.displayInfo();
	}
}

