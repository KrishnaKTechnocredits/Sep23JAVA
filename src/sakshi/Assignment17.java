package sakshi;

class Assignment17{

	void getLastthreeNum(int startRange, int endRange){
		int count=1;
		System.out.println("The number which is diviible by 2 & 3 are: ");
		for(int num=endRange; num>=startRange; num--){
			if(num%2==0 && num%3==0){
				if(count>=2 && count<=4){
					System.out.println(num);
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Assignment17 assignment = new Assignment17();
		assignment.getLastthreeNum(10, 100);
	}
}