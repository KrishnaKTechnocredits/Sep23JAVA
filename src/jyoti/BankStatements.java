/* Assignment#5
Assignment - 5 : 4th Sep'2023

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
							2 times print statement operation performed	
*/
//Assignment 5
package jyoti;
class BankStatements
{
		int balance=1000;
		int debitCount;
		int creditCount;
		int printStatementCount;
		
		void debitAmt(int amt){
			balance= balance-amt;
			debitCount=debitCount+1;
			
		}
		void creditAmt(int amt){
			balance = balance+amt;
			creditCount= creditCount+1;
			
		}
		void printStatement(){
			printStatementCount=printStatementCount+1;
		}
		
		void printCountDetails(){
			System.out.println("Remaining balance - Invoice = " + balance);
			System.out.println(debitCount+ "  # times Debit operation performed- Invoice");
			System.out.println(creditCount+ " # times Credit operation performed - Invoice");
			System.out.println(printStatementCount+ "  # times printStatementCount 	 operation performed- Invoice");
			
		}
		
		public static void main(String[] args){
				BankStatements bnkstmnt = new BankStatements();
				bnkstmnt.debitAmt(100);
				bnkstmnt.debitAmt(300);
				bnkstmnt.printStatement();
				bnkstmnt.debitAmt(100);
				bnkstmnt.creditAmt(600);
				bnkstmnt.printStatement();
				bnkstmnt.creditAmt(400);
				bnkstmnt.printCountDetails();
						
		}
}
