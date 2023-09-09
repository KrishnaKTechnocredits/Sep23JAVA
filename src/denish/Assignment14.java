package denish;

class Assignment14{
	
	void test(int startIndex, int endIndex){
		for(int index = endIndex ; index >= startIndex ; index--){
			if(index % 5==0 && index % 9==0){
				System.out.println("Last Number is Division by 5 and 9 is "+index);
				break;
			}	
		}
	}
	
	public static void main(String[] args){
		Assignment14 assignment14 = new Assignment14();
		assignment14.test(5,100);
	}
}