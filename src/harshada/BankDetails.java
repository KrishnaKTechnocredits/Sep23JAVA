//Assignment - 6 : 5th Sep'2023
//
//Rewrite yesterday's BankDetails program with following condition.
//
//1. If debitAmt is more than balance, asked amount should not be deducted from balance 
//and you should print "Insufficient balance". If amt asked is negative, print "Invalid amount"
//
//2. If user tries to credit more than 5000 in one go, you should print "You can't deposite more than 5000 rs
// in one go" and amount should not be credited in main balance. If credited amount is negative, print "Invalid amount".
package harshada;
class BankDetails{
	int balance=1000;
	
	void debitAmt(int amt){
		if(amt>balance){
			System.out.println("Insufficient Balance");
		}
		else if(amt<0){
			System.out.println("Invalid amount");
		}
		else{
			balance=balance-amt;
		}
	}
	
	void creditAmt(int amt){
		if(amt>=5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		}
		else if(amt<0){
			System.out.println("Invalid amount");
		}
		else{
			balance=balance+amt;
		}
	}
	
	void displayInfo(){
		System.out.println("Balance is "+ balance);
	}
	
	public static void main(String[]args){
		BankDetails bankDetails=new BankDetails();
		bankDetails.debitAmt(2000);
		bankDetails.debitAmt(-100);
        bankDetails.debitAmt(100);
		bankDetails.displayInfo();
        bankDetails.creditAmt(5000);
        bankDetails.creditAmt(-400);
		bankDetails.creditAmt(400);
		bankDetails.displayInfo();
	}
}