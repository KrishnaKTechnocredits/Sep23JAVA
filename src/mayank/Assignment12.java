package mayank;
class Assignment12{
	void twoNumbers(int startIndex,int endIndex){
		System.out.println("The numbers divisible by 5 and 3 from range  5 to 40");
		for(int num=startIndex;num<=endIndex;num++){
			if(num%3==0 && num%5==0){
				System.out.println(num);
			}
		}
		
	}
	public static void main(String[] args){
		Assignment12 assignment12 = new Assignment12();
		assignment12.twoNumbers(5,40);
	}
	

}