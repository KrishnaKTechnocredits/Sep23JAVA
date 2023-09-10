//Assignment15
package yogesh;
class Division3{

	void div(int start,int end){
		int sum=0;
		for(int index=start;index<=end;index++)
		{
			if(index%5==0 && index%10==0)
			{
				sum=sum+index;
			}
		}
			System.out.println("Expected sum is "+sum);
	}
	
	
	public static void main(String[] args){
		Division3 division=new Division3();
		division.div(10,50);
	}
}
