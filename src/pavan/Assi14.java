package pavan;

public class Assi14 {
	void test1(int startIndex, int endIndex) {
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 5 == 0 && index % 9 == 0) {
				System.out.println("last Number is Divisible by 5 and 9 is " + index);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assi14 assi14 = new Assi14();
		assi14.test1(5, 100);
	}
}
