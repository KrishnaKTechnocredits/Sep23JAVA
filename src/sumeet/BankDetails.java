package sumeet;

class BankDetails{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debit(int amt){
		balance=balance-amt;
		debitCount=debitCount+1;
	}
	
	void credit(int amt){
		balance=balance+amt;
		creditCount=creditCount+1;
	}
	
	void printStatement(){
		System.out.println("Remaining balance is Rs" + balance);
		printStatementCount=printStatementCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Remaining balance is Rs" + balance);
		System.out.println(debitCount+ " times debit operation performed");
		System.out.println(creditCount + " times credit operation performed");
		System.out.println(printStatementCount + " times print statement operationperformed");
	}
	
	public static void main(String[] args){
		BankDetails bank= new BankDetails();
		bank.debit(100);
		bank.debit(300);
		bank.printStatement();
		bank.debit(100);
		bank.credit(600);
		bank.printStatement();
		bank.credit(400);
		bank.printCountInfo();
	}
}