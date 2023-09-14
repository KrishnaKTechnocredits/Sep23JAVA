package jagrati;

//Assignment - 5 : 4th Sep'2023

//Create a call called BankDetail.
//Instance variable can be,
//balance = 1000
//debitCount
//creditCount
//printStatementCount

//1. Method for DebitAmt(int amt), CreditAmt(int amt), printStatement : print current balance, printCountInfo
//2. printCountInfo should print,
	//remaining balance
	//how many times Debit operation performed
	//how many  times Credit operation performed
	//how many  times PrintStatement operation performed

//Input : debitAmt(100)
	//	debitAmt(300)
		//printStatement()
		//debitAmt(100)
		//creditAmt(600)
		//printStatement()
		//creditAmt(400)
		//printCountInfo() -> remaining balance is 1500 rs, 
		  //                  3 times Debit operation performed
			//				2 times credit operation performed
				//			2 times print statement operation performed	
							
							
class BankDetail{
	int balance = 1000;
    int debitCount;
    int creditCount;
    int printStatementCount;
	
	
	void debitAmount(int amt){
		balance = balance - amt;
		debitCount = debitCount + 1;
	}
	
	void creditAmount(int amt){
		balance = balance + amt;
		creditCount = creditCount + 1;
	}
	
	void printStatement(){
		printStatementCount = printStatementCount + 1;
	}
	
	void printCountInfo(){
		System.out.println("Remaining balance statement =" + balance);
		System.out.println("Debit operation performed =" + debitCount);
		System.out.println("Credit operation performed =" + creditCount);
		System.out.println("Print Statment operation performed =" + printStatementCount);
	}
	
	public static void main(String [] args){
		BankDetail bankDetails = new BankDetail();
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
					