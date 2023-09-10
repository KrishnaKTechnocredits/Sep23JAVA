package narendra;

class Assignment11_ToPrintEvenNum {

	void getEvenNumber(int startRange, int endRange) {
		System.out.println("Even numbers are:");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Assignment11_ToPrintEvenNum printevennum = new Assignment11_ToPrintEvenNum();
		printevennum.getEvenNumber(10, 15);
	}
}
