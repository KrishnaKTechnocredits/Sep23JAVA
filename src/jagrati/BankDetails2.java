package jagrati;

//Rewrite yesterday's BankDetails program with following condition.

class BankDetails2{
	int balance = 1000;
	
	void bankDetails(int debitAmt){
		if(debitAmt > balance ){
			System.out.println("Insufficient balance");
		}else if (debitAmt < 0) {
			System.out.println("Invalid amount");
		}
	}
	
	void creditDetails(int creditAmt){
		if (creditAmt > 5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		}else if (creditAmt < 0){
			System.out.println("invalid amount");
		}
	}
	
	public static void main(String [] args){
		BankDetails2 bank = new BankDetails2();
		System.out.println("---- First method Out put----");
		bank.bankDetails(1200);
		bank.bankDetails(-1200);
		System.out.println("----Second Method Out put ----");
		bank.creditDetails(8000);
		bank.creditDetails(-2000);
	}
}