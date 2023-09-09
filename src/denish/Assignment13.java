package denish;

class Assignment13{
	
	void process(int startIndex, int endIndex){
		for(int index = endIndex ; index >= startIndex ; index--){
			if(index % 7==0)
				System.out.println(index+ " is devision by 7");
			else if(index % 13==0)
				System.out.println(index+ " is division by 13");
		}
	}
	
	public static void main(String[] args){
		Assignment13 assignment13 = new Assignment13();
		assignment13.process(5,40);
	}
}
