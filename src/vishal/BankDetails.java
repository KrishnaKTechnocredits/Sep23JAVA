package vishal;

class BankDetails{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmount(int amount){
		balance=balance-amount;
		debitCount=debitCount+1;
	}
	
	void creditAmount(int amount){
		balance=balance+amount;
		creditCount=creditCount+1;
	}
	
	void printStatement(){
		printStatementCount=printStatementCount+1;
	}
	
	void printCountInfo(){
		System.out.println(balance+ " : rs is your remaining balance");
		System.out.println(debitCount+ " : times debit performed");
		System.out.println(creditCount+ " : times credit performed");
		System.out.println(printStatementCount+ " : times print statement performed");
	}
	
	public static void main(String[] arg){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount(100);
		bankDetails.debitAmount(300);
		bankDetails.printStatement();
		bankDetails.debitAmount(100);
		bankDetails.creditAmount(600);
		bankDetails.printStatement();
		bankDetails.creditAmount(400);
		bankDetails.printCountInfo();

	}
}
