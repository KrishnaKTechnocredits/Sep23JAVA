package vishal;

class BankDetailsIfElse{
	
	int balance=1000;
	
	void debitAmount(int amount)
	{
		if(amount>balance)
		{
			System.out.println("Unsufficient balance"+ " --> Balance is rs :=" + balance + " and you Entered Amount rs:= " + amount);
		}
		else if (amount<0)
		{
			System.out.println("Invalid amount");
		}
	}
	
	void creditAmount(int amount)
	{
		if(amount>5000)
		{
			System.out.println("Cant deposit more than 5000 rs at one time");
		}
		else if (amount<0)
		{
			System.out.println("Invalid amount");
		}
	}

	public static void main(String[] arg)
	{
		BankDetailsIfElse bankDetailsIfElse = new BankDetailsIfElse();
		bankDetailsIfElse.debitAmount(1111);
		bankDetailsIfElse.debitAmount(-1);
		bankDetailsIfElse.creditAmount(5555);
		bankDetailsIfElse.creditAmount(-1000);
	}
}
