package gaurang;

class Bank{
	
	int balance = 1000;
	
	
	void debitAmt(int amt){
		balance = balance - amt;
		System.out.println("After debit of "+amt+" Total balance is " + balance);
	
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		System.out.println("After credit of "+amt+" Total balance is " + balance);
	}
	
	public static void main (String[] args){
		Bank bank = new Bank();
		bank.debitAmt(200); 
		bank.creditAmt(500);
		bank.creditAmt(200);
		bank.debitAmt(700);
		System.out.println("Final balance is " + bank.balance);
	
	}
}