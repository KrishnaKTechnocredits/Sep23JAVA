package sakshi;

class Bank1{

	int balance=1000;

	void debitAmt(int amount){
		balance = balance - amount;
	}
	
	void creditAmt(int amount){
		balance = balance + amount;
	}
	
	void printBalance(){
		System.out.println("The balance amount is -> " + balance);
	}
	
	public static void main(String[] args){
		Bank1 bank = new Bank1();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(200);
		bank.debitAmt(700);
		bank.printBalance();
	}
}