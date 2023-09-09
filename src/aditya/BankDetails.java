package aditya;
class BankDetails{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printCount;
	
	void DebitAmt(int amt){
	balance= balance-amt;
	debitCount=debitCount+1;
	}
	
	void CreditAmt(int amt){
		balance= balance+amt;
		creditCount=creditCount+1;
	}
	
	void printStatement(){
		printCount=printCount+1;
	}
	
	void printCountInfo(){
		System.out.println("Current Balance :-" +balance);
		System.out.println("Number of times debit performed :- " +debitCount);
		System.out.println("Number of times credit performed :- " +creditCount);
		System.out.println("Number of times print performed: - "+printCount);
	}
	
	public static void main(String[] args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.DebitAmt(100);
		bankdetails.DebitAmt(300);
		bankdetails.printStatement();
		bankdetails.DebitAmt(100);
		bankdetails.CreditAmt(600);
		bankdetails.printStatement();
		bankdetails.CreditAmt(400);
		bankdetails.printCountInfo();
	}

}