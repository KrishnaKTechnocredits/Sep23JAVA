//Assignment13
package yogesh;
class Division1{

	void div(int start,int end){
		for(int index=end;index>=start;index--)
		{
			if(index%13==0)
			{
				System.out.println(index+"Number is divisible by 13");
			}
			else if(index%7==0)
			{
				System.out.println(index+"Number is divisible by 7");
			}
		}
	}
	
	public static void main(String[] args){
		Division1 division=new Division1();
		division.div(5,40);
	}
}
