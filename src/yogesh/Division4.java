//Assignment16
package yogesh;
class Division4{

	void div(int start,int end){
		int count=0;
		System.out.println("First three numbers divisible by 3 & 4 in range "+start+" & " +end+ "is");
		for(int index=start;index<=end;index++)
		{
			if(index%3==0 && index%4==0 && count<3)
			{
					count=count+1;
					System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		Division4 division=new Division4();
		division.div(10,500);
	}
}
