/*Assignment 3.2:WAP to perform bank operations
int balance=1000;
1) debitAmt()
2) creditAmt()
3) printBalance()
Input : debitAmt() -> 200
        creditAmt() -> 500
		creditAmt() -> 200
		debitAmt() -> 700
		printBalance() -> 800*/

package mahesh;		

class Bank1{
	int balance=1000;
	
	void debitAmt(int amt){
		balance=balance-amt;
	}
	
	void creditAmt(int amt){
		balance=balance+amt;
	}
	
	void printBalance(){
		System.out.println("Balance is : " + balance);
	}
	
	public static void main(String[] args){
		Bank1 bank=new Bank1();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(200);
		bank.debitAmt(700);
		bank.printBalance();
	}
}