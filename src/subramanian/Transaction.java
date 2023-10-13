package subramanium;
class Transaction{
	int balance=1000;
	int debitAmountCount;
	int creditAmountCount;
	int printStatementCount;
	
	void debit(int debitAmt){
	balance=balance-debitAmt;
	debitAmountCount=debitAmountCount+1;
	}
	
	void credit(int creditAmt){
	balance=balance+creditAmt;
	creditAmountCount=creditAmountCount+1;
	}
	
	void printStatementCount(){
	printStatementCount=printStatementCount+1;
	}
	
	void printCountInfo(){
	System.out.println("Remaining balance is "+balance);
	System.out.println("Number of times debit performed is "+debitAmountCount);
	System.out.println("Number of times credit performed is "+creditAmountCount);
	System.out.println("Number of times  Print Statement performed is "+printStatementCount);
	}
	
	public static void main(String []args){
		Transaction transaction = new Transaction();
		transaction.debit(100);
		transaction.debit(300);
		transaction.printStatementCount();
		transaction.debit(100);
		transaction.credit(600);
		transaction.printStatementCount();
		transaction.credit(400);
		transaction.printCountInfo();
	}
}	
		