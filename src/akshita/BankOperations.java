package akshita;

class BankOperations{
	int balance=5000;
	
	void debit(int debitAmount){
		if(debitAmount>balance){
			System.out.println("Insufficient balnce");
		}
		else if(debitAmount<0){
			System.out.println("Invalid amount");
		}
        else{
			balance = balance - debitAmount;
            System.out.println("Avialable balance is " + balance);
		}
	}
	
	void credit(int creditAmount){
		if(creditAmount>5000){
			System.out.println("You can't deposite more tha 5000 in one go, ");
		}
		else if(creditAmount<0){
			System.out.println("Invalid amount");
		}
		else{
			balance = balance + creditAmount;
			System.out.println("Avialable balance is " + balance);
		}	
	}
	
	public static void main(String[] args){
		BankOperations bankOperation = new BankOperations();
		bankOperation.debit(6000);
		bankOperation.credit(-10);
    }
}