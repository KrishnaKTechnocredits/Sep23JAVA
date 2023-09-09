package shamli;

class BankDetails{
	int balance = 1000;
	int debitCount=0;
	int creditCount=0;
	int printStatementCount=0;
	
	void debitAmt(int amt){
		balance=balance-amt;
		debitCount++;
	}
	
	void creditAmt(int amt){
		balance=balance+amt;
		creditCount++;
	}
	
	void printStatement(){
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Current Balance is : " +balance);
		System.out.println( debitCount+ " times Debit operation performed ");
		System.out.println( creditCount+ " times credit operation performed ");
		System.out.println( printStatementCount+ " times print statement operation performed ");
	}
	
	public static void main(String[] args){
		BankDetails bankdetails=new BankDetails();
		bankdetails.debitAmt(100);
		bankdetails.debitAmt(300);
		bankdetails.printStatement();
		bankdetails.debitAmt(100);
		bankdetails.creditAmt(600);
		bankdetails.printStatement();
		bankdetails.creditAmt(400);
		bankdetails.printStatement();
		bankdetails.printCountInfo();
	}
}