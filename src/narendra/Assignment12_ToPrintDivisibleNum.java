package narendra;

class Assignment12_ToPrintDivisibleNum {

	void getDivsibleByNum(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Assignment12_ToPrintDivisibleNum printdivbynum = new Assignment12_ToPrintDivisibleNum();
		printdivbynum.getDivsibleByNum(5, 40);
	}
}