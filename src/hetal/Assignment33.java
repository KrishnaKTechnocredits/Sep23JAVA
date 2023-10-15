package hetal;

public class Assignment33 {

	int getDifference(int[] arr) {
		int evensum = 0;
		int oddsum = 0;
		int diff = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				evensum = evensum + arr[index];
			} else {
				oddsum = oddsum + arr[index];
			}
		}
		if (evensum >= oddsum)
			diff = evensum - oddsum;
		else
			diff = oddsum - evensum;
		return diff;
	}

	public static void main(String[] args) {
		int[] input = { 10, 3, 44, 33, 35 };
		Assignment33 assignment33 = new Assignment33();
		int output = assignment33.getDifference(input);
		System.out.println(output);
	}
}
