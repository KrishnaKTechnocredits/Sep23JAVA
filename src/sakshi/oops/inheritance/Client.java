package sakshi.oops.inheritance;

public class Client {
	
	void case1() {
		//1) The class Manager (Super) and Employee (Sub) is having parent child relationship.
		//2) This is the case where we are creating object of parent class. 
		//3) hence, we can call the member functions and access the properties on Parent class Manager.
		
		System.out.println("----Case 1----");
		Manager manager = new Manager();
		System.out.println(manager.x); // 10
		System.out.println(manager.y); //20
		//System.out.println(a.z); // Ce -> Since the z is not present in the class A, it will give compilation error on variable z.
		manager.manager1(); // manager m1
		manager.manager2(); // manager m2
		//a.m3(); // Ce -> Since the method m is not present in the class A, it will give compilation error on variable z.
	}
	
	void case2() {
		//1) The class Manager (Super) and Employee (Sub) is having parent child relationship.
		//2) This is the case where we are creating object of child class. 
		//3) hence, we can call the member functions and access the properties on child class Employee which has directly inherited the properties/functions by parent class.
		
		System.out.println("----Case 2----");
		Employee employee = new Employee();
		System.out.println(employee.x); // 10
		System.out.println(employee.y); // 30
		System.out.println(employee.z); // 40
		employee.manager1(); // manager m1
		employee.manager2(); // employee m2
		employee.employee3(); // employee m3
	}
	
	void case3() {
		//1) The class Manager (Super) and Employee (Sub) is having parent child relationship.
		//2) This is the case where we are creating object of child class by taking the reference type of Parent class. 
		//3) At compile time, the eligibility of data members and member functions will be validate from the parent class.
		//4) while running the program, data members will remain same but the member functions can update their behavior, this phenomenon is known as dynamic polymorphism.
		
		System.out.println("----Case 3----");
		Manager manager = new Employee();
		System.out.println(manager.x); // 10
		System.out.println(manager.y); //20
		//System.out.println(manager.z); // CE -> Z ia not present in parent class
		manager.manager1(); // manager m1
		manager.manager2(); // employee m2
		//manager.employee3(); // CE -> employee3 ia not present in parent class
	}
	
	void case4() {
		//1) The class Manager (Super) and Employee (Sub) is having parent child relationship.
		//2) This is the case where we are assigning the object of parent class in the reference of parent type.
		//3) Since we cannot assign the parent in child so the fist statement itself give the CE.
		
		System.out.println("----Case 4----");
		//Employee manager = new Manager();
	}
	
	void case5() {
		//1) The class Manager (Super) and Employee (Sub) is having parent child relationship.
		//2) Internally, this case has been converted to case 3, hence all the rules are applied here in similar manner.
		
		System.out.println("----Case 5----");
		Manager manager = new Manager();
		Employee employee = new Employee();
		manager = employee;
		System.out.println(manager.x); // 10
		System.out.println(manager.y); //20
		//System.out.println(manager.z); // CE -> Z ia not present in parent class
		manager.manager1(); // manager m1
		manager.manager2(); // employee m2
		//manager.employee3(); // CE -> employee3 ia not present in parent class
	}
	
	void case6() {
		//1) The class Manager (Super) and Employee (Sub) is having parent child relationship.
		//2) Internally, this case has been converted to case 2, hence all the rules are applied here in similar manner.
		
		System.out.println("----Case 6----");
		Manager manager = new Employee();
		Employee employee = new Employee();
		employee = (Employee)manager;
		System.out.println(employee.x); // 10
		System.out.println(employee.y); // 30
		System.out.println(employee.z); // 40
		employee.manager1(); // manager m1
		employee.manager2(); // employee m2
		employee.employee3(); // employee m3
	}
	
	public static void main(String args[]) {
		Client client = new Client();
		client.case1();
		client.case2();
		client.case3();
		client.case4();
		client.case5();
		client.case6();
	}
}