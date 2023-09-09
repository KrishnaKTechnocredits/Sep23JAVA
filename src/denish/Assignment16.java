package denish;

class Assignment16{
	
	void division(int startIndex, int endIndex){
		int count = 0;
		System.out.println("First 3 number divisible by 3 and 4 is :");
		
		for(int index = startIndex ; index <= endIndex ; index++){
			if(index % 3==0 && index % 4==0){
				count= count+1;
				if(count<=3)
					System.out.println(index);
			}
		}
	}
	
	public static void main(String[] Args){
		Assignment16 assignment16 = new Assignment16();
		assignment16.division(10,500);
	}
}