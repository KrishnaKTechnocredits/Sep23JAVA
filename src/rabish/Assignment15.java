package rabish;
class Assignment15 {

int sum=0;
	void revLoop(int startIndex,int endIndex){
		 for(int i=startIndex;i<=endIndex;i++)
			if(i%5==0 && i%10==0 )
				{
					System.out.println(i+" is divisible by 5");
					sum=sum+i;
					//System.out.println("Total Sum = "+sum);
				}
				System.out.println("Total Sum = "+sum);
					
			}
			
		public static void main(String[] args){
			Assignment15 loop3=new Assignment15();
			loop3.revLoop(10,50);
			
		}
}