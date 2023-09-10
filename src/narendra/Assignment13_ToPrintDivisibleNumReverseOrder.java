package narendra;

class Assignment13_ToPrintDivisibleNumReverseOrder {

	void getDivsibleByNumRevOrder(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 7 == 0) {
				System.out.println(num + " is divisible by 7");
			}
			if (num % 13 == 0) {
				System.out.println(num + " is divisible by 13");
			}
		}
	}

	public static void main(String[] args) {
		Assignment13_ToPrintDivisibleNumReverseOrder printdivbynumrevorder = new Assignment13_ToPrintDivisibleNumReverseOrder();
		printdivbynumrevorder.getDivsibleByNumRevOrder(5, 40);
	}
}