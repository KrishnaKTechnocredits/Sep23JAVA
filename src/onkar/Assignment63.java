/*1. Count the prime number in range of 50 to 150
2. Do sum of number in range of 50 to 150, only if number is odd & prime
*/
package onkar;

public class Assignment63 {
	
	static boolean isPrime(int num) {
		if (num>1) {
			for (int index=2; index<=Math.sqrt(num); index++) {
				if(num%index == 0)
					return false;
			}
			return true;
		}else
			return false;
	}
	
	void countPrimeNumbers(int startRange, int endRange) {
		int count = 0;
		for (int index=startRange; index<=endRange; index++) {
			boolean flag = isPrime(index);
			if (flag) {
				count++;
			}
		}
		System.out.println("Number of prime numbers in the range "+startRange+" & "+endRange+" are "+count);
	}
	
	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		assignment63.countPrimeNumbers(50, 150);
	}
}
