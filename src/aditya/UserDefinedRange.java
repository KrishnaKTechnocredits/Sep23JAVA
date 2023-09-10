package aditya;
class UserDefinedRange{
	
	void controlledLoop(int startIndex, int EndIndex){
		for(int num=startIndex; num<=EndIndex; num++){
			if(num%5==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[]args){
		UserDefinedRange userdefinedrange = new UserDefinedRange();
		userdefinedrange.controlledLoop(150,200);
	}
		
}