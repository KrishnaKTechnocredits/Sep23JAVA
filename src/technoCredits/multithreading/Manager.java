package technoCredits.multithreading;

public class Manager {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Employee1 emp1 = new Employee1();
		emp1.start();
		
		Employee2 emp2 = new Employee2();
		emp2.start();
		
		System.out.println("End");
	}
}
