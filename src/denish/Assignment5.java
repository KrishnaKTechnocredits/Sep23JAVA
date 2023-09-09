package denish;

class BankDetail{
	
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
		System.out.println(balance + " Your Remaining Balance");
		System.out.println(debitCount + " Time Debit Operation is Performed");
		System.out.println(creditCount + " Time Credit Operation is Performed");
		System.out.println(printStatementCount + " Time Print Statement Operation is Performed");
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt(200);
		bankDetail.debitAmt(300);
		bankDetail.printStatement();
		bankDetail.debitAmt(100);
		bankDetail.creditAmt(400);
		bankDetail.printStatement();
		bankDetail.creditAmt(600);
		bankDetail.creditAmt(800);
		bankDetail.printCountInfo();
	}
}