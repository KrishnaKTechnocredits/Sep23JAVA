package pavan;

//assi 5

class BankDetail{
	int balance = 1000;
	int debitCount;
	int creditcount;
	int printStatementCount;
	
	void debitAmount(int amt){
		balance = balance-amt;
		debitCount = debitCount + 1;
		System.out.println("your Balance ="+ balance);
		System.out.println("your debit count ="+debitCount); 
	}
	
	void printStatementCount(){
		printStatementCount = printStatementCount +1;
		System.out.println("your transaction count is ="+printStatementCount);
	}
	
	void creditAmount(int amt){
		balance = balance + amt;
		creditcount = creditcount + 1;
		System.out.println( "your debit balance ="+balance);
		System.out.println("your credit count ="+creditcount);
	}
	
	public static void main (String[] args){
		
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmount(5100);
		bankdetail.creditAmount(525);
		bankdetail.printStatementCount();
	}
}
	

