//Assignment 11

package mayank;


class Even{
	void evenNumbers(int startIndex,int endIndex){
		for(int num=startIndex;num<=endIndex;num++){
			if(num%2==0){
				System.out.println(num);
			}
		}
		System.out.println("Above are Even numbers from 10 to 15");
	}
	public static void main(String[] args){
		Even even = new Even();
		even.evenNumbers(10,15);
	}
	

}