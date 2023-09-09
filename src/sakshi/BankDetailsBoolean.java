package sakshi;

class BankDetailsBoolean{
	
	int balance = 1000;
	
	void debitAmount(int amount){
		if(amount>balance){
			System.out.println("Insufficient balance Rs." + balance + " and you asked for Rs. "+amount);
		}else if(amount<0){
			System.out.println("Invalid amount");
		}
	}
	
	void creditAmount(int amount){
		if(amount>5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		}else if(amount<0){
			System.out.println("Invalid amount");
		}
	}
	
	public static void main(String[] args){
		
		BankDetailsBoolean bankDetailsBoolean = new BankDetailsBoolean();
		bankDetailsBoolean.debitAmount(1100);
		bankDetailsBoolean.debitAmount(-1);	
		bankDetailsBoolean.creditAmount(5100);
		bankDetailsBoolean.creditAmount(-1);	
	}
}