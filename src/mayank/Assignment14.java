package mayank;


class Assignment14{
	
	void lastNumber(int startIndex,int endIndex){
		System.out.println("Last number divisible by 5 & 9 are:");
		for(int num=endIndex;num>=startIndex;num--){
			if(num%5==0 && num%9==0){
				System.out.println(num);
				break;
			}
		}
		
	}
	public static void main(String[] args){
		Assignment14 assignment14 = new Assignment14();
		assignment14.lastNumber(5,100);
	}
}