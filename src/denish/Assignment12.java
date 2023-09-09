package denish;

class Assignment12{
	
	void division(int startIndex, int endIndex){
		System.out.println("Division of 3 and 5 Number");
		
		for(int index = startIndex ; index <= endIndex ; index++){
			if(index % 5==0 && index % 3==0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args){
		Assignment12 assignment12 = new Assignment12();
		assignment12.division(5,40);
	}
}