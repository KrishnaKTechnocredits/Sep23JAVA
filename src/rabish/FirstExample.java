package rabish;

public class FirstExample {

	void processData(int startIndex, int endIndex) {
		for (int i = endIndex; i >= startIndex; i--) {
			if (i % 7 == 0) {
				System.out.println("Number which is divisible by 7 :" + i);
			}
		}
	}

	public static void main(String[] args) {
		FirstExample firstExample = new FirstExample();
		firstExample.processData(1, 100);
	}
}
