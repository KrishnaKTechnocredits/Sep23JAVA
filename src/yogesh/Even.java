//Assignment 11
package yogesh;
class Even{
	
	void evenNum(int startNum,int endNum){
		for(int index=startNum;index<=endNum;index++)
		{
			if(index%2==0)
				System.out.println("Even Number in given series "+startNum+" and "+endNum+" is "+index);
		}
	}
	public static void main(String[] args){
		Even even=new Even();
		even.evenNum(10,15);
	}
}
