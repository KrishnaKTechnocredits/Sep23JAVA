package narendra;

class Assignment16_ToPrintFirst3Numbers {

	void getFirst3Num(int startIndex, int endIndex) {
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		int count = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 3 == 0 && num % 4 == 0 && count < 3) {
				System.out.println(num);
				count++;
			}
		}

	}

	public static void main(String[] args) {
		Assignment16_ToPrintFirst3Numbers printfirst3num = new Assignment16_ToPrintFirst3Numbers();
		printfirst3num.getFirst3Num(10, 500);
	}
}