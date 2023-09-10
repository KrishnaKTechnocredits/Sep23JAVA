package rabish;
class BankDetail{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance=balance-amt;
		debitCount=debitCount+1;
	}
	
	void creditAmt(int amt){
		balance=balance+amt;
		creditCount=creditCount+1;
	}
	
	void printStatement(){
		System.out.println("Current Balace=:"+balance);
		printStatementCount=printStatementCount+1;
	}
	
	void printCountInfo(){
		System.out.println(debitCount+"times Debit operation performed");
		System.out.println(creditCount+"times credit operation performed");
		System.out.println(printStatementCount+"times print statement operation performed");
	}
	public static void main (String[] args){
		BankDetail bank = new BankDetail();
		bank.debitAmt(100);
		bank.debitAmt(100);
		bank.debitAmt(300);
		bank.printStatement();
		bank.debitAmt(100);
		bank.creditAmt(600);
		bank.printStatement();
		bank.creditAmt(400);
		bank.printCountInfo();
	}
}