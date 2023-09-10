// On user defined range print first 3 numbers which is divisible by 3 & 4
/*Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
         12
         24
         36*/

package onkar;

class Assignment16{
	
	void findNumbers(int startRange, int endRange){
		int count=0;
		for(int num=startRange; num<=endRange; num++){
			if(num%3==0 && num%4==0){
				System.out.println(num);
				count++;
				if(count==3)
					break;
			}
		}
	}
	
	public static void main(String[] args){
		Assignment16 assignment16 = new Assignment16();
		assignment16.findNumbers(10,100);
	}
}