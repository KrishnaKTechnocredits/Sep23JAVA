package pavan;

class Assi17 {
	void test(int startIndex, int endIndex) {
		int count = 1;
		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 2 == 0 && num % 3 == 0) {
				if (count >= 2 && count <= 4) {
					System.out.println(num);
				}
				count++;
			}
		}
	}

	public static void main(String[] args) {
		Assi17 assi17 = new Assi17();
		assi17.test(10, 100);
	}
}
