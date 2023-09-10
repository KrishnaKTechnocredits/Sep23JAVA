//print all even numbers in a user defined range.
/*Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14*/
package onkar;

class Assignment11{
	
	void findEvenNumber(int startIndex, int endIndex){
		System.out.println("Even numbers are");
		for(int num=startIndex; num<=endIndex; num++){
			if (num%2 == 0)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		Assignment11 assignment11 = new Assignment11();
		assignment11.findEvenNumber(10,15);
	}
}