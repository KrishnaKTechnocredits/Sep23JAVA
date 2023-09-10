/*Create a call called BankDetail.
Instance variable can be,
balance = 1000
debitCount
creditCount
printStatementCount

1. Method for DebitAmt(int amt), CreditAmt(int amt), printStatement : print current balance, printCountInfo
2. printCountInfo should print,
	remaining balance
	how many times Debit operation performed
	how many  times Credit operation performed
	how many  times PrintStatement operation performed

Input : debitAmt(100)
		debitAmt(300)
		printStatement()
		debitAmt(100)
		creditAmt(600)
		printStatement()
		creditAmt(400)
		printCountInfo() -> remaining balance is 1500 rs, 
		                    3 times Debit operation performed
							2 times credit operation performed
							2 times print statement operation performed*/
package roshani;

class BankDetail{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amount){
		balance = balance - amount;
		debitCount = debitCount + 1;
	}
	
	void creditAmt(int amount){
		balance = balance + amount;
		creditCount = creditCount + 1;
	}
		
	void printStatement(){
		System.out.println("Remaining balance is: " + balance);
		printStatementCount = printStatementCount + 1;
	}
	
	void printCountInfo(){
		System.out.println("Current Balance is: " + balance);
		System.out.println(debitCount + " times Debit operation is performed");
		System.out.println(creditCount + " times Credit operation is performed");
		System.out.println(printStatementCount + " times Print Statement operation is performed");
	}
	
	public static void main(String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmt(100);
		bankdetail.debitAmt(300);
		bankdetail.printStatement();
		bankdetail.debitAmt(100);
		bankdetail.creditAmt(600);
		bankdetail.printStatement();
		bankdetail.creditAmt(400);
		bankdetail.printCountInfo();
	}
}