/*
 Assignment 1
class name should be Bank..
WAP to perform bank operations

int balance=1000;
Assignment 1:
1) debitAmt()
2) creditAmt()
3) printBalance()

Input : debitAmt() -> 200
        creditAmt() -> 500
		creditAmt() -> 200
		debitAmt() -> 700
		printBalance() -> 800

 */

package nivedita;
class A1Bank{
	int balance=1000;
	
	void debitAmt(int Amt){
	balance = balance-Amt;
	}
	
	void creditAmt(int Amt){
	balance = balance+Amt;
	}
	
	void printBalance(){
	System.out.println("Final Balance is Rs " + balance);
	}
	
	public static void main (String [] args){
	A1Bank bank = new A1Bank();
	bank.debitAmt(200);
	bank.creditAmt(500);
	bank.creditAmt(200);
	bank.debitAmt(700);
	bank.printBalance();
	}
	
}