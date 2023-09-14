package akash;

class Even{
	
	void findEvenNum(int startIndex, int endIndex){
		System.out.println("Even numbers are: ");
		for(int num=startIndex;num<=endIndex;num++){
			if(num%2==0)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		Even even = new Even();
		even.findEvenNum(10,15);
	}
}