//Print all the numbers between 1 to 100 which are divisible by 7 in reverse order

package mahesh;

public class ReverseDivBy7 {

	void divBy7(int startRange, int endRange) {
		for (int num = endRange; num>= startRange; num--) {
			if (num % 7 == 0)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		ReverseDivBy7 reverseDivBy7 = new ReverseDivBy7();
		reverseDivBy7.divBy7(1, 100);

	}

}
