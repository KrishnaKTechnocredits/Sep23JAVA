/* Assignment - 6 : 5th Sep'2023

Rewrite yesterday's BankDetails program with following condition.
1. If debitAmt is more than balance, asked amount should not be deducted from balance 
and you should print "Insufficient balance". If amt asked is negative, print "Invalid amount"
2. If user tries to credit more than 5000 in one go, you should print "You can't deposite more 
than 5000 rs in one go" and amount should not be credited in main balance. If credited amount 
is negative, print "Invalid amount".*/

package shamli;

class BankDetails2{
	int balance = 1000;
	
	void debitAmt(int amt){
		if(amt>balance){
			System.out.println("Insufficient balance");
		}
		else if(amt<0){
			System.out.println("Invalid Amount");
		}
		else if(amt<=balance){
		balance=balance-amt;
		System.out.println("Remaining Balance is : " +balance);
		}
	}

	void creditAmt(int amt){
		if(amt>5000){
			System.out.println( "You can't deposite more than 5000 rs in one go");
		}
		else if(amt<0){
			System.out.println("Invalid Amount");
		}
		else{
		balance=balance+amt;
		System.out.println(amt+" is credited to your account and Your current Balance is "+balance);
		}
	}
	
	public static void main(String[] args){
		BankDetails2 bankdetails=new BankDetails2();
		bankdetails.debitAmt(1100);
		bankdetails.debitAmt(-100);
		bankdetails.debitAmt(500);
		bankdetails.creditAmt(10000);
		bankdetails.creditAmt(4000);
	}
}