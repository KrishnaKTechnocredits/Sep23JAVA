//Assignment - 63 : 22nd Oct'2023
//
//1. Count the prime number in range of 50 to 150
//2. Do sum of number in range of 50 to 150, only if number is odd & prime
//
package yogesh;

public class Yogesh_Assignment63 {

	boolean prime(int num) {

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int sum = 0;
		Yogesh_Assignment63 assignment63 = new Yogesh_Assignment63();
		System.out.println("Prime numbers between 50 to 150 are:--");
		for (int i = 50; i <= 150; i++) {
			if (assignment63.prime(i))
				System.out.println(i);
			sum += i;
		}
		System.out.println("Sum of prime numbers between 50 to 150 is:--" + sum);
	}

}
