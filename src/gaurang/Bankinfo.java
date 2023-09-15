package gaurang;

class Bankinfo{
	
	int balance = 50000;
	
	void debitAmt(int amt){
		
		if(balance >= amt){
			balance = balance - amt;
			System.out.println("After debit of "+amt+" Total balance is " + balance);
		}
		else
			System.out.println("Balance is insufficient");
	}
	
	void creditAmt(int amt){
		if(amt<=5000){
			balance = balance + amt;
			System.out.println("After credit of "+amt+" Total balance is " + balance);
		}else{
			System.out.println("Can not credit more than 5000 in one go");
		}
	}
	
	
	
	public static void main (String[] args){
		Bankinfo bankinfo = new Bankinfo();
		System.out.println("Initial balance is " + bankinfo.balance);
		bankinfo.debitAmt(10000); 
		bankinfo.creditAmt(4000);
		bankinfo.creditAmt(10000);
		bankinfo.debitAmt(60000);
		bankinfo.debitAmt(40000);
		bankinfo.creditAmt(3000);
	}
}