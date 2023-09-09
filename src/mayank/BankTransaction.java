package mayank;
class BankTransaction{
	int balance = 1000;
	int creditCount;
	int debitCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance = balance-amt;
		debitCount = debitCount + 1;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount = creditCount + 1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount + 1;
	}
	
	void printCountInfo(){
		System.out.println("Available balance = "+ balance );
		System.out.println("times Credit operation is performed = "+ creditCount );
		System.out.println("times debit performed = "+ debitCount );
		System.out.println("Print Statement performed "+ printStatementCount );
	}
	
	public static void main(String[] args){
		BankTransaction banktransaction = new BankTransaction();
		banktransaction.debitAmt(600);
		banktransaction.debitAmt(100);
		banktransaction.creditAmt(600);
		banktransaction.printStatement();
		banktransaction.creditAmt(100);
		banktransaction.printCountInfo();
	}
}