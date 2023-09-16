package shrutika;

public class SumOfDigit {

	void CharFreqSumOfDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				int num = Character.getNumericValue(input.charAt(index));
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOfDigit sumOfDigit = new SumOfDigit();
		sumOfDigit.CharFreqSumOfDigit("Rah5ulTEC6Hnoc2redItS");
	}

}
