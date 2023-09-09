/*Assignment - 6 : 5th Sep'2023

Rewrite yesterday's BankDetails program with following condition.

1. If debitAmt is more than balance, asked amount should not be deducted from balance and you should print "Insufficient balance". If amt asked is negative, print "Invalid amount"

2. If user tries to credit more than 5000 in one go, you should print "You can't deposite more than 5000 rs in one go" and amount should not be credited in main balance. If credited amount is negative, print "Invalid amount".*/

package deepak;
class BankDetails_Assignment6{
	int balance = 1000;
	
	void debit(int amt){
		if(amt>balance){
			System.out.println("Insufficient Balance, current balance is Rs "+balance);
		}else if(amt<0){
			System.out.println("Invalid Amount");
		}else{
			System.out.println("Debit Amount: "+amt);
			balance = balance - amt;
		}
	}
	
	void credit(int amt){
		if(amt > 5000){
			System.out.println("You can't deposit more than 5000 rs in one go!");
		}else if(amt<0){
			System.out.println("Invalid Amount");
		}else{
			System.out.println("Credit Amount: "+amt);
			balance = balance + amt;
		}
	}
	
	void printbalance(){
		System.out.println("Available balance: "+balance);
	}
	
	public static void main(String[] args){
		BankDetails_Assignment6 bankDetails = new BankDetails_Assignment6();
		bankDetails.debit(1100);
		bankDetails.debit(-1100);
		bankDetails.printbalance();
		bankDetails.credit(5001);
		bankDetails.credit(-1200);
		bankDetails.printbalance();
		bankDetails.debit(200);
		bankDetails.printbalance();
		bankDetails.credit(2500);
		bankDetails.printbalance();
	}
}