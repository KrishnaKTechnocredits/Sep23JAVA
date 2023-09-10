package swati;

//ASSIGNMENT 6
class BankDetails2{
	
	int balance=1000;
	
	void debitAmount(int amount){
		if(amount<0){
			System.out.println("Invalid amount " + amount);
		}else if(amount>balance){
			System.out.println("Insufficient balance to perform debit operation, your balance is Rs" +balance);
		}else if(amount<=balance){
			balance = balance-amount;
			System.out.println(amount+" Rs is debited successfully,your current balance is Rs"+ balance);
		}
	}
	
	void creditAmount(int amount){
		if(amount<0){
			System.out.println("Invalid amount" + amount);
		}else if(amount>5000){
			System.out.println("You cannot deposit more than 5000 in one go");
		}else {
			balance = balance+amount;
			System.out.println(amount +" Rs is credited successfully, your current balance is Rs "+ balance );
		}
	} 
	
	public static void main(String[] args){
		BankDetails2 bankdetails2 = new BankDetails2();
		bankdetails2.debitAmount(200);
		bankdetails2.debitAmount(-200);
		bankdetails2.creditAmount(2500);
		bankdetails2.creditAmount(-2500);
	}
}