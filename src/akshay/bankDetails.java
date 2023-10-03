package akshay;


public class bankDetails {

	int balance = 1000;

	void method1(int amount) {
		if (amount > balance) {
			System.out.println("Insufficiant fund");
		} else if (amount < 0) {
			System.out.println("invalid amount");

		} else {
			System.out.println("credit amount:" + amount);
			balance = balance + amount;
		}

	}

	public static void main(String[] args) {
		bankDetails bank = new bankDetails();
		bank.method1(500);
	}
}