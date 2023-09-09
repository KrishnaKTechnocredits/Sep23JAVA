package denish;

class Assignment6{
	
	int balance=1000;
	int total;
	
	void debit(int amt){
		if(amt>balance){
			System.out.println("Insufficient balance");
			
		}else{
			System.out.println("Invalid Amount");
		}
	}
	
	void credit(int amt){
		if(amt>5000){
			System.out.println("You can't deposite more than 5000 rs in one go");
		}
		else if(amt<=5000){
			System.out.println("Your credit amount is "+ amt);
			total = balance + amt;
			System.out.println(total);
		}
		else{
			System.out.println("Invalid Amount");
		}
	}
	
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.debit(1800);
		assignment6.credit(5050);
	}
}