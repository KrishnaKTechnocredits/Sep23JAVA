package akash;

class DivByTwoNThree{
	
	void findNumbers(int startRange, int endRange){
		int count=0;
		for(int num=endRange;num>=startRange;num--){
			if(num%2==0 && num%3==0){	
				count++;
				if(count>=2 && count<=4){
					System.out.println(num);
					if(count==5)
						break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		DivByTwoNThree divbytwonthree = new DivByTwoNThree();
		divbytwonthree.findNumbers(10,100);
	}
}