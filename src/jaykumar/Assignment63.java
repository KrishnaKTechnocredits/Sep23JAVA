/*Assignment - 63 : 22nd Oct'2023
1. Count the prime number in range of 50 to 150
2. Do sum of number in range of 50 to 150, only if number is odd & prime*/

package jaykumar;

public class Assignment63 {
	
	boolean isprimeNumber(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	void primeNumberCountSum() {
		int count = 0;
		int sum = 0;
		for(int num=50; num<=150; num++) {
			if(this.isprimeNumber(num)) {
				count++;
				sum += num;
			}
		}
		System.out.println("Total prime numbers in range 50-150 are: "+count);
		System.out.println("Sum of prime numbers in range 50-150 is: "+sum);
	}

	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		assignment63.primeNumberCountSum();
	}
}
