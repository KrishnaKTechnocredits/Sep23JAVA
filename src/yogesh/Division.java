package yogesh;

class Division{
	
	void div(int start,int end){
		for(int index=start;index<=end;index++)
		{
			if(index%5==0 && index%3==0)
			{
				System.out.println("Numbers divisible by 5 & 3 are"+index);
			}
		}
	}
	
	public static void main(String[] args){
		Division division=new Division();
		division.div(5,40);
	}
}