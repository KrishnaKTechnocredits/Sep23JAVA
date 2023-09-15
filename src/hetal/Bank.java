package hetal;

class Bank{
	
	int balance = 50000;
	
	void debitAmt(int amt){
		
		if(balance >= amt){
			balance = balance - amt;
			System.out.println("After debit of "+amt+" Total balance is " + balance);
		}
		else if(amt < 0){
			System.out.println("invalid amount");
		}
		else {
			System.out.println("Balance is insufficient");
		}
	}
	
	void creditAmt(int amt){
		if(amt<=5000){
			balance = balance + amt;
			System.out.println("After credit of "+amt+" Total balance is " + balance);
		}
		else if(amt < 0){
			System.out.println("invalid amount");
		}
		else {
			System.out.println("Can not credit more than 5000 in one go");
		}
	}
	
	public static void main (String[] args){
		Bank bank = new Bank();
		System.out.println("Main balance is " + bank.balance);
		bank.debitAmt(10000); 
		bank.creditAmt(4000);
		bank.creditAmt(10000);
		bank.debitAmt(60000);
		bank.debitAmt(40000);
		bank.creditAmt(-3000);
	}
}