/*Rewrite yesterday's BankDetails program with following condition.

1. If debitAmt is more than balance, asked amount should not be deducted from balance and you should print "Insufficient balance". 
If amt asked is negative, print "Invalid amount"

2. If user tries to credit more than 5000 in one go, you should print "You can't deposite more than 5000 rs in one go" 
and amount should not be credited in main balance. If credited amount is negative, print "Invalid amount".
*/
/*Rewrite yesterday's BankDetails program with following condition.
1. If debitAmt is more than balance, asked amount should not be deducted from balance and you should print "Insufficient balance". 
If amt asked is negative, print "Invalid amount"

2. If user tries to credit more than 5000 in one go, you should print "You can't deposite more than 5000 rs in one go" 
and amount should not be credited in main balance. If credited amount is negative, print "Invalid amount".
*/

//Assignment 6
package roshani;

class BankDetail1{
	int balance=2000;

	void debitAmt(int amount){	
		if(amount > balance){
			System.out.println("Insufficient balance: " + amount);
		}else if(amount<0){
			System.out.println("Invalid amount entry: " + amount);
		}else{
			balance = balance - amount;
			System.out.println("Amount debited: " + amount + ". Now available balance is:" + balance);
		}
	}
	
	void creditAmt(int amount){
		if(amount>5000){
			System.out.println("You can't deposite more than 5000 rs in one go that is:" + amount);
		}else if (amount<0){
			System.out.println("Invalid amount entry: " + amount);
		}else{
			balance = balance + amount;
			System.out.println("Amout credited: " + amount);
		}	
	}
		
	void currentBalance(){
		System.out.println("Current Balance is: " + balance);
	}
	
	public static void main(String[] args){
		BankDetail1 bankdetail1 = new BankDetail1();
		bankdetail1.debitAmt(100);
		bankdetail1.debitAmt(-100);
		bankdetail1.debitAmt(2100);
		bankdetail1.creditAmt(600);
		bankdetail1.creditAmt(5500);
		bankdetail1.creditAmt(100);
		bankdetail1.currentBalance();
	}
}