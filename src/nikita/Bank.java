package nikita;

class Bank{
	int balance=1000;
	
	void debitleg(int amt){
		balance= balance-amt;
	}
	
	void creditleg(int amt){
		balance=balance+amt;
	}
		
	void printbalance(){
		System.out.println("The total balace is =" +balance);
	}
	
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.debitleg(200);
		bank.creditleg(500);
		bank.creditleg(200);
		bank.debitleg(700);
		bank.printbalance();
		}	
}