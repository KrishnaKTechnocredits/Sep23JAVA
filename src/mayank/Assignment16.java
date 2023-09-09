package mayank;
class Assignment16{
	void firstThreeNumbers(int startIndex,int endIndex){
		int count=0;
		System.out.println("First three numbers Divisible by 5&10 are");
		for(int num=startIndex;num<=endIndex;num++){
			if(num%3==0 && num%4==0){
				System.out.println(num);
				count=count+1;
				if (count==3){
					break;
				}
				
			}
		}	
		
	}
	public static void main(String[] args){
		Assignment16 assignment16 = new Assignment16();
		assignment16.firstThreeNumbers(10,100);
	}
}