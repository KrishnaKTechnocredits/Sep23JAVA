package subramanium;

public class ReverseExample {

	void processData(int startRange, int endRange) {
		System.out.println("Reverse of given number range divisble by 7 are");
		for (int num = endRange; num >= startRange; num--) {
			if (num % 7 == 0) {
				System.out.println(num);
			}

		}

	}

	public static void main(String[] args) {
		ReverseExample reverseExample = new ReverseExample();
		reverseExample.processData(1, 100);
	}
}
