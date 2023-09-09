package akshita;

class Bank1{
	
	int balance =1000;
	
	void debitAmount(int amount){
		balance = balance - amount;
	}

	void creditAmount(int amount){
		balance = balance + amount;
	}
	
	void printBalanced(){
		System.out.println("Total Availble Balance is : " + balance);
	}
	
    public static void main(String[] args){
		Bank1 bank = new Bank1();
		bank.debitAmount(200);
		bank.creditAmount(500);
		bank.creditAmount(200);
		bank.debitAmount(700);
		bank.printBalanced();
	}
}