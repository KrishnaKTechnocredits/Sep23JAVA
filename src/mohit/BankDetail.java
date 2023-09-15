/*Assignment - 5 : 4th Sep'2023

Create a call called BankDetail.
Instance variable can be,
balance = 1000
debitCount
creditCount
printStatementCount

?*1. Method for DebitAmt(int amt), CreditAmt(int amt), printStatement : print current balance, printCountInfo
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
							2 times print statement operation performed	
*/
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