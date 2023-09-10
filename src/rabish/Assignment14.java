package rabish;
class Assignment14 {
	void revLoop(int startIndex,int endIndex){
		 for(int i=endIndex;i>=startIndex;i--)
			if(i%5==0 && i%9==0 )
				{
					System.out.println(i+" is divisible by 5 & 9");
					break;
				}
				}
			
		public static void main(String[] args){
			Assignment14 loop3=new Assignment14();
			loop3.revLoop(5,100);
		}
	}