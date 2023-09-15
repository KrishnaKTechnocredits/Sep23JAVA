/*Assignment - 5 : 4th Sep'2023

Create a call called BankDetail.
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
package deepak;
class Assignment5_BankDetails{
	int balance = 1000;
	int debitCount, creditCount, printCount;
	
	void debitAmt(int amt){
		balance = balance - amt;
		debitCount = debitCount + 1;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount = creditCount + 1;
	}
	
	void printBalance(){
		System.out.println("Available Balance in Bank Account: "+balance);
		printCount = printCount + 1;
	}
	
	void printCountInfo(){
		System.out.println("Remaining balance is: "+balance);
		System.out.println(debitCount+" time/times debit operation performed.");
		System.out.println(creditCount+" time/times credit operation performed.");
		System.out.println(printCount+" time/times balance print operation performed.");
	}
	
	public static void main(String[] args){
		Assignment5_BankDetails bankDetails = new Assignment5_BankDetails();
		bankDetails.debitAmt(100);
		bankDetails.debitAmt(300);
		bankDetails.printBalance();
		bankDetails.debitAmt(100);
		bankDetails.creditAmt(600);
		bankDetails.printBalance();
		bankDetails.creditAmt(400);
		bankDetails.printCountInfo();		
	}
}