package onkar;

class Assignment5{
	
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance = balance - amt;
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
		System.out.println("Remaining balance is "+balance+" rs");
		System.out.println(debitCount+" times Debit operation is performed");
		System.out.println(creditCount+" times Credit operation is performed");
		System.out.println(printStatementCount+" times print statement operation is performed");
	}
	
	public static void main(String[] args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.debitAmt(100);
		assignment5.debitAmt(300);
		assignment5.printStatement();
		assignment5.debitAmt(100);
		assignment5.creditAmt(600);
		assignment5.printStatement();
		assignment5.creditAmt(400);
		assignment5.printCountInfo();
	}
}