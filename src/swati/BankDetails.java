package swati;

//ASSIGNMENT 5
class BankDetails{
	int balance = 1000;
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
		System.out.println(balance+" RS is your remaining balance");
		System.out.println(debitCount+" times debit operation is performed");
		System.out.println(creditCount+" times credit operation is performed");
		System.out.println(printStatementCount+" times print statement operation is performed");

	}
	
	public static void main(String[] args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.debitAmount(100);
		bankdetails.debitAmount(300);
		bankdetails.printStatement();
		bankdetails.debitAmount(100);
		bankdetails.creditAmount(600);
		bankdetails.printStatement();
		bankdetails.creditAmount(400);
		bankdetails.printCountInfo();	
	}
}