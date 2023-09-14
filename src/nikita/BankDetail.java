package nikita;

class BankDetail{

	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;

void debitAmt(int amt){
	balance=balance-amt;
	debitCount++;
}

void  creditAmt(int amt){
	balance=balance+amt;
	creditCount++;
}

void printStatement(){
	printStatementCount=printStatementCount+1;
	System.out.println("Current balance in the account is= "+balance);
}
	
void printCountInfo(){	
	System.out.println("Debit count is= "+debitCount);
	System.out.println("Credit count is= "+creditCount);
	System.out.println("Statement count is= "+printStatementCount);
	
}

public static void main(String[] args){
	BankDetail bank= new BankDetail();
	bank.debitAmt(100);
	bank.debitAmt(300);
	bank.printStatement();
	bank.debitAmt(100);
	bank.creditAmt(600);
	bank.printStatement();
	bank.creditAmt(400);
	bank.printStatement();
	bank.printCountInfo();
}
	
}
