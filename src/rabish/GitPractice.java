package rabish;
class GitPractice {
	int balance=1000;
	
	void debitAmt(int amt){
		balance=balance-amt;
	}
	void creditAmt(int amt){
		balance=balance+amt;
	}
	void printBalance(){
		System.out.println("Account Balance= " + balance);
	}
	public static void main (String[] args){		
		GitPractice bank = new GitPractice();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(200);	
		bank.debitAmt(700);
		bank.printBalance();
	}
}
