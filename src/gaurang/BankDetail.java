package gaurang;

class BankDetail{

	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance = balance-amt;
		debitCount=debitCount+1;
	}
	
	void creditAmt(int amt){
		balance=balance+amt;
		creditCount=creditCount+1;
	}
	
	void printStatement(){
		System.out.println("Total balance after operation is "+ balance);
		printStatementCount=printStatementCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Total debitCount balance after operation is "+ debitCount);
		System.out.println("Total creditCount balance after operation is "+ creditCount);
		System.out.println("Total printStatementCount balance after operation is "+ printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt(100);
		bankDetail.debitAmt(300);
		bankDetail.printStatement();
		bankDetail.debitAmt(100);
		bankDetail.creditAmt(600);
		bankDetail.printStatement();
		bankDetail.creditAmt(400);
		bankDetail.printCountInfo();
	}
}