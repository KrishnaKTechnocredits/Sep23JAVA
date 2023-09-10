package shrutika;
class BankDetails1{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance = balance - amt;
		debitCount = debitCount + 1;
	}
	
	void crditAmt(int amt){
		balance = balance + amt;
		creditCount = creditCount + 1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Remaining balance is : "+balance);
		System.out.println(printStatementCount+" Times Print statement operation performed ");
		System.out.println(debitCount+" Times Debit method operation performed ");
		System.out.println(creditCount+" Times Cebit method operation performed ");
	}
	
	public static void main(String[] args){
		BankDetails1 bankDetails1= new BankDetails1();
		bankDetails1.debitAmt(100);
		bankDetails1.crditAmt(600);
		bankDetails1.printStatement();
		bankDetails1.debitAmt(100);
		bankDetails1.debitAmt(300);
		bankDetails1.crditAmt(400);
		bankDetails1.printStatement();
		bankDetails1.printCountInfo();
	}
}