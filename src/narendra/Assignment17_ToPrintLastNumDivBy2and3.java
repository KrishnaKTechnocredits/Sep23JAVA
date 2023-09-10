package narendra;

class Assignment17_ToPrintLastNumDivBy2and3 {

	void getLastNumbersDivBy2and3(int startIndex, int endIndex) {
		int count = 0;
		System.out.println("2nd, 3rd and 4th last numbers divisible by 2 & 3 are: ");
		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 2 == 0 && num % 3 == 0) {
				count = count + 1;
				if (count > 1) {
					System.out.println(num);
					if (count > 3)
						break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment17_ToPrintLastNumDivBy2and3 toprintlastnumdivby2and3 = new Assignment17_ToPrintLastNumDivBy2and3();
		toprintlastnumdivby2and3.getLastNumbersDivBy2and3(10, 100);
	}
}