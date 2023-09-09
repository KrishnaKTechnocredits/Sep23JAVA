package subramanium;

class BankDetails{
	int balance=5000;
	
	void debit(int amount){
		if(amount<=balance && amount>0){
		balance=balance-amount;
		System.out.println(amount+" debited from account, Available balance is"+balance);
		}
		else if(amount<0){
		System.out.println("Invalid Entry. Enter valid amount");
		}
		else if(amount>balance){
		System.out.println("Insufficient fund in the account");
		}
	}	
		
	void credit(int amount){
		if(amount<=25000 && amount>0){
		balance=balance+amount;
		System.out.println(amount+" credited on account, Available balance is"+balance);
		}
		else if(amount<0){
		System.out.println("Invalid Entry. Enter valid amount");
		}
		else if(amount>25000){
		System.out.println("Deposit amount is "+amount+" You cannot deposit more than 25000 in one day");
		}
	}
	
	void currentBalance(){
		System.out.println("Current Balance is "+balance);
		}
		
	public static void main(String []args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.debit(2000);
		bankdetails.debit(-20);
		bankdetails.debit(5000);
		bankdetails.credit(10000);
		bankdetails.credit(-2500);
		bankdetails.credit(60000);
		bankdetails.currentBalance();
		}
	}