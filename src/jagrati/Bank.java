package jagrati;

class Bank {
	int balance =1000;
	
	void debitAmount(int debitAmount){
		balance = balance - debitAmount;
	}	
	
	void creditAmount(int creditAmount){
		balance = balance + creditAmount;
	}
	
	void printBalance(){
		System.out.println("The balance amount " + balance);
		
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmount(200);
		bank.creditAmount(500);
		bank.creditAmount(200);
		bank.debitAmount(700);
		bank.printBalance();
	}
}