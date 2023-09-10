package rabish;
class BankCondition {

	int balance=1000;
	
	void debitAmt(int amt){
		if(amt>balance){
			System.out.println("Insufficient balance");
		}
		else if(amt<0){
			System.out.println("Invalid amount");
		
		}
	}
		void creditAmt(int amt){
			if(amt>=5000){
				System.out.println("You can't deposite more than 5000 rs in one go");
			}
	}
	public static void main(String[] args){
		BankCondition bank= new BankCondition();
		bank.debitAmt(1500);
		bank.creditAmt(5000);
		bank.debitAmt(-1000);
	}
}