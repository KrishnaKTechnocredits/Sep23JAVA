//Assignment 13
package rabish;

class Assignment13 {
	void revLoop(int startIndex,int endIndex){
		 for(int i=endIndex;i>=startIndex;i--)
			if(i%7==0)
				{
					System.out.println(i+" is divisible by 7");
				}
				else if (i%13==0){
					System.out.println(i+" is divisible by 13");
				}
			}
		public static void main(String[] args){
			Assignment13 loop3=new Assignment13();
			loop3.revLoop(5,40);
		}
}
