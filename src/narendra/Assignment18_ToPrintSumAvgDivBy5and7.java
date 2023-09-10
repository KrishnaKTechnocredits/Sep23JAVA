package narendra;

class Assignment18_ToPrintSumAvgDivBy5and7 {

	void getSumandAvgDivBy5and7(int startIndex, int endIndex) {
		int count = 0;
		int sum = 0;
		System.out.println("Numbers which are divible by 5 & 7 are: ");
		for (int num = startIndex; num <= endIndex; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
				count = count + 1;
				sum = sum + num;
			}
		}
		System.out.println("Found " + count + " numbers which are  divisible by 5 and 7");
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (sum / count));
	}

	public static void main(String[] args) {
		Assignment18_ToPrintSumAvgDivBy5and7 toprintsumavgdivby5anf7 = new Assignment18_ToPrintSumAvgDivBy5and7();
		toprintsumavgdivby5anf7.getSumandAvgDivBy5and7(1, 110);
	}
}