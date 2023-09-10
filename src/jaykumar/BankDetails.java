package jaykumar;

class BankDetails{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance = balance-amt;
		debitCount = debitCount+1;
	}
	
	void creditAmt(int amt){
		balance = balance+amt;
		creditCount = creditCount+1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount+1;
	}
		
	void printcountInfo(){
		System.out.println("Remaining balance is : " + balance);
		System.out.println(debitCount + " times debit operation performed");
		System.out.println(creditCount + " times credit operation performed");
		System.out.println(printStatementCount + " times print statement operation performed");
	}
	
	public static void main(String[] args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.debitAmt(100);
		bankdetails.debitAmt(300);
		bankdetails.printStatement();
		bankdetails.debitAmt(100);
		bankdetails.creditAmt(600);
		bankdetails.printStatement();
		bankdetails.creditAmt(400);
		bankdetails.printcountInfo();
	}
}
		