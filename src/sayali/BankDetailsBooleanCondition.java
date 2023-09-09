//WAP to check the boolean conditions for Credit amount operation & Debit amount operation in a bank account.

package sayali;

class BankDetailsBooleanCondition{
	
	int balance = 1000;
	
	void debitAmount(int amount){
		if(amount>balance){
			System.out.println("Insufficient balance " + balance);
		}else if(amount<0){
			System.out.println("Invalid amount " + amount);			
		}else if(amount<=balance){
			balance = balance - amount;
			System.out.println(balance+ " Amount Debited successfully");
		}
	}
	
	void creditAmount(int amount){
		if (amount>5000){
			System.out.println("You can't deposit more than 5000 Rs. in one go. Your entered amount is Rs. :  " + amount);			
		}else if(amount<0){
			System.out.println("Invalid amount " + amount);	
		}else if(amount>0 && amount<5000){
			balance = balance + amount;
			System.out.println("Credited amount is : " + amount);
		}
	}
	
	public static void main(String[] args){
		BankDetailsBooleanCondition bankDetails = new BankDetailsBooleanCondition();
		bankDetails.creditAmount(6000);
		bankDetails.debitAmount(100);
		bankDetails.creditAmount(-600);
		bankDetails.debitAmount(-300);
		bankDetails.creditAmount(1200);
		bankDetails.creditAmount(1400);
		System.out.println("Available balance is " +bankDetails.balance);
	}
}