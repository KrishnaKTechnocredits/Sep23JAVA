package rabish;
//Assignment 12
class Loop1 {
	
	void divisionByLoop(int startRange,int endRange){
		for(int i =startRange;i<=endRange;i++)
			if(i%5==0 && i%3==0)
				System.out.println("Divisible by 5 & 3, numbers are:" + i);
				
		}
	public static void main(String[] args){
		Loop1 loop1=new Loop1();
		loop1.divisionByLoop(5,40);
	}
}