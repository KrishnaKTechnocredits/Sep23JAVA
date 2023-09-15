package mohit;


class Numbers2{
	
	void processData(int startIndex, int endIndex){
		for(int num=endIndex;endIndex>=startIndex;num--){
			if(num%7==0 || num%13==0){
				System.out.println(num + "is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args){
		Numbers2 numbers2 = new Numbers2();
		numbers2.processData(5, 40);
	}
}
		