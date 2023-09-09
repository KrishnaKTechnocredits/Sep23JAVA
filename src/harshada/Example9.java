//Assignment - 5 : 4th Sep'2023
//Create a call called BankDetail.
//Instance variable can be,
//balance = 1000
//debitCount
//creditCount
//printStatementCount
//
//1. Method for DebitAmt(int amt), CreditAmt(int amt), printStatement : print current balance, printCountInfo
//2. printCountInfo should print,
//	remaining balance
//	how many times Debit operation performed
//	how many  times Credit operation performed
//	how many  times PrintStatement operation performed
//
//Input : debitAmt(100)
//		debitAmt(300)
//		printStatement()
//		debitAmt(100)
//		creditAmt(600)
//		printStatement()
//		creditAmt(400)
//		printCountInfo() -> remaining balance is 1500 rs, 
//		                    3 times Debit operation performed
//							2 times credit operation performed
//							2 times print statement operation performed
package harshada;
class Example9{
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
		System.out.println("Your current balance is "+ balance);
		printStatementCount=printStatementCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Your remaining is "+ balance);
		System.out.println(debitCount+" times Debit operation performed");
		System.out.println(creditCount+" times credit operation performed");
		System.out.println(printStatementCount+" times print statement operation performed");
	}
	
	public static void main(String[]args){
		Example9 example9=new Example9();
		example9.debitAmt(100);
		example9.debitAmt(300);
	    example9.printStatement();
        example9.debitAmt(100);
        example9.creditAmt(600);
        example9.printStatement();
        example9.creditAmt(400);
        example9.printCountInfo();
	}
}





















