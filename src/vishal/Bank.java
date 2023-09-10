package vishal;

class Bank{
	int balance = 1000;
	
	void debitAmt(int amt){
		balance = balance-amt;
	}
	
	void creditAmt(int amt){
		balance = balance+amt;
	}
	
	void printDisplay(){
		System.out.println("Remaining Balance is " + balance);
	}
	
	public static void main (String[] arg){
		Bank bank = new Bank();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(200);
		bank.debitAmt(700);
		bank.printDisplay();
	}
}
