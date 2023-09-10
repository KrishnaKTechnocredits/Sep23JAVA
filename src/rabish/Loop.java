package rabish;
//Assignment 11
class Loop {
	
	void startLoop(int startIndex,int endIndex){
		for(int i=startIndex;i<=endIndex;i++)
			if(i%2==0)
				System.out.println("Even Numbers are "+ i);
		
	}
	
	public static void main(String[] args){
		Loop loop=new Loop();
		loop.startLoop(10,15);
	}
}