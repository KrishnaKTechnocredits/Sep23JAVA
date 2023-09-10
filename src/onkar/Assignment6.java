package onkar;

class Assignment6{
	
	int balance = 1000;
	
	void debitAmt(int amt){
		if(amt<0){
			System.out.println("Invalid Amount");
		}else if(amt>balance){
			System.out.println("Insufficient balance");
		}else if (amt>0 && amt<balance){
			balance = balance - amt;	
		}
	}
	
	void creditAmt(int amt){
		if (amt>5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		}else if (amt<0){
			System.out.println("Invalid credit amount");
		}else if (amt>0 && amt<5000){
			balance = balance + amt;
		}
	}
	
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.creditAmt(6000);
		assignment6.debitAmt(1200);
		assignment6.creditAmt(-120);
		assignment6.debitAmt(-100);
		assignment6.creditAmt(1500);
		assignment6.debitAmt(2700);
		assignment6.debitAmt(1200);
		System.out.println("Available balance is "+assignment6.balance);
	}
}