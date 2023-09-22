package technoCredits.interview;

public class Bank {
	
	static int dCount;
	static int cCount;
	
	void debitAmt() {
		dCount++;
	}
	
	void creditAmt() {
		cCount++;
	}
	
	void display() {
		System.out.println(dCount);
		System.out.println(cCount);
	}
	
	
	public static void main(String[] args) {
		Bank user1 = new Bank();
		user1.debitAmt();
		user1.debitAmt();
		user1.debitAmt();
		user1.creditAmt();
		
		Bank user2 = new Bank();
		user2.debitAmt();
		user2.creditAmt();
		user2.creditAmt();
		user2.creditAmt();
		user2.creditAmt();
		user2.creditAmt();
		
		user1.display();
		user2.display();
	}
}
