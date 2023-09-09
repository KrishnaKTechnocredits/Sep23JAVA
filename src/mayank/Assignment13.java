package mayank;
class Assignment13{
	
	void division(int startIndex,int endIndex){
		System.out.println("Number Divisible by 7&13 in reverse order are as:");
		for(int num=endIndex;num>=startIndex;num--){
			if(num%7==0 ){
				System.out.println(num + " is divisible by 7");
			}else if(num%13==0){
				System.out.println(num + " is divisible by 13");
			}
		}
		
	}
	public static void main(String[] args){
		Assignment13 assignment13 = new Assignment13();
		assignment13.division(5,40);
	}
}