package technoCredits.exceptionDemo.throwthrows;

public class Krishna {
	
	void processData(int amount) throws RuntimeException,ArithmeticException,NullPointerException {
		System.out.println("Krishna processData");
		new Harsh().payBill(1500);
		System.out.println(2);
	}
}
