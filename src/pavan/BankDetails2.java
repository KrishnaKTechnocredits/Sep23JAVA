package pavan;
//Assi 6
class BankDetails2{
	int balance=1000;
	
	void debitAmt(int amt){
		if (amt<0){
			System.out.println("Invalid amount "+amt);
		}
		
		else if (amt>balance){
			System.out.println("Insufficient Balance "+balance);
		}
		
		else if(amt<=balance){
			balance = balance - amt;
			System.out.println(balance+" Amount debeitted");
		}
	}
	
	void credAmt(int amt){
		if (amt<=0){
			System.out.println("Invalid Amount " +amt);
		}
		
		else if(amt >5000){
			System.out.println("you can not deposite more than 5000rs in one go to that is : " +amt);
		}
		
		else if (amt <=5000){
			balance = balance + amt;
			System.out.println("credited amount is " +amt);
		}
	}
	
	public static void main (String[] args){
		BankDetails2 bankDetails2 = new BankDetails2();
		bankDetails2.debitAmt(200);
		bankDetails2.debitAmt(-100);
		bankDetails2.credAmt(6000);
		bankDetails2.credAmt(-500);
	}
}
	