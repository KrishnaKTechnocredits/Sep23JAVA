package naresh;

/*Assignment - 16 : 7th Sep'2023		 
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
         12
         24
        /36	*/
		
class Practise6{
	
	void userDefined(int startIndex ,int endIndex){
		int index;
		int count=0;
		System.out.println("First 3 numbers divisible by 3 & 4 :");
	    for(index =startIndex ; index<=endIndex; index++){
			
			if(index%3==0 && index%4==0){
			 System.out.println(index);
			 count=count+1;
			if (count==3){
			    break;
			}	
		}
	}		
}
	public static void main(String[] args){
	Practise6 practise6 =new Practise6();
	practise6.userDefined(10,500);
	}
}