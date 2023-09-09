//Assigment 6
package yogesh;
class Bankcon{
	
	int balance=1000;
	
	void debitAmt(int amt){
		if(amt>balance)
			System.out.println("Insufficient balance");
		else if(amt<0)
			System.out.println("Invalied Amount");
		else
			balance=balance-amt;
	}
	
	void creditAmt(int amt){
		if(amt>5000)
			System.out.println("You cant deposit more than 5000rs at a time");
		else if(amt<0)
			System.out.println("Amount cant be negative");
		else
			balance=balance+amt;
	}
	void printBal(){
		System.out.println("balance is "+balance);
	}
	
	public static void main(String[] args){
		Bankcon bank=new Bankcon();
		bank.debitAmt(2000);
		bank.debitAmt(-500);
		bank.debitAmt(500);
		bank.printBal();
		bank.creditAmt(6000);
		bank.creditAmt(-100);
		bank.creditAmt(1000);
		bank.printBal();
	}
			

}
