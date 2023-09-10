package rabish;
class Assignment17{

	void proccessData(int startRange, int endRange){
		int count = 1;
		int temp = 1;
		for(int i=endRange;i>=startRange;i--){
			if(i%2==0 && i%3==0){
				if(count>=2){
					System.out.println(i);
					if(temp==3)
						break;
					temp++;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
	Assignment17 data = new Assignment17();
	data.proccessData(10,100);
	}
}