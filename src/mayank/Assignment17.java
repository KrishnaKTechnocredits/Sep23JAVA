package mayank;

class Assignment17{
	
	void lastNumbers(int startIndex,int endIndex){
		int count = 1;
	
		System.out.println("Last three numbers Divisible by 2 & 3 are");
		for(int num=endIndex;num>=startIndex;num--){
			if(num%2==0 && num%3==0){
				if(count >= 2&& count <=4){				
					System.out.println(num);
				}if (count==4){
					break;						
				}		
				count++;
			
			}	
		}
	}	
	public static void main(String[] args){
		Assignment17 assignment17 = new Assignment17();
		assignment17.lastNumbers(10,100);
	}
}