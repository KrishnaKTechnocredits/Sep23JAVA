package aditya;
class Assigment9{

	void DivisibleBy(int Num){
		if(Num%3 == 0 && Num%5 == 0){
			System.out.println(" Number is Disvible by 3 and 5:- " +Num);
		}
		else if(Num%3==0 || Num%5==0){
			System.out.println();
				if(Num%3==0){
					System.out.println("Number is Divsible by 3 is:- " +Num);
				} 
				if(Num%5==0){
				System.out.println("Number is divisble by 5 is:- " +Num);
				}
		}
		if(Num%3!=0 && Num%5!=0){
			System.out.println(" Number is NOT Disvible by 3 and 5:- " +Num);
		}
	}
	
	public static void main(String[] args){
		Assigment9 assignment9 = new Assigment9();
		assignment9.DivisibleBy(15);
		assignment9.DivisibleBy(16);
		assignment9.DivisibleBy(9);
		assignment9.DivisibleBy(25);
	}

}