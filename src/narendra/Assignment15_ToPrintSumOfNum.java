package narendra;

class Assignment15_ToPrintSumOfNum {

	void getSumOfNum(int startIndex, int endIndex) {
		int sum = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 10 == 0) {
				sum = sum + num;
			}
		}
		System.out.println("Expected sum is " + sum);
	}

	public static void main(String[] args) {
		Assignment15_ToPrintSumOfNum printsumofnum = new Assignment15_ToPrintSumOfNum();
		printsumofnum.getSumOfNum(10, 50);
	}
}