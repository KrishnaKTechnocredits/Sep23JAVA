package mohit;


class BankDetail{
	
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance=balance-amt;//900/600//500//600
		debitCount=debitCount+1;	
	}	
	
	void creditAmt(int amt){
		balance=balance+amt;
		creditCount=creditCount+1;	
	}
	
	void printStatement(){
		System.out.println("The current balance is : " + balance);
		printStatementCount=printStatementCount+1;	
	}
	
	void printCountInfo(){
		System.out.println("The remaining balance is : " + balance);
		System.out.println(debitCount + "times Debit Operation performed");
		System.out.println(creditCount + "times Credit Operation performed");
		System.out.println(printStatementCount + "times print statement operation performed");	
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