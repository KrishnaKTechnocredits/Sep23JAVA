package subramanian;
class Banking{
	int balance=1000;

	void debitAmount(int amount){
		balance=balance-amount;
		System.out.println("Balance after debit "+balance);
	}
	
	void creditAmount(int amount){
		balance=balance+amount;
		System.out.println("Balance after credit "+balance);	
	}
	
	void printBalance(){
		System.out.println("Current Balance is "+balance);
	}
	
	public static void main(String[] args){
		 Banking bank =new Banking();
		 bank.debitAmount(200);
		 bank.creditAmount(500);
		 bank.creditAmount(200);
		 bank.debitAmount(700);
		 bank.printBalance();
	}
}
		 