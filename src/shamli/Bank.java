package shamli;

class Bank{

	int balance=1000;
	
	void debitAmt(int dAmt){ 
		balance=balance-dAmt;
	}
	
	void creditAmt(int cAmt){
		balance=balance+cAmt;
	}
	
	void printBalance()
	{
		System.out.println("Remaining Balance is : " +balance);
	}
	
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(200);
		bank.debitAmt(700);
		bank.printBalance();
	}
}
