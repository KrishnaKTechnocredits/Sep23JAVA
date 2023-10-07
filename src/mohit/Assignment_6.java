/*Assignment - 6 : 5th Sep'2023

Rewrite yesterday's BankDetails program with following condition.
1. If debitAmt is more than balance, asked amount should not be deducted from balance and you should print "Insufficient balance". If amt asked is negative, print "Invalid amount"

2. If user tries to credit more than 5000 in one go, you should print "You can't deposite more than 5000 rs in one go" and amount should not be credited in main balance. If credited amount is negative, print "Invalid amount".

*/

package mohit;

public class Assignment_6 {
	int balance = 1000;

	void debitAmt(int amt) {
		if (amt < 0) {
			System.out.println("invalid amount");
		} else if (amt > 0 && amt < balance) {
			balance = balance - amt;
		} else if (amt > balance) {
			System.out.println("Insufficient balance");
		}
	}

	void creditAmt(int amt) {
		if (amt > 5000) {
			System.out.println("you can't deposit more than 5000rs in one go");
		} else if (amt > 0 && amt < 5000) {
			balance = balance + amt;
		} else if (amt < 0) {
			System.out.println("invalid amount");
		}
	}

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.debitAmt(2000);
		assignment_6.creditAmt(6000);
	}
}
