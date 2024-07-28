package vijay;

class Hw5{
	
	void test(int num){
		if (num%3==0 || num%5==0){
			if(num%3==0 && num%5==0){
				System.out.println(num + " is divisible by both");
			}else if(num%3==0){
				System.out.println(num + " is divisible by 3");
			}else if(num%5==0){
				System.out.println(num + " is divisible by 5");
			}
		}
	}
	
	public static void main (String [] args){
		Hw5 hw5 = new Hw5();
		hw5.test(5);
	}
}