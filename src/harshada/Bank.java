package harshada;

class Bank{
	int balance=1000;
	
	void debitAmt(int amt){
		balance=balance-amt;
	}
	
	void crediAmt(int amt){
		balance=balance+amt;
	}
	
	void displayInfo(){
		System.out.println("Balance is "+ balance);
	}
	
	public static void main(String[]args){
		Bank bank=new Bank();
		bank.debitAmt(200);
		bank.crediAmt(500);
		bank.crediAmt(200);
		bank.debitAmt(700);
		bank.displayInfo();
	}
}