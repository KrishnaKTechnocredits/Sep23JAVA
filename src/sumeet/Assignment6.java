package sumeet;

class Assignment6{
	int balance=1000;
	
	void debit(int amt){
		if(amt<0){
			System.out.println("Invalid input");
		}else if(amt<=balance){
			balance =balance-amt;
			System.out.println("Ammot Debited is Rs"+ amt);
			System.out.println("Balance is Rs"+ balance);
		}else if(amt>balance){
			System.out.println("Insufficient Balance");
		}
	}
	
	void credit(int amt){
		if(amt<0){
			System.out.println("Invalid input");
		}else if(amt<5000){
			balance =balance+amt;
			System.out.println("Ammot Credit is Rs"+ amt);
			System.out.println("Balance is Rs"+ balance);
		}else if(amt>5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		}
	}
	
	public static void main(String[] args){
		Assignment6 bank= new Assignment6();
		bank.debit(300);
		bank.debit(800);
		bank.credit(-100);
		bank.credit(5001);
		bank.credit(2000);		
	}
}