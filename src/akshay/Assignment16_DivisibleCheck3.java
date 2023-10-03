	 
package akshay;

public class Assignment16_DivisibleCheck3 {
	void divisibleTest(int startIndex, int endIndex) {
		int count = 0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 3 == 0 && index % 4 == 0) {
				count++;
				System.out.println(index);
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment16_DivisibleCheck3 divisible = new Assignment16_DivisibleCheck3();
		divisible.divisibleTest(10, 500);
	}
}
