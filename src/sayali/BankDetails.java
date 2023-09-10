package sayali;

class BankDetails{
	int balance=1000;
	int creditCount;
	int debitCount;
	int printStatementCount;
	
	void debitAmount(int amount){
		balance = balance-amount;
		debitCount = debitCount+1;
	}
	
	void creditAmount(int amount){
		balance = balance+amount;
		creditCount = creditCount+1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Your remaining balance is : Rs. " + balance);
		System.out.println(debitCount+ " : times Debit Operation performed");
		System.out.println(creditCount+ " : times Credit Operation performed");
		System.out.println(printStatementCount+ " : times Print Statement Operation performed");
	}
	
	public static void main(String[] args){
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