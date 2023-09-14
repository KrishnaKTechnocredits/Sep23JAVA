/*Assignment-18 : 8th Sep'2023
On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
                35
		 70
                105
		 Found 3 numbers which are divible by 5 & 7.
		 sum = 210
		 Avearge = 70
*/

package deepak;

class Assignment18_DivisibleCheck5{
	int sum = 0;
	int count = 0;
	void divisibleTest(int startRange, int endRange){
		System.out.println("Input Range : "+startRange+" to "+endRange);
		System.out.println("Numbers divisible by 5 and 7 in the given Range are: ");
		for(int index = startRange ; index <= endRange ; index++){
			if(index % 5 == 0 && index % 7 == 0){
				count++;
				sum = sum + index;
				System.out.println(index);
			}
		}
	}
	
	void result(){
		System.out.println("Found "+count+" numbers which are divisible by 5 and 7 in the given range");
		System.out.println("Sum: "+sum);	
		System.out.println("Average: "+sum/count);
	}
	
	public static void main(String[] args){
		Assignment18_DivisibleCheck5 divisible = new Assignment18_DivisibleCheck5();
		divisible.divisibleTest(1, 110);
		divisible.result();
	}
}