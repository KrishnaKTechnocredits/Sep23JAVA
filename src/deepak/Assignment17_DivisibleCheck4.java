/*Assignment-17 : 8th Sep'2023
On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
              84		 
	      78
*/

package deepak;

class Assignment17_DivisibleCheck4 {
	void divisibleTest(int startIndex, int endIndex) {
		System.out.println("Input Range : "+startIndex+" to "+endIndex);
		System.out.println("Output : ");
		int count = 0;
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 == 0 && index % 3 == 0) {
				count++;
				if (count > 1 && count <= 4)
					System.out.println(index);
			}
			if (count == 4)
				break;
		}
	}

	public static void main(String[] args) {
		Assignment17_DivisibleCheck4 divisible = new Assignment17_DivisibleCheck4();
		divisible.divisibleTest(10, 100);
	}
}