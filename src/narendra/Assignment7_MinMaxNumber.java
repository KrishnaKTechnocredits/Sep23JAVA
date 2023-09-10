package narendra;

class Assignment7_MinMaxNumber {

	void toFindMaxNum(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is bigger between " + num1 + " & " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is bigger between " + num1 + " & " + num2);
		} else {
			System.out.println("Entered numbers are equal");
		}
	}

	void toFindMinNum(int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " is smaller between " + num1 + " & " + num2);
		} else if (num2 < num1) {
			System.out.println(num2 + " is smaller between " + num1 + " & " + num2);
		} else {
			System.out.println("Entered numbers are equal");
		}
	}

	public static void main(String[] args) {
		Assignment7_MinMaxNumber minmaxnum = new Assignment7_MinMaxNumber();
		minmaxnum.toFindMaxNum(10, 20);
		minmaxnum.toFindMaxNum(100, 50);
		minmaxnum.toFindMaxNum(300, 300);
		minmaxnum.toFindMinNum(15, 25);
		minmaxnum.toFindMinNum(200, 150);
		minmaxnum.toFindMinNum(400, 400);
	}
}
