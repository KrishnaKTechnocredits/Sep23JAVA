//Assignment 5 Bank Details
package yogesh;
class BankDetails{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printCount;
	
	void debitAmt(int amt){
		balance=balance-amt;
		debitCount=debitCount+1;
	}
	
	void creditAmt(int amt){
		balance=balance+amt;
		creditCount=creditCount+1;
	}
	
	void printStatement(){
		printCount=printCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Remaining Balance is Rs  "+balance);
		System.out.println(debitCount+" times debit operations performed");
		System.out.println(creditCount+" times credit operations performed");
		System.out.println(printCount+" times print statement operations performed");
	}

	public static void main(String[] args){
		BankDetails bank=new BankDetails();
		bank.debitAmt(100);
		bank.debitAmt(300);
		bank.printStatement();
		bank.debitAmt(100);
		bank.printStatement();
		bank.creditAmt(600);
		bank.creditAmt(400);
		bank.printCountInfo();
	}
}
