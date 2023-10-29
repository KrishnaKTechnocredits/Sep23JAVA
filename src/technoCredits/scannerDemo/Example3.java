package technoCredits.scannerDemo;

public class Example3 {
	
	int getDigitSum(String str) {
		// implement logic here
		return 0;
	}
	
	void printDigitSumFromArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index] + "->" + getDigitSum(arr[index]));
		}
	}
}
