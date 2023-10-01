package narendra.oopsInheritance;

public class CaseOutput {

	public static void main(String[] args) {
		// Case 1 :
		System.out.println("Case1 output:");
		Manager manager = new Manager();
		System.out.println(manager.num1); // 10
		System.out.println(manager.num2); // 20
//		System.out.println(manager.num3); --> CE
		manager.updateData();
		manager.display();
//		manager.getOutput(); //--> CE
//		((Employee) manager).getOutput(); //--> Run time error. Class Cast Exception

		// Case 2 :
		System.out.println("\n" + "Case2 output:");
		Employee emp = new Employee(); // static polymorphism
		System.out.println(emp.num1); // 10
		System.out.println(emp.num2); // 30
		System.out.println(emp.num3); // 40
		emp.updateData();
		emp.display();
		emp.getOutput();
//		b.m1(); // am1
//		b.m2(); // bm2
//		b.m3(); // bm3

		// Case 3 :
		System.out.println("\n" + "Case3 output:");
		Manager mng = new Employee(); // dynamic polymorphism --> A a = new B()
		System.out.println(mng.num1); // 10
		System.out.println(mng.num2); // 20
//		System.out.println(mng.num3); --> CE
		mng.updateData();
		mng.display();
//		mng.getOutput() -->  CE

		// Case 4 :
/*		Employee empcase4 = new Manager(); // CE, type mismatch, Parent class cannot be inherit into child class
		System.out.println(empcase4.num1); // 10
		System.out.println(empcase4.num2); // 20
		System.out.println(empcase4.num3); //--> CE
		empcase4.updateData();
		empcase4.display();
		empcase4.getOutput(); //-->  CE
*/	
		// Case 5 : 
		System.out.println("\n" + "Case5 output:");
		Manager mngcase5 = new Manager(); //
		Employee empcase5 = new Employee();
		mngcase5 = empcase5; //dynamic polymorphism, same as Case3		
		System.out.println(mngcase5.num1); // 10
		System.out.println(mngcase5.num2); // 20
//		System.out.println(mngcase5.num3); --> CE
		mngcase5.updateData();
		mngcase5.display();
//		mngcase5.getOutput() -->  CE
		
		// Case 6 : 
		System.out.println("\n" + "Case6 output:");
		Manager mngcase6 = new Manager(); //
		Employee empcase6 = new Employee();
		empcase6 = (Employee) mngcase6; //Runtime error.Class Cast Exception. Class Manager cannot be cast to class Employee	
/*		System.out.println(mngcase6.num1); // 10
		System.out.println(mngcase6.num2); // 20
//		System.out.println(mngcase6.num3); --> CE
		mngcase6.updateData();
		mngcase6.display();
//		mngcase6.getOutput() -->  CE
*/		
	}
}
