//Assignment18
package yogesh;
class Division6{

	void div(int start,int end){
		int sum=0;
		int count=0;
		System.out.println("Numbers are ");
		for(int num=start;num<=end;num++)
		{
			if(num%5==0 && num%7==0)
			{
				System.out.println(num);
				sum=sum+num;
				count=count+1;
			}
		}
			System.out.println("Sum of 3 numbers divisible by 5 & 7 is "+sum);
			int avg=sum/count;
			System.out.println("Average is "+avg);
	}
	
	public static void main(String[] args){
		Division6 division=new Division6();
		division.div(1,110);
	}
}
	