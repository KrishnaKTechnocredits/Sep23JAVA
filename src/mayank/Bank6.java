package mayank;

class Bank6{
	int balance = 1000;
	
	void debitAmt(int amt){
		if(amt>balance){
			System.out.println("Insufficient Balance You only have " + balance );
		}else if (amt<0){
			System.out.println("Invalid Amount");
		}else if(amt>0 && amt<balance){
			balance = balance - amt;
		}
	}
	
	void creditAmt(int amt){
		if(amt>5000){
			System.out.println("You can't  deposit more than 5000 rs" );
		}else if (amt<0){
			System.out.println("Invalid Amount");
		}else if (amt>0 && amt<5000){
			balance = balance + amt;
		} 	
	}
	
	public static void main(String[] args){
		Bank6 bank6 = new Bank6();
		bank6.debitAmt(2000);
		bank6.debitAmt(-10);
		bank6.creditAmt(6000);
		bank6.creditAmt(60);
		bank6.creditAmt(-100);
		System.out.println("Available balance is" + bank6.balance);
	}
}
