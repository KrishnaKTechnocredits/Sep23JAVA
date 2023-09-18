/* Assignment - 5 : 4th Sep'2023 
Create a call called BankDetail. Instance variable can be,
balance = 1000
debitCount, creditCount, printStatementCount

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
		printCountInfo() -> remaining balance is 1500 rs,  3 times Debit operation performed2 times credit operation performed2 times print statement operation performed */

package mahesh;

class Assignment5BankDetails {

	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;

	void debitAmount(int amount) {
		balance = balance - amount;
		debitCount = debitCount + 1;
	}

	void creditAmount(int amount) {
		balance = balance + amount;
		creditCount = creditCount + 1;
	}

	void printStatement() {
		printStatementCount = printStatementCount + 1;
	}

	void printCountInfo() {
		System.out.println("The remaining balance is Rs. " + balance);
		System.out.println(debitCount + " times Debit operation performed.");
		System.out.println(creditCount + " times Debit operation performed.");
		System.out.println(printStatementCount + " times print statement operation performed.");
	}

	public static void main(String[] args) {

		Assignment5BankDetails bankDetails = new Assignment5BankDetails();
		bankDetails.debitAmount(100);
		bankDetails.debitAmount(300);
		bankDetails.printStatement();
		bankDetails.debitAmount(100);
		bankDetails.creditAmount(600);
		bankDetails.printStatement();
		bankDetails.creditAmount(400);
		bankDetails.printCountInfo();

	}

}
