package sayali;

class Bank{
	int balance = 1000;
	
	void creditAmt(int amt){
		balance = balance + amt;
	}
	
	void debitAmt(int amt){
		balance = balance - amt;
	}
	
	void printBalance(){
		System.out.println("Balance: " + balance);		
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.debitAmt(700);
		bank.creditAmt(200);
		bank.printBalance();
	}
}