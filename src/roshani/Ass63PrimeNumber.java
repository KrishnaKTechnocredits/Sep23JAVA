/*1. Count the prime number in range of 50 to 150
2. Do sum of number in range of 50 to 150, only if number is odd & prime
*/
package roshani;

public class Ass63PrimeNumber{

	boolean isPrime(int num){
		for(int index = 2; index < num/2; index++){
			if(num % index == 0){
				return false;
			}
		}
		System.out.print(num + ",");
		return true;
	}
	
	void primeNumberCount(int startRange, int endRange){
		int count = 0;
		int sum = 0; 
		for(int index = startRange; index <= endRange; index++){
			if(isPrime(index)){
				count++;
				sum = sum + index;
			}
		}
		System.out.println("\nNo. of prime numbers in the range of "+ startRange + " to " + endRange +" are: " + count);
		System.out.println("\nSum of prime numbers in range of "+ startRange + " to " + endRange + " are: " + sum);
	}
	
	public static void main(String[] args){
		Ass63PrimeNumber assignment63 = new Ass63PrimeNumber();
		assignment63.primeNumberCount(50,150);
	}
}