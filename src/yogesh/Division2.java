//Assignment14
package yogesh;
class Division2{

	void div(int start,int end){
		for(int index=end;index>=start;index--)
		{
			if(index%5==0 && index%9==0)
			{
				System.out.println(index+" is divisible by 5 & 9");
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Division2 division=new Division2();
		division.div(5,100);
	}
}
