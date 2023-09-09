package sakshi;

class Employee1{
	int salary =500;
	int leaves=20;
	
	void getsalary(){
		int temp =100;
		temp = salary + leaves;
		salary = temp;
	}
	
	void display(){
		System.out.println(salary);
	}
	
	public static void main(String[] args){
		Employee1 employee1 = new Employee1();
		employee1.getsalary();
		employee1.display();
	}
}