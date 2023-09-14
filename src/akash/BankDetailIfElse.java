package akash;

class BankDetailIfElse{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		if(amt>balance){
			System.out.println("Insufficient balance");
		}else if(amt<=0){
			System.out.println("Invalid amount");
		}
	}
	
	void creditAmt(int amt){
		if(amt > 5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		}else if(amt<0){
			System.out.println("Invalid amount");
		}
	}
	
	public static void main(String[] args){
		BankDetailIfElse bankdetailifelse = new BankDetailIfElse();
		bankdetailifelse.debitAmt(5000);
		bankdetailifelse.creditAmt(6000);
		bankdetailifelse.creditAmt(-1);
		bankdetailifelse.debitAmt(0);
	}
}