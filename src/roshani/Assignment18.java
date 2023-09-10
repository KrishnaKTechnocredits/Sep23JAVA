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
				Average = 70*/
package roshani;

class Assignment18{

	void processData(int startIndex, int endIndex){
		
		int sum = 0;
		int average = 0;
		int count = 0;
		
		System.out.println("\nIn the range of " + startIndex + " to " + endIndex + ", numbers which are divisible by 5 and 7 are:");
		for(int num = startIndex; num <= endIndex; num++){
			if(num % 5 == 0 && num % 7 == 0){
				System.out.println(num);
				count++;
				sum = sum + num;
			}		
		}
		
		if (sum != 0 && count != 0){
			average = sum/count;
		}
		System.out.println("\nFound "+ count + " numbers.");
		System.out.println("\nSum of these 3 numbers is: "+ sum);
		System.out.println("\nAverage is: " + average);
	}
	
	public static void main(String[] args){
		Assignment18 assignment18 = new Assignment18();
		assignment18.processData(1,110);	
	}
}