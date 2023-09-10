package naresh;

class BankDetail2{
	int balance=1000;

	
	void DebitAmt(int amt){
		if (amt > balance)
			System.out.println("insufficent balance");
			
		else if (amt<0)
			System.out.println("Invalid amount");
		
		else
			balance -=amt;	
		}
		
	
	void CreditAmt(int amt){	
		if (amt <5000)
			System.out.println("You can't deposite more than 5000 rs in one go");
		else if (amt < 0)
			System.out.println(" Invalid amount");
		else if (amt > 5000)
			balance +=amt;		
		}
		
	void printStatement(){
		System.out.println(balance+ " is Available balance");
		}
	
	public static void main(String[] args){
	
		BankDetail2 bankDetail=new BankDetail2();
	
		bankDetail.DebitAmt(1200);
		bankDetail.DebitAmt(-100);
		bankDetail.printStatement();
		bankDetail.CreditAmt(5000);
		bankDetail.CreditAmt(-100);
		bankDetail.printStatement();

		}
	}