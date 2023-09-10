// Jaykumar Bankar - Assignment 6
package jaykumar;

class BankOperation{
	int balance = 1000;
	
	void debitAmt(int amt){
		if(amt<=0){
			System.out.println("\n" + amt + " is invalid amount, please enter valid debit amount!");
		}else if (amt>balance){
			System.out.println("\n" + "Insufficient Balance!");
			System.out.println("your balance is : " + balance + " And "+ "Your requested amount to debit is : " + amt);
		}else{
			balance = balance - amt;
			System.out.println("\n" + "Your debited amount is : " +amt);
			System.out.println("Your remaining balance is : " + balance);
		}
	}
	
	void creditAmt(int amt){
		if(amt<=0){
			System.out.println("\n" +amt + " is invalid amount, please enter valid credit amount!");
		}else if(amt>5000){
			System.out.println("\n" + "Your requested amount to credit is : " + amt);
			System.out.println("You can't credit more than Rs.5000 in one go!");
		}else{
			balance = balance + amt;
			System.out.println("\n" + "Your credited amount is : " + amt);
			System.out.println("Your remaining balance is : " + balance);
		}
	}
	
	public static void main(String[] args){
		BankOperation bankOperation = new BankOperation();
		bankOperation.debitAmt(-100);
		bankOperation.debitAmt(1200);
		bankOperation.debitAmt(800);
		bankOperation.creditAmt(-200);
		bankOperation.creditAmt(5250);
		bankOperation.creditAmt(1300);
	}
}