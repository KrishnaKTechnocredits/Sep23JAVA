package akash;

class Divisible{
	
	void findDivision(int startIndex, int endindex){
		System.out.println("Numbers which are divisible by 3 & 5 are: ");
		for(int num=startIndex;num<=endindex;num++){
			if(num%3==0 && num%5==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		Divisible divisible = new Divisible();
		divisible.findDivision(5,40);
	}
}