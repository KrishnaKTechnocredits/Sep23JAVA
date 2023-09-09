package denish;

class Assignment17{
	
	void test(int startIndex, int endIndex){
		int count = 1;
		for(int num = endIndex ; num >= startIndex ; num--){
			if(num % 2==0 && num % 3==0){
				if(count>=2 && count<=4){
					System.out.println(num);
				}
				count++;
			}	
		}
	}
	
	public static void main(String[] args){
		Assignment17 assignment17 = new Assignment17();
		assignment17.test(10,100);
	}
}