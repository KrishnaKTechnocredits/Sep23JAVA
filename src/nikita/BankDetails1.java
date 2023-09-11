package nikita;

class BankDetails1{
	
	int balance=10000;

void debitAmt(int amt){
	if(amt>balance){
		System.out.println("Insufficient balance");
	}
	else if(amt<0){
		System.out.println("Invalid amount");
		}
	else
		balance=balance-amt;
		System.out.println("The balance in account is ="+balance);
}

void creditAmt(int amt){
	 if(amt>=5000){
		System.out.println("You can't deposite more than 5000 rs in one go");
	 }
	else if(amt<0){
		System.out.println("Invalid amount");
	}
	else
		balance=balance+amt;
		System.out.println("The balance in account is ="+balance);
	 }

public static void main(String[] args){
	BankDetails1 bank= new BankDetails1();
	bank.debitAmt(-2000);
	bank.creditAmt(6000);
	bank.debitAmt(11000);
}
}