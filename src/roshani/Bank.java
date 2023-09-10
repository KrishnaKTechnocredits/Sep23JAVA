//WAP to perform bank operation

package roshani;

class Bank{
	int balance=1000;
	
	void debitAmout(int amount){
		balance = balance - amount;
	}
	
	void creditAmout(int amount){
		balance = balance + amount;
	}
	
	void printBalance(){
		System.out.println("Total balance is: "+balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmout(200);
		bank.creditAmout(500);
		bank.creditAmout(200);
		bank.debitAmout(700);
		bank.printBalance();
	}
}