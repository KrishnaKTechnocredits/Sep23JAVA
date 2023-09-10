package mayank;

class Bank{
	int balance = 1000;
	
	void creditAmt(int amt){
		balance = balance+amt;
	}
	
	void debitAmt(int amt){
		balance = balance-amt;
	}
		
	void printBalance(){
		System.out.println("totalamount: " + balance);
	}
		
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.creditAmt(500);
		bank.debitAmt(200);
		bank.creditAmt(200);
		bank.debitAmt(700);
		bank.printBalance();
	}
}