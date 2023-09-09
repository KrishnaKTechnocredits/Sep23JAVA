package jyoti;
class Employee{
	int leaves=20;
	int salary=500;
	
	void getSalaryAndLeaves(){
	
	int temp=100;//100
	temp=salary+leaves;//520
	salary=temp;//520
	System.out.println("local salary =" + salary);
	System.out.println("local temp = " + temp);
	}
	void display(){
	System.out.println("instance salary= " + salary);	
		
	}
	public static void main(String[] args){
		Employee emp= new Employee();
		emp.getSalaryAndLeaves();//520
		emp.display();//500
	}
}
