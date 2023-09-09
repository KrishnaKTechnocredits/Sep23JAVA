package sakshi;

class Bank1{

	int balance=1000;

	void debitAmt(int amount){
		balance = balance - amount;
	}
	
	void creditAmt(int amount){
		balance = balance + num;
	}
	
	void printBalance(){
		System.out.println("The balance amount is -> " + balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(200);
		bank.debitAmt(700);
		bank.printBalance();
	}
}