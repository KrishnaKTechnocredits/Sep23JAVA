/*Assignment - 6 : 5th Sep'2023

Rewrite yesterday's BankDetails program with following condition.

1. If debitAmt is more than balance, asked amount should not be deducted from balance and you should print "Insufficient balance". If amt asked is negative, print "Invalid amount"

2. If user tries to credit more than 5000 in one go, you should print "You can't deposite more than 5000 rs in one go" and amount should not be credited in main balance. If credited amount is negative, print "Invalid amount".
*/
package jyoti;
class BankDetailsConditional//Assignment 6
{
		int balance=1000;
				
		void debitAmt(int amt){
			if (amt >balance){
				System.out.println(" You have insufficient balance " + balance + " and is the current balance and you can't debit : " +amt);
			}
			else if (amt<0){
				System.out.println("Please check the amount : " + amt);
			}
			else{
			balance= balance-amt;
			System.out.println("You have credited successfully : " + balance);
			}
			
		}
		void creditAmt(int amt){
			if (amt > balance){
			System.out.println("You can't deposite more than 5000 rs in one go : " + amt);
			}
			else if (amt<0){
				System.out.println("Please check the amount : " + amt);
			}
			else{
			balance = balance+amt;
			System.out.println("You have credited successfully : " + balance);
			}
		}
		public static void main(String[] args){
				BankDetailsConditional bnkstmnt = new BankDetailsConditional();
				bnkstmnt.debitAmt(6000);
				bnkstmnt.debitAmt(100);
				bnkstmnt.debitAmt(-300);
				bnkstmnt.debitAmt(100);
				bnkstmnt.creditAmt(600);
				bnkstmnt.creditAmt(6000);
				bnkstmnt.creditAmt(-400);
		}
}
