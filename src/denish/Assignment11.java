package denish;

class Assignment11{
	
	void evenNum(int startRange, int endRange){
		System.out.println("Even Number Is");
		
		for(int index=startRange ; index<= endRange; index++){
			if(index%2==0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args){
		Assignment11 assignment11 = new Assignment11();
		assignment11.evenNum(10,15);
	}
}